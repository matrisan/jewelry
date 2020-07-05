package com.github.jewelry.manager;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jewelry.pojo.bo.DetailBO;
import com.github.jewelry.pojo.orm.JewelryPriceDO;
import com.github.jewelry.repository.IJewelryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.websocket.ClientEndpoint;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

import static com.github.jewelry.constant.IJewelryPriceConstant.SUCCESS;

/**
 * @author 石少东
 * @date 2020-07-03 22:50
 * @since 1.0
 */

@Slf4j
@Component
@ClientEndpoint
@RequiredArgsConstructor
public class JewelryPriceManager {

    private Session session;

    private final IJewelryRepository repository;

    private final AtomicBoolean atomicBoolean;

    private final ObjectMapper objectMapper;

    @OnOpen
    public void open(Session session) {
        this.session = session;
    }

    @OnMessage
    public void onMessage(String message) {
        try {
            atomicBoolean.set(false);
            TypeReference<Map<String, DetailBO>> typeReference = new TypeReference<Map<String, DetailBO>>() {
            };
            Map<String, DetailBO> map = objectMapper.readValue(message, typeReference);
            JewelryPriceDO price = repository.save(JewelryPriceDO.builder().details(map).build());
            log.info("保存数据 - {} - {}", new Date().toString(), price.toString());
        } catch (JsonProcessingException e) {
            if (!StringUtils.contains(message, SUCCESS)) {
                atomicBoolean.set(true);
                log.error("时间 - {} - 数据 - {}", new Date().toString(), message);
            } else {
                log.warn("第一次运行 - {}", message);
            }
        }
    }

    @OnClose
    public void onClose() {
        System.out.println("Websocket closed");
    }

    /**
     * 发送客户端消息到服务端
     *
     * @param message 消息内容
     */
    public void send(String message) {
        this.session.getAsyncRemote().sendText(message);
    }


}

package com.github.jewelry.schedule;

import com.github.jewelry.manager.JewelryPriceManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.WebSocketContainer;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author 石少东
 * @date 2020-07-02 22:29
 * @since 1.0
 */

@Slf4j
@Component
@RequiredArgsConstructor
public class JewelryPriceSchedule {

    private final JewelryPriceManager client;

    private final RestTemplate restTemplate;

    private final AtomicBoolean atomicBoolean;

    private final WebSocketContainer container = ContainerProvider.getWebSocketContainer();

    @Scheduled(fixedRate = 5000)
    public void getAllData() throws URISyntaxException, IOException, DeploymentException {
        if (atomicBoolean.get()) {
            container.connectToServer(client, new URI("ws://120.24.164.224:8891/"));
            String url = "http://www.yihaozuan.com/index.php?m=GoldCloud&c=Show&a=Index&store_id=155&gstore_id=155";
            String result = restTemplate.getForObject(url, String.class);
            String key = StringUtils.substringBetween(result, "window.key='", "';");
            log.info("开始执行 - {} - {}", new Date().toString(), key);
            client.send(key);
        }
    }

}

package com.github.jewelry.event.listener;

import com.github.jewelry.pojo.BaseEntity;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeSaveEvent;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author 石少东
 * @date 2020-07-04 23:21
 * @since 1.0
 */

@Slf4j
@Component
public class BeforeSaveListener extends AbstractMongoEventListener<BaseEntity> {

    @Override
    public void onBeforeSave(@NotNull BeforeSaveEvent<BaseEntity> event) {
        Date date = new Date();
        event.getSource().setExpire(date);
        log.debug("设置过期时间 - {}", date.toString());
    }

}

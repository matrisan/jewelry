package com.github.jewelry.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author 石少东
 * @date 2020-07-03 23:05
 * @since 1.0
 */


public class StartEvent extends ApplicationEvent {

    public StartEvent(Object source) {
        super(source);
    }
}

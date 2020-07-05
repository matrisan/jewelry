package com.github.jewelry.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author 石少东
 * @date 2020-07-03 22:55
 * @since 1.0
 */


@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public AtomicBoolean atomicBoolean(){
        return new AtomicBoolean(true);
    }


}

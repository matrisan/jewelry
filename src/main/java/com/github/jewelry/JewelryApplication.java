package com.github.jewelry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * @author shao
 */
@EnableAsync
@EnableScheduling
@EnableJpaAuditing
@SpringBootApplication
public class JewelryApplication {

    public static void main(String[] args) {
        SpringApplication.run(JewelryApplication.class, args);
    }

}

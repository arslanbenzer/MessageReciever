package com.ali.messagereciever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MessageReceiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageReceiverApplication.class, args);
    }

}

package com.ali.messagereciever.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue messageQueue() {
        return new Queue("message_queue", true); // Durable queue
    }
}

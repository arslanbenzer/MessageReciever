package com.ali.messagereciever.config;

import com.ali.messagereciever.entity.Message;
import com.ali.messagereciever.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import java.sql.Timestamp;

@Component
@RequiredArgsConstructor
public class RabbitMQListener {

    private final MessageService messageService;

    @RabbitListener(queues = "message_queue")
    public void listen(String in) {
        System.out.println("Message read from message_queue : " + in);
        JSONObject json = new JSONObject(in);

        int value = json.getInt("value");
        String hash = json.getString("hash");
        Timestamp timestamp = new Timestamp(json.getLong("timestamp"));

        Message message = new Message(null, timestamp, value, hash);
        messageService.insertMessage(message);
    }
}

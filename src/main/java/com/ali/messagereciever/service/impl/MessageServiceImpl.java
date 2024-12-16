package com.ali.messagereciever.service.impl;

import com.ali.messagereciever.entity.Message;
import com.ali.messagereciever.repository.MessageRepository;
import com.ali.messagereciever.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    public void insertMessage(Message message) {
        messageRepository.save(message);
    }
}

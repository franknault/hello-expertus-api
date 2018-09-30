package com.nault.helloexpertusapi.service;

import com.nault.helloexpertusapi.model.Message;
import com.nault.helloexpertusapi.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService implements IMessageService {

    @Autowired
    private MessageRepository repo;

    @Override
    public Message findByLanguage(String language) {
        return repo.findByLanguage(language);
    }
}

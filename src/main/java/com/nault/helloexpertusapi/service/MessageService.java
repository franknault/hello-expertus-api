package com.nault.helloexpertusapi.service;

import com.nault.helloexpertusapi.Configuration;
import com.nault.helloexpertusapi.model.Message;
import com.nault.helloexpertusapi.repository.MessageRepository;
import com.nault.helloexpertusapi.strategy.PersistanceContext;
import com.nault.helloexpertusapi.strategy.PersistanceStrategy;
import com.nault.helloexpertusapi.utils.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Spring service to process request and execute the right strategy.
 */
@Service
public class MessageService implements IMessageService {

    private static final String TEMPLATE = "%s, Expertus!";

    @Autowired
    private PersistanceContext context;

    @Override
    public Message findByLanguage(String language) {
        Message message = context.findByLanguage(language);
        message.setValue(String.format(TEMPLATE, message.getValue()));
        return message;
    }
}

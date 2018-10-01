package com.nault.helloexpertusapi.service;

import com.nault.helloexpertusapi.Configuration;
import com.nault.helloexpertusapi.model.Message;
import com.nault.helloexpertusapi.repository.MessageRepository;
import com.nault.helloexpertusapi.strategy.PersistanceContext;
import com.nault.helloexpertusapi.utils.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Spring service to process request and execute the right strategy.
 */
@Service
public class MessageService implements IMessageService {

    @Autowired
    private PersistanceContext context;

    @Autowired
    private Configuration config;

    @Autowired
    private Validator validator;

    @Autowired
    private MessageRepository repo;

    @Override
    public Message findByLanguage(String language) {
        if (!validator.validate(language)) {
            Message message = context.findByLanguage(language);
            if (message == null) {
                return repo.findByLanguage(config.getDefaultLang());
            }
            return message;
        }

        return repo.findByLanguage(language);
    }
}

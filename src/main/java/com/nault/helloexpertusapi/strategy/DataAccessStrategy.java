package com.nault.helloexpertusapi.strategy;

import com.nault.helloexpertusapi.Configuration;
import com.nault.helloexpertusapi.model.Message;
import com.nault.helloexpertusapi.repository.MessageRepository;
import com.nault.helloexpertusapi.utils.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("dao")
public class DataAccessStrategy implements PersistanceStrategy {

    @Resource(name = "googleApi")
    private PersistanceStrategy nextStrategy;

    @Autowired
    private MessageRepository repo;

    @Autowired
    private Validator validator;

    @Autowired
    private Configuration config;

    @Override
    public Message findByLanguage(String language) {
        System.out.println("Trying to find data in DB");
        if (!validator.validate(language)) {
            Message message = nextStrategy.findByLanguage(language);
            // If last strategy wasn't able to find it, send default
            if (message == null) {
                return repo.findByLanguage(config.getDefaultLang());
            }
            return message;
        }
        // Normal operation
        return repo.findByLanguage(language);
    }
}

package com.nault.helloexpertusapi.strategy;

import com.nault.helloexpertusapi.Configuration;
import com.nault.helloexpertusapi.model.Message;
import com.nault.helloexpertusapi.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Simple example of what the implemented strategy can do. We could add a Redis system and store the more recent
 * access data in-memory to futur quick retrieve.
 */
@Component("cache")
public class CacheStrategy implements PersistanceStrategy {

    @Resource(name = "dao")
    private PersistanceStrategy nextStrategy;

    @Autowired
    private Configuration config;

    @Override
    public Message findByLanguage(String language) {
        System.out.println("Trying to find data in cache");
        if (language != null) {
            // Cache not implemented, so we go to the next strategy
            return nextStrategy.findByLanguage(language);
        }
        return null;
    }
}

package com.nault.helloexpertusapi.strategy;

import com.nault.helloexpertusapi.model.Message;

/**
 * Simple example of what the implemented strategy can do. We could add a Redis system and store the more recent
 * access data in-memory to futur quick retrieve.
 */
public class CacheStrategy implements PersistanceStrategy {

    @Override
    public Message findByLanguage(String Language) {
        return null;
    }
}

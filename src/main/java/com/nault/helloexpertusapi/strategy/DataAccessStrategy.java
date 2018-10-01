package com.nault.helloexpertusapi.strategy;

import com.nault.helloexpertusapi.model.Message;

public class DataAccessStrategy implements PersistanceStrategy {

    protected PersistanceStrategy nextStrategy = new GoogleApiStrategy();

    @Override
    public Message findByLanguage(String Language) {
        return null;
    }
}

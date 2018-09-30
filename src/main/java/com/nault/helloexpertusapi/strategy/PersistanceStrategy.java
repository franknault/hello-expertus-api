package com.nault.helloexpertusapi.strategy;

import com.nault.helloexpertusapi.model.Message;

public interface PersistanceStrategy {
    Message findByLanguage(String Language);
}

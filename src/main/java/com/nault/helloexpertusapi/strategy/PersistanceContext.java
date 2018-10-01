package com.nault.helloexpertusapi.strategy;

import com.nault.helloexpertusapi.model.Message;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Represent the strategy context. By default, it uses the GoogleApiStrategy.
 */
@Component
public class PersistanceContext {

    @Resource(name = "cache")
    private PersistanceStrategy strategy;

    public void setStrategy(PersistanceStrategy strategy) {
        this.strategy = strategy;
    }

    public Message findByLanguage(String language) {
        return this.strategy.findByLanguage(language);
    }
}

package com.nault.helloexpertusapi.strategy;

import com.nault.helloexpertusapi.model.Message;
import org.springframework.stereotype.Component;

/**
 * Represent the strategy context. By default, it uses the GoogleApiStrategy.
 */
@Component
public class PersistanceContext {

    private PersistanceStrategy strategy = new GoogleApiStrategy();

    public void setStrategy(PersistanceStrategy strategy) {
        this.strategy = strategy;
    }

    public Message findByLanguage(String language) {
        return this.strategy.findByLanguage(language);
    }
}

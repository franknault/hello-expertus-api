package com.nault.helloexpertusapi.strategy;

import com.nault.helloexpertusapi.model.Message;
import com.nault.helloexpertusapi.utils.Translator;

/**
 * Strategy to have a fallback if a request language is not supported by the system (AKA not in the DB). This class
 * send a request to a translation API with the desired language and the message.
 */
public class GoogleApiStrategy implements PersistanceStrategy {

    @Override
    public Message findByLanguage(String language) {
        try {
            String text = Translator.getInstance().callUrlAndParseResult(
                    "en",
                    language,
                    "Hello, Expertus!");

            // Generic ID since it's not inserted in the DB
            Message message = new Message( 99L, text, language);
            return message;
        } catch (Exception e) {
            // In case of an error, returning null will result in displaying the default language : "en"
            return null;
        }

    }
}

package com.nault.helloexpertusapi.strategy;

import com.nault.helloexpertusapi.model.Message;
import com.nault.helloexpertusapi.utils.Translator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Strategy to have a fallback if a request language is not supported by the system (AKA not in the DB). This class
 * send a request to a translation API with the desired language and the message.
 */
@Component("googleApi")
public class GoogleApiStrategy implements PersistanceStrategy {

    @Autowired
    private Translator translator;

    @Override
    public Message findByLanguage(String language) {
        System.out.println("Trying to find data in Google API");
        try {
            String text = translator.callUrlAndParseResult(
                    "en",
                    language,
                    "Hello");
            System.out.println(text);

            // Generic ID since it's not inserted in the DB
            Message message = new Message( 99L, text, language);
            return message;
        } catch (Exception e) {
            // In case of an error, returning null will result in displaying the default language : "en"
            return null;
        }
    }
}

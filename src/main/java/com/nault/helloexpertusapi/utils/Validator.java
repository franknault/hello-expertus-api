package com.nault.helloexpertusapi.utils;

import com.nault.helloexpertusapi.model.LanguageEnum;
import org.springframework.stereotype.Component;

/**
 * Component to validate if the language is valid according to what is set in the enum (what is supported).
 */
@Component
public class Validator {

    /**
     *  Verify if the api can process a specific language.
     *
     * @param language The language in the ISO-639-1 format
     * @return true if it can be process by the app
     */
    public boolean validate(String language) {

        if (language != null || language != "") {
            for (LanguageEnum lan : LanguageEnum.values()) {
                if (lan.getValue().equals(language)) {
                    return true;
                }
            }
        }
        return false;
    }
}

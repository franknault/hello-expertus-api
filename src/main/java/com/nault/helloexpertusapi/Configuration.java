package com.nault.helloexpertusapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("configuration")
public class Configuration {

    @Autowired
    private Environment env;

    public String getDefaultLang() {
        return env.getProperty("default.language");
    }

    public String getDefaultWord() {
        return env.getProperty("default.word");
    }
}

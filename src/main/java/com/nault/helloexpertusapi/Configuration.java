package com.nault.helloexpertusapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Configuration {

    @Autowired
    private Environment env;

    public String getDefaultLang() {
        String config = env.getProperty("default.language");
        System.out.println(config);
        return config;
    }
}

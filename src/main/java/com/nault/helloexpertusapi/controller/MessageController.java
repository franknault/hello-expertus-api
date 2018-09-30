package com.nault.helloexpertusapi.controller;

import com.nault.helloexpertusapi.model.Message;
import com.nault.helloexpertusapi.service.IMessageService;
import com.nault.helloexpertusapi.utils.Translator;
import com.nault.helloexpertusapi.utils.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private static final String DEFAUL_LANGUAGE = "en";

    @Autowired
    private IMessageService messageService;

    @Autowired
    private Translator translator;



    @GetMapping("/api/message")
    public Message getMessage(@RequestParam("language") String language) {

        return messageService.findByLanguage(language);
    }
}

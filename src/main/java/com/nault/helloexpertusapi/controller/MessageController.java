package com.nault.helloexpertusapi.controller;

import com.nault.helloexpertusapi.model.Message;
import com.nault.helloexpertusapi.repository.MessageRepository;
import com.nault.helloexpertusapi.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private IMessageService messageService;

    private static final String DEFAUL_LANGUAGE = "English";
    private static final String TEMPLATE = "%s Expertus";

    @GetMapping("/api/message")
    public Message getMessage(@RequestParam("language") String language) {
        if (language == "" || language == null) {
            return messageService.findByLanguage(DEFAUL_LANGUAGE);
        } else {
            return messageService.findByLanguage(language);
        }
    }
}

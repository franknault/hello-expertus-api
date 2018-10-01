package com.nault.helloexpertusapi.controller;

import com.nault.helloexpertusapi.model.Message;
import com.nault.helloexpertusapi.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring controller for messages endpoints. It acts as a Front Controller.
 */
@RestController
public class MessageController {

    @Autowired
    private IMessageService messageService;

    /**
     * Take the query param "language" : ../api/message?language=.. and return the translated message.
     *
     * @param language Language to retrieve the message
     * @return JSON format of the translated message
     */
    //@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/api/message")
    public Message getMessage(@RequestParam("language") String language) {

        return messageService.findByLanguage(language);
    }
}

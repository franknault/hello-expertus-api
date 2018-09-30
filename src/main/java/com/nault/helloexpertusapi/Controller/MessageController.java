package com.nault.helloexpertusapi.Controller;

import com.nault.helloexpertusapi.Model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private static final String TEMPLATE = "%s Expertus";

    @GetMapping("/message")
    public Message getMessage() {
        return new Message(1, String.format(TEMPLATE, "Hello"));
    }
}

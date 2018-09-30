package com.nault.helloexpertusapi.service;

import com.nault.helloexpertusapi.model.Message;

public interface IMessageService {

    public Message findByLanguage(String langauge);
}

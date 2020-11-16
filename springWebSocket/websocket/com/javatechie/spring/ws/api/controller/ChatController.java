// 
// Decompiled by Procyon v0.5.36
// 

package com.javatechie.spring.ws.api.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController
{
    private final SimpMessagingTemplate template;
    
    @Autowired
    ChatController(final SimpMessagingTemplate template) {
        this.template = template;
    }
    
    @MessageMapping({ "/send/message" })
    public void onReceivedMessage(final String message) {
        this.template.convertAndSend((Object)"/chat", (Object)message);
    }
}

// 
// Decompiled by Procyon v0.5.36
// 

package com.javatechie.spring.ws.api.config;

import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WsConfig implements WebSocketMessageBrokerConfigurer
{
    public void registerStompEndpoints(final StompEndpointRegistry registry) {
        registry.addEndpoint(new String[] { "/socket" }).setAllowedOrigins(new String[] { "*" }).withSockJS();
    }
    
    public void configureMessageBroker(final MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes(new String[] { "/app" }).enableSimpleBroker(new String[] { "/chat" });
    }
}

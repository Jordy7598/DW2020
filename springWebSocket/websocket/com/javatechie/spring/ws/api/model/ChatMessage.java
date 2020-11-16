// 
// Decompiled by Procyon v0.5.36
// 

package com.javatechie.spring.ws.api.model;

public class ChatMessage
{
    private String content;
    private String sender;
    private MessageType type;
    
    public String getContent() {
        return this.content;
    }
    
    public void setContent(final String content) {
        this.content = content;
    }
    
    public String getSender() {
        return this.sender;
    }
    
    public void setSender(final String sender) {
        this.sender = sender;
    }
    
    public MessageType getType() {
        return this.type;
    }
    
    public void setType(final MessageType type) {
        this.type = type;
    }
    
    public enum MessageType
    {
        public static final MessageType CHAT;
        public static final MessageType LEAVE;
        public static final MessageType JOIN;
        
        public static MessageType valueOf(final String name) {
            return Enum.valueOf(MessageType.class, name);
        }
        
        static {
            MessageType.CHAT = new MessageType("CHAT", 0);
            MessageType.LEAVE = new MessageType("LEAVE", 1);
            MessageType.JOIN = new MessageType("JOIN", 2);
            MessageType.$VALUES = new MessageType[] { MessageType.CHAT, MessageType.LEAVE, MessageType.JOIN };
        }
    }
}

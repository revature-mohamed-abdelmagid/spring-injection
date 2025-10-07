package com.revature.ioc;

public class MessageSender {
    
    private MessageService messageService;

    // Setter for Dependency Injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage() {
        messageService.sendMessage();
    }
}

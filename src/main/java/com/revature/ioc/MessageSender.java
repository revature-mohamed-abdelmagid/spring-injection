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

    public void initmethod() {
        System.out.println("Bean is going through init.");
    }

    public void destroymethod() {
        System.out.println("Bean is going through destroy.");
    }
}

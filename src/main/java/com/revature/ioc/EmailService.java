package com.revature.ioc;

public class EmailService implements MessageService {
    @Override
    public String getMessage() {
        return "This is an Email message.";
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending Email: " + getMessage());
    }

}

package com.revature.ioc;

public class SmsService implements MessageService {
    @Override
    public String getMessage() {
        return "This is an SMS message.";
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending SMS: " + getMessage());
    }

}

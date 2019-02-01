package com.rits.creationalpattern.servicelocator;

/**
 * @author Ritesh
 * @Created On 1/2/19
 */
public class EmailService implements MessageService {
    @Override
    public String getMessageBody() {
        return "Message from email";
    }

    @Override
    public String getServiceName() {
        return "EmailService";
    }
}

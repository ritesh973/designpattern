package com.rits.creationalpattern.servicelocator;

/**
 * @author Ritesh
 * @Created On 1/2/19
 */
public class SmsService implements MessageService {
    @Override
    public String getMessageBody() {
        return "Message from Sms Service";
    }

    @Override
    public String getServiceName() {
        return "SMSService";
    }
}

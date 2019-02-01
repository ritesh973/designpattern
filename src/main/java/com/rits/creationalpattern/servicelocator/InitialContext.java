package com.rits.creationalpattern.servicelocator;

/**
 * @author Ritesh
 * @Created On 1/2/19
 */
public class InitialContext {

    public Object lookup(String serviceName) {
        if (serviceName.equalsIgnoreCase("EmailService")) {
            return new EmailService();
        } else if (serviceName.equalsIgnoreCase("SMSService")) {
            return new SmsService();
        }
        return null;
    }
}

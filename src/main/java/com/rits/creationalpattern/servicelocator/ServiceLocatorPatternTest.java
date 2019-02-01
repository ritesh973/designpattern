package com.rits.creationalpattern.servicelocator;

/**
 * @author Ritesh
 * @Created On 1/2/19
 */
public class ServiceLocatorPatternTest {
    public static void main(String[] args) {
        MessageService service = ServiceLocator.getService("EmailService");
        System.out.println(service.getMessageBody());
        service = ServiceLocator.getService("EmailService");
        System.out.println(service.getMessageBody());
        service = ServiceLocator.getService("SMSService");
        System.out.println(service.getMessageBody());
        service = ServiceLocator.getService("SMSService");
        System.out.println(service.getMessageBody());

        System.out.println("Build Test");
        System.out.println("Build 3");



    }
}

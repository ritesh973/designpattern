package com.rits.creationalpattern.servicelocator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ritesh
 * @Created On 1/2/19
 */
public class Cache {


    private List<MessageService> services;

    public Cache(){
        services = new ArrayList<MessageService>();
    }

    public MessageService getService(String serviceName){

        for (MessageService service : services) {
            if(service.getServiceName().equalsIgnoreCase(serviceName)){
                System.out.println("Returning cached  " + serviceName + " object");
                return service;
            }
        }
        return null;
    }

    public void addService(MessageService newService){
        boolean exists = false;

        for (MessageService service : services) {
            if(service.getServiceName().equalsIgnoreCase(newService.getServiceName())){
                exists = true;
            }
        }
        if(!exists){
            services.add(newService);
        }
    }
}

package com.rits.creationalpattern.servicelocator;

/**
 * @author Ritesh
 * @Created On 1/2/19
 */
public class ServiceLocator {

    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static MessageService getService(String jndiName){

        MessageService service = cache.getService(jndiName);

        if(service != null){
            return service;
        }

        InitialContext context = new InitialContext();
        MessageService service1 = (MessageService)context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}

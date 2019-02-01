package com.rits.creationalpattern.singelton;

/**
 * @author Ritesh
 * @Created On 3/12/18
 */
public class SingletonPatternExample {

    private static SingletonPatternExample singletonPatternExample = null;//new SingletonPatternExample();

    private SingletonPatternExample(){
        if(singletonPatternExample!=null)
            throw new IllegalArgumentException("Already Initialized");
    }

    /*public static SingletonPatternExample getInstance(){
        if (singletonPatternExample ==null) {
            singletonPatternExample =  new SingletonPatternExample();
        }
        return singletonPatternExample;
    }*/

    /*public static synchronized SingletonPatternExample getInstance(){
        if (singletonPatternExample ==null) {
            singletonPatternExample =  new SingletonPatternExample();
        }
        return singletonPatternExample;
    }*/

   /* public static SingletonPatternExample getInstance(){
        if (singletonPatternExample ==null) {
            synchronized (SingletonPatternExample.class) {
                if (singletonPatternExample==null)
                singletonPatternExample = new SingletonPatternExample();

                return singletonPatternExample;
            }
        }
        return singletonPatternExample;
    }*/

   /* public static SingletonPatternExample getInstance(){
        if (singletonPatternExample ==null) {
            synchronized (SingletonPatternExample.class) {
                if (singletonPatternExample==null)
                    singletonPatternExample = new SingletonPatternExample();

                return singletonPatternExample;
            }
        }
        return singletonPatternExample;
    }*/

    public static SingletonPatternExample getInstance(){
        return CreateInnerSingelton.instance;
    }

    private static class CreateInnerSingelton{
        private static SingletonPatternExample instance = new SingletonPatternExample();
    }

}

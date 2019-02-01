package com.rits.creationalpattern.singelton;

/**
 * @author Ritesh
 * @Created On 3/12/18
 */

public class SingletonTest {

    public static void main(String[] args) {
        SingletonPatternExample example = SingletonPatternExample.getInstance();

        System.out.println(example);

        SingletonPatternExample example1 = SingletonPatternExample.getInstance();

        System.out.println(example1);
       /*
        try {
            Class<?> aClass = Class.forName("com.rits.creationalpattern.singelton.SingletonPatternExample");
            System.out.println(aClass.newInstance());

        }catch (Exception e){
            e.printStackTrace();
        }*/

    }
}

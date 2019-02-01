package com.rits.creationalpattern.factory;

/**
 * @author Ritesh
 * @Created On 4/12/18
 */
public class ShapeFactory {

    public static Shape getShape(String shapeName){

        if (shapeName.equalsIgnoreCase("circle"))
            return new Circle();
        if (shapeName.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        if (shapeName.equalsIgnoreCase("square"))
            return new Square();
        return null;
    }
}

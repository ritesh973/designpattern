package com.rits.creationalpattern.factory;

/**
 * @author Ritesh
 * @Created On 4/12/18
 */
public class FactoryPatternTest {

    public static void main(String[] args) {

        Shape circle = ShapeFactory.getShape("circle");

        circle.drawShape();

        Shape rectangle = ShapeFactory.getShape("rectangle");

        rectangle.drawShape();

        Shape square = ShapeFactory.getShape("square");

        square.drawShape();


    }
}

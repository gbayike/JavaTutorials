/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inheritance;

/**
 *
 * @author Olugbayike
 */
public class RectangleOverriding extends TwoDShapesOverriding{
    
    // A default constructor.
    public RectangleOverriding() {
        super();
    }
    
    // Constructor for Rectangle.

    public RectangleOverriding(double width, double height) {
        super(width, height, "Rectangle");
    }

    public RectangleOverriding(double x) {
        super(x, "Rectangle");
    }

    public RectangleOverriding(TwoDShapesOverriding ob) {
        super(ob);
    }
    
    boolean isSquare(){
        if(getWidth() == getHeight()) return true;
        return false;
    }
    
    // Override area() for Rectangle.
    double area(){
        return getWidth() * getHeight() / 2;
    }
}

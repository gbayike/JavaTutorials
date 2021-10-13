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
abstract public class TwoDShapesOverriding {
    private double width;
    private double height;
    private String name;
    
    // A default constructor

    public TwoDShapesOverriding() {
        width = height = 0.0;
    }

    public TwoDShapesOverriding(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }
    
    // Construct object with equal width and height.
    TwoDShapesOverriding(double x, String name){
        width = height = x;
        this.name = name;
    }
    
    // Construct an object from an object.
    TwoDShapesOverriding(TwoDShapesOverriding ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    
    // Accessor methods for width and height.
    
//    double getWidth(){ return width; }
//    double getHeight(){ return height; }
//    void detWidth(){ width = width; } 

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public String getName() { return name; }
    
    void showDim() {
        System.out.println("width and height are " + 
                width + " and " + height);
    }
    
    // Now, area() is abstract
    abstract double area();
}

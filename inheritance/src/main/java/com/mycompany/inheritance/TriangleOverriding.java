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
public class TriangleOverriding extends TwoDShapesOverriding{
    private String style;
    
    // A default constructor.
    public TriangleOverriding() {
        super();
        style = "none";
    }
    
    // Constructor for Triangle.
    public TriangleOverriding(String style, double width, double height) {
        super(width, height, "Triangle");
        this.style = style;
    }
    
    // One arguement constructor.
    public TriangleOverriding(double x) {
        super(x, "Triangle");
        this.style = "filled";
    }
    
    // Constuct an object from an object.
    public TriangleOverriding(TriangleOverriding ob) {
        super(ob);
        this.style = ob.style;
    }
    
    // Override area() for Triangle.
    double area(){
        return getWidth() * getHeight() / 2;
    }
    
    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}

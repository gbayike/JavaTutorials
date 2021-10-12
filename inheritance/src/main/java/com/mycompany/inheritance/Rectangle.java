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
public class Rectangle extends TwoDShapes{
    
    Rectangle(){
        super();
    }
    
    Rectangle(double width, double height, String msg){
        super(width, height, msg);
    }
    
    Rectangle(double x, String msg){
        super(x, msg);
    }
    boolean isSquare(){
        if(width == height) return true;
        return false;
    }
    
    double area(){
        return width * height;
    }
}

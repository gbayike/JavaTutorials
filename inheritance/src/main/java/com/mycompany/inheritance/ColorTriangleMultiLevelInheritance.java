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
public class ColorTriangleMultiLevelInheritance extends Triangle{
    private String color;
    
    ColorTriangleMultiLevelInheritance(String c, String s, double w, double h, String msg){
        super(s, msg, w, h);
        color = c;    
    }
    
    String getColor(){ return color; }
    
    void showColor(){
        System.out.println("Color is " + color);
    }
    
}

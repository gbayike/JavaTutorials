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
public class ColorTriangleMultiLevelInheritanceDemo {
    public static void main(String[] args) {
        ColorTriangleMultiLevelInheritance t1 = 
            new ColorTriangleMultiLevelInheritance("Blue", "Outlined", 8.0, 12.0, "Triangle is ");
        ColorTriangleMultiLevelInheritance t2 = 
            new ColorTriangleMultiLevelInheritance("Red", "Filled", 2.0, 2.0, "Triangle is ");
        
        System.out.println("info for t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area is " + t1.area());
        
        System.out.println();
        
        System.out.println("info for t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area is " + t2.area());
    }
}

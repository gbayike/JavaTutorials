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
public class ShapesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Triangle t1 = new Triangle("filled","Triangle is ", 4.0, 4.0);
        Triangle t2 = new Triangle("outlined","Triangle is ",8.0, 12.0);
        TwoDShapes sh = new TwoDShapes(10, 20, null);
        Rectangle r1 = new Rectangle(10, 10, null);
        Rectangle r2 = new Rectangle(20, 10, null);
        
//        t1.width = 4.0;
//        t1.height = 4.0;
//        t1.style = "filled";
        
//        t2.width = 8.0;
//        t2.height = 12.0;
//        t2.style = "outlined";
        
//        sh.width = 10;
//        sh.height = 20;
        
//        r1.height = 10;
//        r1.width = 10;
//        
//        r2.height = 10;
//        r2.width = 20;
        
        System.out.println("info for shape: ");
        sh.showDim();
        
        System.out.println();
        
        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());
        
        System.out.println();
        
        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
        
        System.out.println();
        
        System.out.println("Info for r1: ");
        System.out.println("Is a square: " + r1.isSquare());
        r1.showDim();
        System.out.println("Area is " + r1.area());
        
        System.out.println();
        
        System.out.println("Info for r2: ");
        System.out.println("Is a square: " + r2.isSquare());
        r2.showDim();
        System.out.println("Area is " + r2.area());       
    }
}

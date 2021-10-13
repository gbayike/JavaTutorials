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
public class DynamicShapesOverriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TwoDShapesOverriding shapes[] = new TwoDShapesOverriding[5];
        
        shapes[0] = new TriangleOverriding("outlined", 8.0, 12.0);
        shapes[1] = new RectangleOverriding(10);
        shapes[2] = new RectangleOverriding(10, 4);
        shapes[3] = new TriangleOverriding(7.0);
        // shapes[4] = new TwoDShapesOverriding(10, 20, "Generic");
        
        for(int i = 0; i < shapes.length; i++){
            System.out.println("object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
    
}

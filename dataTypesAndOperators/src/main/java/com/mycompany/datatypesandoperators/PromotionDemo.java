/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datatypesandoperators;

/**
 *
 * @author Olugbayike
 */
public class PromotionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        byte b;
        int i;
        
        b = 10;
        i = b * b; // Okay, No cast needed.
        
        b = 10;
        b = (byte) (b * b); // cast needed
        
        System.out.println("i and b: " + i + " " + b);
    }
}

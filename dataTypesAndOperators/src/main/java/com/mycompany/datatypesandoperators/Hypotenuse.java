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
public class Hypotenuse {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        double x, y , z;
        
        x = 3;
        y = 4;
        
        z= Math.sqrt(x*x + y*y);
        
        System.out.println("Hypoteneuse is " + z);
    }
}

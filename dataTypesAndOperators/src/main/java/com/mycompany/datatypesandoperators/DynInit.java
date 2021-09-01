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
public class DynInit {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        double radius = 4, height = 5;
        
        // dynamically initialize volume
        double volume = 3.1416 * radius * height;
        
        System.out.println("Volume is " + volume);
    }
}

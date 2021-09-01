/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafundermentals;

/**
 *
 * @author Olugbayike
 */
public class WeightOnTheMoonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        double moonsGravity = 0.17;
        int weightOnEarth = 50;
        
        double weightOnMoon = moonsGravity * weightOnEarth;
        
        System.out.println("The weight of 50kg is equivalent to " 
                + weightOnMoon 
                + "kg on the moon");
        
    }
}

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
public class GalToLit {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        double converterValue = 3.7854;
        double gallons = 100;
        double liters;
        
        liters = gallons * converterValue;
        
        System.out.println("100 Gallons = " + liters + " Liters");
    }
}

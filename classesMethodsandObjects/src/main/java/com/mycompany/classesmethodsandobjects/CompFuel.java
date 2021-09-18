/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classesmethodsandobjects;

/**
 *
 * @author Olugbayike
 */
public class CompFuel {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,14,12);
        double gallons;
        int dist = 252;
        
//        // assign values to fields in minivan
//        minivan.passengers = 7;
//        minivan.fuelcap = 16;
//        minivan.mpg = 21;
//        
//        // assign values to fields in sportscar
//        sportscar.passengers = 2;
//        sportscar.fuelcap = 14;
//        sportscar.mpg = 12;
        
        gallons = minivan.fuelNeeded(dist);
        
        System.out.println("To go " + dist +
                " miles minivan needs " + gallons +" gallons of fuel.");
        
        gallons = sportscar.fuelNeeded(dist);
        
        System.out.println("To go " + dist +
                " miles sportscar needs " + gallons +" gallons of fuel.");
    }
}

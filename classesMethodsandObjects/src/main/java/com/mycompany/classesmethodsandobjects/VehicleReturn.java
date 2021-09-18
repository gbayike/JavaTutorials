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
public class VehicleReturn {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,14,12);
        
        int range1, range2;
        
//        // assign values to fields in minivan
//        minivan.passengers = 7;
//        minivan.fuelcap = 16;
//        minivan.mpg = 21;
//        
//        // assign values to fields in sportscar
//        sportscar.passengers = 2;
//        sportscar.fuelcap = 14;
//        sportscar.mpg = 12;
        
        // compute the range assuming a full tank of gas
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;
        
        // print values.
        System.out.println("Minivan can carry " + minivan.passengers + 
                " with range of " + minivan.range2() + "miles");
        
        System.out.println("Sportscar can carry " + sportscar.passengers +
                " with range of " + sportscar.range2() + "miles");
        
    }
}

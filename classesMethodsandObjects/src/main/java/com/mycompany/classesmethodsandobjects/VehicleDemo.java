/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classesmethodsandobjects;
//import  com.mycompany.classesmethodsandobjects.Vehicle;

/**
 *
 * @author Olugbayike
 */
public class VehicleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,14,12);
        
        int range;
        
//        // assingn values to fields in minivan
//        minivan.fuelcap = 16;
//        minivan.mpg = 21;
//        minivan.passengers = 7;
        
        // compute the range assuming a full tank of gas
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + 
                " with a range of " + range);
    }
}

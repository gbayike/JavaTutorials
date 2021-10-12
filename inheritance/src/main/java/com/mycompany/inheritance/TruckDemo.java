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
public class TruckDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Construct trucks.
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;
        
        gallons = semi.fuelNeeded(dist);
        
        System.out.println("Semi can carry " + semi.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles semi needs " +
                gallons +  "gallons of fuel.\n");
        
        gallons = pickup.fuelNeeded(dist);
        System.out.println("Semi can carry " + pickup.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles semi needs " +
                gallons + " gallons of fuel.\n");
        
    }
    
}

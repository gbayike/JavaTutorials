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
public class Vehicle {
    
    int passengers; // No of passengers
    int fuelcap; // fuel capacity in gallons
    int mpg; // fuel consumption in miles per gallon

    void range(){
        System.out.println("Range is " + fuelcap * mpg);
    }
    
    int range2(){
        return fuelcap * mpg;
    }
    
    

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        // TODO code application logic here
//    }
}

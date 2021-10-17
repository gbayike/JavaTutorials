/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.packagesandinterfaces;

/**
 *
 * @author Olugbayike
 */
public class SeriesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ByTwos ob = new ByTwos();
        ByThrees threesOb = new ByThrees();
        Series seriesOb;
        
        for(int i = 0; i < 5; i++)
            System.out.println("Next value is " + ob.getNext());
        
        System.out.println("\nResetting");
        ob.reset();
        for(int i = 0; i < 5; i++)
            System.out.println("Next value is " + ob.getNext());
        
        System.out.println("\nStarting at 100");
        ob.setStart(100);
        for(int i = 0; i < 5; i++)
            System.out.println("Next value is " + ob.getNext());
        
        System.out.println("\nBy Threes");
        for(int i = 0; i < 5; i++){
            seriesOb = threesOb; // pasing class object by reference ti interface object.
            System.out.println("Next value is " + threesOb.getNext()); // works for ByTwosalso. 
        }
    }
    
}

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
public class InchesToMetersTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int counter = 1;
        int inches;
        
        for(inches=1; inches<144; inches++){
            double meters = inches * 0.0254;
            System.out.println(inches + "inch(es) is equal to " + meters + " meter(s)");
            counter++;
            
            if(counter > 12){
                System.out.println();
                counter = 1;
            }
        }
      
        
    }
}

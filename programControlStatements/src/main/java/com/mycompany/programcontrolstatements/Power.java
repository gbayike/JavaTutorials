/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programcontrolstatements;

/**
 *
 * @author Olugbayike
 */
public class Power {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int e;
        int result;
        
        for (int i = 0; i < 10; i++) {
            result = 1;
            
            e = i;
            
            while(e > 0){
                result *= 2;
                e--;
            }
            
            System.out.println("2 to the " + i + " power is " + result);
        }
    }
}

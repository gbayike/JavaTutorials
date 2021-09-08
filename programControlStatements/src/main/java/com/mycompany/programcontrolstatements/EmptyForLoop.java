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
public class EmptyForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        int i;
        int sum = 0;
        
        // Sum the numbers through 5
        for(i = 1; i <= 5 ;sum += i++);
            
        System.out.println("Sum is " + sum);
    }
}

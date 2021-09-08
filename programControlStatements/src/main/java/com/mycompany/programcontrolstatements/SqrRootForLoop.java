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
public class SqrRootForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        double num, eroot, rerr;
        
        for(num = 1.0; num < 100.0; num++){
            eroot = Math.sqrt(num);
            System.out.println("Square root of " + num + " is " + eroot);
            
            // compute rounding error
            rerr = num - (eroot * eroot);
            System.out.println("Rounding error is " + rerr);
            System.out.println();
        }
    }
}

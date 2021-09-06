/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datatypesandoperators;

/**
 *
 * @author Olugbayike
 */
public class LogOpTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        boolean p ,q;
        
        System.out.println("P\tQ\tAND\toR\tXOR\tNOT");
        
        p = q = true;  
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q)+ "\t");
        System.out.println((p^q) + "\t" + (!p));
        
        p = true; q = false; 
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q)+ "\t");
        System.out.println((p^q) + "\t" + (!p));
        
        p = false; q = true; 
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q)+ "\t");
        System.out.println((p^q) + "\t" + (!p));
        
        p = false; q = false; 
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q)+ "\t");
        System.out.println((p^q) + "\t" + (!p));
    }
}

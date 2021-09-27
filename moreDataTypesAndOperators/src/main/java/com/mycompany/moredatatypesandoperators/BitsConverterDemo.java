/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moredatatypesandoperators;

/**
 *
 * @author Olugbayike
 */
public class BitsConverterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        BitsConverter b = new BitsConverter(8);
        BitsConverter i = new BitsConverter(32);
        BitsConverter li = new BitsConverter(64);
        
        System.out.println("123 in binary");
        b.show(123);
        
        System.out.println("\n87987 in binary");
        i.show(87987);
        
        System.out.println("\n237658768 in binary");
        li.show(237658768);
        
        
        // you can also show low-order bits of any integer
        System.out.println("\nLow order 8 bits of 87987");
        b.show(87987);
    }
}

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
public class ThisKeywordDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        ThisKeyword x = new ThisKeyword(4.0, 2);
        ThisKeyword y = new ThisKeyword(2.5, 1);
        ThisKeyword z = new ThisKeyword(5.7, 0);
        
        System.out.println(x.b + " raised to the " + x.e + 
                " power is "+ x.get_pwr());
        System.out.println(x.b + " raised to the " + y.e + 
                " power is "+ y.get_pwr());
        System.out.println(x.b + " raised to the " + z.e + 
                " power is "+ z.get_pwr());
    }
}

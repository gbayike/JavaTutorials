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
public class NotDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        byte b = -34;
        for (int t = 128; t > 0; t = t/2) {
            if((b & t) != 0)  System.out.print("1 ");
            else System.out.print("0 ");
        }
        
        System.out.println();
        
        // reverse all bits
        b = (byte) -b;
        
        for(int t = 128; t > 0; t = t/2){
            if((b & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}

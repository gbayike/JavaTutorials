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
public class ArraysDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int sample[] = new int[10];
        int i;
        
        for (i = 0; i < 10; i++) {
            sample[i] = i;
        }
        
        for (i = 0; i < 10; i++) {
            System.out.println("This is sample[" + i + "]: " +
                    sample[i]);
        }
    }
}

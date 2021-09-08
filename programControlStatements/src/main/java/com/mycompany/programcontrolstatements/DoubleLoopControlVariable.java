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
public class DoubleLoopControlVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int i, j;
        
        for(i = 0, j = 10; i < j; i++, j--){
            System.out.println("i and j: " + i + ", " + j);
        }
    }
}

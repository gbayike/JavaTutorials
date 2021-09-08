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
public class ContinueStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int i;
        
        // print even numbers between 0 and 100
        for(i = 0; i < 100; i++){
            if((i % 2) != 0) continue;
            System.out.println(i);
        }
    }
}

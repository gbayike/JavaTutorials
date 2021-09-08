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
public class ForLoopMissingPieces {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int i;
        for(i = 0; i < 10;){
            System.out.println("Pass #"+i);
            i++; // increment loop control var
        }
        
        System.out.println("\nNext loop STARTS HERE!!!");
        i = 0;
        for(;i<10; ){
            System.out.println("Pass #"+i);
            i++; // increment loop control var
        }
    }
}

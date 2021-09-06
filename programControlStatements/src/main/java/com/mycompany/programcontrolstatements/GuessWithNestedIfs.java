/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programcontrolstatements;

import java.io.IOException;

/**
 *
 * @author Olugbayike
 */
public class GuessWithNestedIfs {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        // TODO code application logic here
         char ch, answer = 'K';
        
        System.out.println("I'm thinking of a letter between A and Z");
        System.out.println("Can you guess it: ");
        
        ch = (char) System.in.read(); // read a char from the keyboard.
        
        if(ch == answer) System.out.println("** Right **");
        
        else{ 
            System.out.print("...Sorry, you're ");
            // a nested if
            if(ch < answer) System.out.println("too low!");
            else System.out.println("too high!");
        }
    }
}

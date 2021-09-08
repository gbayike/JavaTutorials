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
public class GuessWithDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        // TODO code application logic here
        
        char ch, ignore, answer = 'K';
        
        do{
            System.out.println("I'm thinnking of a letter between A and z.");
            System.out.println("can you guess it.");
            
            // read a character.
            ch = (char) System.in.read();
            
            // discard any other characters in the input buffer
            do{
                ignore = (char) System.in.read();
            }while(ignore != '\n');
            if(ch == answer) System.out.println("*** Right ***");
            else{
                System.out.print("...Sorry, you're ");
                if(ch < answer) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try again!\n");
            }
        }while(answer != ch);
    }
}

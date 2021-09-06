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
public class KeyboardInput {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws java.io.IOException {
        // TODO code application logic here
        char ch;
        
        System.out.println("Press a key followed by ENTER: ");
        
        ch = (char) System.in.read(); // get a char.
        
        System.out.println("Your key is: " + ch);
    }
}

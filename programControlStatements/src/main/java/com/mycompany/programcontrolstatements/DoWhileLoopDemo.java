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
public class DoWhileLoopDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        // TODO code application logic here
        char ch;
        
        do{
            System.out.println("Press a key then ENTER: ");
            ch = (char) System.in.read();
        }while(ch != 'q');
    }
}

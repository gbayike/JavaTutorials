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
public class ForTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        // TODO code application logic here
        
        int i;
        
        System.out.println("Press S to stop.");
        
        for (i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println("pass #" + i);
        }
    }
}

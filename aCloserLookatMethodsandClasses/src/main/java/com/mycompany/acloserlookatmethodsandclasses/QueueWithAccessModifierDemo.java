/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.acloserlookatmethodsandclasses;

/**
 *
 * @author Olugbayike
 */
public class QueueWithAccessModifierDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        QueueWithAccessModifier bigQ = new QueueWithAccessModifier(100);
        QueueWithAccessModifier smallQ = new QueueWithAccessModifier(4);
        char ch;
        int i;
        
        // Wrong calls due to private modifier.
        // smallQ.queue[0] = 99; // can't access due private to modifer.
        // smallQ.putloc = -109; // can't access due private to modifer.
        
        System.out.println("Using bigQ to store the alphabet.");
        // put some numbers into bigQ
        for(i=0; i < 26; i++)
            bigQ.put((char) ('A' + i));
        
        // retrieve and display elements from bigQ
        for(i=0; i < 26; i++){
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch + " ");
        }
        
        System.out.println("\n");
        
        System.out.println("Using smallQ to generate errors.");
        // Now, use smallQ to generate some errors
        for(i=0; i < 5; i++){
            System.out.print("Attempting to Store "
                    + (char) ('Z' - i));
            
            smallQ.put((char) ('Z' - i));
            
            System.out.println();
        }
        System.out.println();
        // more errors on smallQ
        System.out.print("Contents of smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            
            if(ch != (char) 0) System.out.print(ch + " ");
        }
    }
}

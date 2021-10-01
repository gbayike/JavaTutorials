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
public class QueueMethodOverloadingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        QueueMethodOverloading q1 = new QueueMethodOverloading(10);
        
        char name[] = { 'T', 'o', 'm'};
        
        // Construct queue from array
        QueueMethodOverloading q2 = new QueueMethodOverloading(name);
        
        char ch;
        int i;
        
        // put some characters into q1
        for (i = 0; i < q1.queuelength(); i++) {
            q1.put((char) ('A' + i));
        }
        
        // Construct queue from another queue
        QueueMethodOverloading q3 = new QueueMethodOverloading(q1);
        
        // Show the queue
        System.out.print("Contents of q1: ");
        for (i = 0; i < q1.queuelength(); i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        
        System.out.println("\n");
        
        System.out.print("Contents of q2: ");
        for(i=0; i < q2.queuelength(); i++){
            ch = q2.get();
            System.out.print(ch);
        }
        
        System.out.println("\n");
        
        System.out.print("Contents of q3: ");
        for (i = 0; i < q3.queuelength(); i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}

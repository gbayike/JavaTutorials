/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafundermentals;

/**
 *
 * @author Olugbayike
 */
public class IfDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int a, b, c;
        
        a = 2;
        b = 3;
        
        if(a < b) System.out.println("a is less than b");
        
        // this won't display anything
        if(a == b) System.out.println("you won't see this");
        
        System.out.println();
        
        c = a - b; // c contains -1
        
        System.out.println("c contains -1");
        if(c >= 0) System.out.println("c is non negative");
        if(c < 0) System.out.println("c is negative");
    }
}

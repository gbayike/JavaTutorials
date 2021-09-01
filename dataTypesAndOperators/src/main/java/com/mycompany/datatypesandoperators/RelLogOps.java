/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datatypesandoperators;

/**
 *
 * @author Olugbayike
 */

//Demonstrates relational and logical operators
public class RelLogOps {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int i, j;
        boolean b1, b2;
        
        i = 10;
        j = 11;
        if(i<j) System.out.println("i < j");
        if(i<=j) System.out.println("i <= j");
        if(i!=j) System.out.println("i != j");
        if(i==j) System.out.println("This won't execute");
        if(i>=j) System.out.println("This won't execute");
        if(i>j) System.out.println("This won't execute");
        
        b1 = true;
        b2 = false;
        if(b1 & b2) System.out.println("this won't execute");
        if(!(b1 & b2)) System.out.println("!(b1 & b2) is true");
        if(b1 | b2) System.out.println("b1 | b2 is true");
        if(b1 ^ b2) System.out.println("b1 ^ b2 is true");
    }
}

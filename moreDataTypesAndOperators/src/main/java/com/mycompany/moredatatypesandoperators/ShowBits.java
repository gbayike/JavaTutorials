/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moredatatypesandoperators;

/**
 *
 * @author Olugbayike
 */
public class ShowBits {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int t;
        byte val;
        
        val = 123;
        for(t = 128; t > 0; t= t/2){
//            System.out.println("the value compared is: " + (val & t)); 
            // bitwise & compares the binanry value of  
            // val and t, returns the decimal value and checks if it 0
            if((val & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}

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
public class WhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        char ch;
        
        // print the alphabet using a while loop
        ch='a';
        while(ch <= 'z'){
            System.out.print(ch);
            ch++;
        }
    }
}

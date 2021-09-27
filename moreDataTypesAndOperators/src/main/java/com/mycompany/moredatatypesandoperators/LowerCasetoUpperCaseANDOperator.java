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
public class LowerCasetoUpperCaseANDOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        char ch;
        
        for(int i=0; i < 10; i++){
            ch = (char) ('a' + i);
            System.out.print(ch + " " + (int) ch + " ");
            
            // This statement turns off the 6th bit.
            ch = (char) ((int) ch & 65503); // ch is now uppercase.
            
            System.out.print(ch +" "+ (int) ch + "    ");
        }
    }
}

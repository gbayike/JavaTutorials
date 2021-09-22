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
public class SubString {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String orgstr = "Java makes the web move.";
        
        // construct a substring.
        String substr = orgstr.substring(5, 18);
        
        System.out.println("Original string: " + orgstr);
        System.out.println("Substring: " + substr);
    }
}

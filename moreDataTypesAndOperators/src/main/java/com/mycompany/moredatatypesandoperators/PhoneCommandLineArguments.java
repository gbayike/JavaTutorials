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
public class PhoneCommandLineArguments {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String numbers[][] = {
            { "Tom", "555-3322" },
            { "Mary", "555-8734" },
            { "Jon", "555-4510" },
            { "Rachel", "555-9483" },
        };        
        int i;
        
        if (args.length != 1) 
            System.out.println("Usage: java PhoneCommandLineArguments.java <name>");
        else{
            for (i = 0; i < 10; i++) {
                if (numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": "+ numbers[i][1]);
                    break;
                }
            }
            if(i == numbers.length)
                System.out.println("Name not found");
        }    
    }
}

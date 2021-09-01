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
public class NestedVariables {

    /**
     * @param args the command line arguments
     */
    
//    This program attempts to declare a variable
//    in an inner scope with the same name as one
//    defined in the outer scope
//    *** This will not compile ***
    
    public static void main(String args[]) {
        // TODO code application logic here
        int count;
        
        for(count = 0; count<19; count++){
            System.out.println("This is count: " + count);
            
//            int count; // illegal!!!
            for(count = 0; count < 2; count++)
                System.out.println("This program is in error");
        }
    }
}

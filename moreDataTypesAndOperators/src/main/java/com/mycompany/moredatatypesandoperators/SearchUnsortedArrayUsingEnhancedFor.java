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
public class SearchUnsortedArrayUsingEnhancedFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
        int val = 5;
        boolean found = false;
        
        // use for each to search for val in nums
        for(int x : nums){
            if(x == val){
                found = true;
                break;
            }
        }
        
        if(found)
            System.out.println("Value found!");
    }
}

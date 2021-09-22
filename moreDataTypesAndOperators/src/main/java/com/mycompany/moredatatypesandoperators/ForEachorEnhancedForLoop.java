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
public class ForEachorEnhancedForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int nums[] = { 1,2,3,4,5,6,7,8,9,10 };
        int sum = 0;
        
        // Use for each or enhanced for to display the sum of nums
        for(int x:nums){
            System.out.println("The value of x is: "+ x);
            sum += x;
        }
        System.out.println("The sum is: " + sum);
        
        // Break for each.
        for(int x:nums){
            System.out.println("The value of x is: "+ x);
            sum += x;
            if(x == 5) // stop the loop when x = 5
                break;
        }
        System.out.println("The sum is: " + sum);
    }
}

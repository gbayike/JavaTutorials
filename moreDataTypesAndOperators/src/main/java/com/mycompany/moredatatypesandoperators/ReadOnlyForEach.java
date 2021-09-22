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
public class ReadOnlyForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for(int x : nums){
            System.out.print(x + " ");
            x = x * 10;  // no effect on nums *for each is read only.
        }
        System.out.println();
        
        for(int x : nums)
            System.out.print(x + " ");
        
        System.out.println();
    }
}

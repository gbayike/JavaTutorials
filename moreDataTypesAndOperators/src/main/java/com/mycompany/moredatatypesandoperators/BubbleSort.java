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
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t;
        int size;
        
        size = nums.length;
        // display original array
        System.out.print("Original Array is: ");
        for (int i = 0; i < size; i++) 
            System.out.print(" " + nums[i]);
        System.out.println();
        
        // Bubble sort
        for (a = 1; a < size; a++) {
            for(b = size-1; b>=a; b--){
                if(nums[b-1]>nums[b]){
                    // exchange elements
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }
        // display sorted array
        System.out.print("Sorted array is: ");
        for (int i = 0; i < size; i++) 
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}

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
public class AssigningArrayReferences {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        int i;
        
        int nums1[] = new int [10];
        int nums2[] = new int [10];
        
        for (i = 0; i < 10; i++)
            nums1[i] = i;
        
        for (i = 0; i < 10; i++)
            nums2[i] = -i;
        
        System.out.print("Here is num1: ");
        for(i=0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();
        
        System.out.print("Here is num2: ");
        for(i=0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();
        
        nums2 = nums1; // now num2 refersto num1
        
        System.out.print("Here is num2 after assignment: ");
        for(i=0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();
        
        // now operate on nums1 after change through nums2
        nums2[3] = 99;
        
        System.out.print("Here is nums1 after change through nums2: ");
        for(i=0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();
    }
}

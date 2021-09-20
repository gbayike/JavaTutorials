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
public class ArrayCopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];
        
        for(i=0; i < nums1.length; i++)
            nums1[i] = i;
        
        // copy numsa to nums2
        if(nums2.length >= nums1.length)
            for(i=0; i < nums1.length; i++)
                nums2[i] = nums1[i];
        
        for(i=0; i <nums2.length; i++)
            System.out.print(nums2[i] + " ");
    }
}

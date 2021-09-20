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
public class MinMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int min, max;
        
        
        //initializing array through individual assignments
//        int nums[] = new int[10];
//        
//        nums[0]= 99;
//        nums[1]= -10;
//        nums[2]= 100123;
//        nums[3]= 18;
//        nums[4]= -978;
//        nums[5]= 5623;
//        nums[6]= 463;
//        nums[7]= -9;
//        nums[8]= 287;
//        nums[9]= 49;
        
        min = max = nums[0];
        for (int i = 0; i < 10; i++) {
            if(nums[i]<min) min = nums[i];
            if(nums[i]>max) max = nums[i];
        }
        System.out.println("min and max: " + min + " " + max);
    }
}

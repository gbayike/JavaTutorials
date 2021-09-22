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
public class ForEachTwoDArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int nums[][] = new int[3][5];
        int sum = 0;
        
        // give nums some values.
        for(int i = 0; i < 3;i++)
            for(int j = 0; j < 5; j++)
                nums[i][j] = (i+1)*(j+1);
        
        // Use for-each for loop to display and sum the values.
        for(int x[] : nums){ // for each multi dimensional array.
            for(int y : x){
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Summation: " + sum);
    }
}

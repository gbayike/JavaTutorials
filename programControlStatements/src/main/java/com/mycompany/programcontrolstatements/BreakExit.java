/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programcontrolstatements;

/**
 *
 * @author Olugbayike
 */
public class BreakExit {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        int num = 100;
        
        // loop while i-squared is less than num
        for(int i = 0; i < num; i++){
            if(i*i >= num) break;
            System.out.print(i + ", ");
        }
        System.out.print("Loop complete.");
    }
}

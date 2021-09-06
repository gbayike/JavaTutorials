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
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int i, m, flag =0;
        
        System.out.println("The prime numbers are: ");
        for(i = 2; i < 100; i++){
            m = i/2;
            for (int j = 2; j <= m; j++) {
                if(i % j == 0){
//                    System.out.println("it entered here at " + i);
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i);
            }
            flag = 0;
        }
    }
}

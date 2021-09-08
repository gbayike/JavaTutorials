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
public class ContinueWithLabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        outerloop:
            for (int i = 1; i < 10; i++) {
                System.out.print("\n Outer loop pass "+ i + ", Inner loop: ");
                for (int j = 1; j < 10; j++) {
                    if(j == 5) continue outerloop;
                    System.out.print(j);
                }
            }
    }
}

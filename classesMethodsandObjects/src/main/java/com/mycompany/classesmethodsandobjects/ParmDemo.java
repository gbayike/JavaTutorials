/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classesmethodsandobjects;

/**
 *
 * @author Olugbayike
 */
public class ParmDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        ChkNum e = new ChkNum();
        if (e.isEven(10)) System.out.println("10 is even");
        
        if (e.isEven(9)) System.out.println("9 is even");
        
        if (e.isEven(8)) System.out.println("8 is even");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.acloserlookatmethodsandclasses;

/**
 *
 * @author Olugbayike
 */
public class VarArgswithParameter {
    // vaTest() uses a normal parameter an a vararg parameter.
    static void vaTest(String msg, int ... v){
        System.out.println(msg + v.length);
        System.out.println("Contents: ");
        
        for(int i=0; i < v.length; i++)
            System.out.println("  arg " + i + ": " + v[i]);
        
        System.out.println();
    }

    public static void main(String args[]) {
        // TODO code application logic here
        // Notice how vaTest() can be called with a
        // variable number of arguements.
        vaTest("One Vararg: ",10);  // 1 arg
        vaTest("Three Varargs: ",1, 2, 3); // 3 args
        vaTest("No Varargs: ");  // no args
    }
}

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
public class NestedClassesOuterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int x[] = { 3, 2, 1, 5, 6, 9, 7, 8 };
        NestedClassesOuter outerOb = new NestedClassesOuter(x);
        
        outerOb.analyze();
    }
}

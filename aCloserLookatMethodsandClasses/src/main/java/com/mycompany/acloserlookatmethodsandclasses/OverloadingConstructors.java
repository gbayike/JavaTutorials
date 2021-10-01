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
public class OverloadingConstructors {
    int x;
    
    // Constructor overload.

    public OverloadingConstructors() {
        System.out.println("Inside OverloadingConstructors().");
        x = 0;
    }

    public OverloadingConstructors(int i) {
        System.out.println("Inside OverloadingConstructors(int).");
        x = i;
    }
    
    OverloadingConstructors(double d){
        System.out.println("Inside OverloadingConstructors(double).");
        x = (int) d;
    }
    
    OverloadingConstructors(int i, int j){
        System.out.println("Inside OverloadingConstructors(int, int).");
        x = i * j;
    }
}

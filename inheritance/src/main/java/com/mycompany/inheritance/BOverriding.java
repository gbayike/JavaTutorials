/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inheritance;

/**
 *
 * @author Olugbayike
 */
public class BOverriding extends AOverriding{
    int k;

    public BOverriding(int k, int a, int b) {
        super(a, b);
        this.k = k;
    }
    
    // display k - this overrides show in AOverriding.
    // overriding only occurs if the signatures of the methods are identical
    // else it overloads the method of the superclass.
    void show(){
        System.out.println("------------show() in AOverriding------------");
        super.show();
        System.out.println();
        System.out.println("------------show() in BOverriding------------");
        System.out.println("k: " + k);
    }
}

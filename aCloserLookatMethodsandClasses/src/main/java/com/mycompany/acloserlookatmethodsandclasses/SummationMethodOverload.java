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
public class SummationMethodOverload {
    int sum;
    // Construct from an int
    SummationMethodOverload(int num){
        sum = 0;
        for(int i = 1; i<= num; i++)
            sum += i;
    }
    
    // construct from another object.

    public SummationMethodOverload(SummationMethodOverload ob) {
        sum = ob.sum;
    }
    
}

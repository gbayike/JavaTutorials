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
public class ArgumentsPassedbyValueDemo {
    public static void main(String[] args) {
        ArguementsPassedbyValue ob = new ArguementsPassedbyValue();
        
        int a = 15, b = 20;
        
        System.out.println("a anad b before call: " + a + " " + b);
        
        ob.noChange(a, b);
        System.out.println("a and b after call: " + a + " " + b);
    }
}

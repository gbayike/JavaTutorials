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
public class AccessModifierSamplesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        AccessModifierSamples ac = new AccessModifierSamples();
        
        // Access to alpha is allowed only through
        // its accessor methods.
        
        ac.setAlpha(-99);
        System.out.println("ac.alpha is " + ac.getAlpha());
        
        // You can't access alpha like this
//        ac.alpha = 10; // Wrong!!! alpha is private.
        
        // Thes are OK because beta and gamma are public
        ac.beta = 88;
        ac.gamma = 99;
    }
}

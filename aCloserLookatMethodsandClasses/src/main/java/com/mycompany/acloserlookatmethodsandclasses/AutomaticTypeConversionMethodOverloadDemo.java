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
public class AutomaticTypeConversionMethodOverloadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        AutomaticTypeConversionMethodOverload ov = new AutomaticTypeConversionMethodOverload();
        
        int i = 10;
        double d = 10.1;
        
        byte b = 99;
        short s = 10;
        float f = 11.5F;
        
        ov.f(i); // calls ov.f(int)
        ov.f(d); // calls ov.f(double)
        
        ov.f(b); // calls ov.f(int) - type conversion
        ov.f(s); // calls ov.f(int) - type conversion
        ov.f(f); // calls ov.f(double) - type conversion
    }
}

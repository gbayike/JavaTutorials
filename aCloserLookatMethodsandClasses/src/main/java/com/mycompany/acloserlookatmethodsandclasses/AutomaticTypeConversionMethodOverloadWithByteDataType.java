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
public class AutomaticTypeConversionMethodOverloadWithByteDataType {
    void f(int x){
        System.out.println("inside f(int): " + x);
    }
    
    void f(double x){
        System.out.println("inside f(double): " + x);
    }
    
    // With byte data type.
    void f(byte x){
        System.out.println("inside f(byte): " + x);
    }
}

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
public class StaticMethod {

    static int val = 1024; // a static variable
    
    // a static method
    static int valDiv(){
        return val/2;
    }
    
//    int denom = 3; // a normal instance variable
//    static int numer = 1024; // a static variable
//    
//    
//    // Error! Can't access a non static variable
//    // from within a static method.
//    static int valDivDenom(){
//        return numer / denom; // won't compile
//    }
}

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
public class ArguementPassedbyReference {
    int a,b;

    public ArguementPassedbyReference(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    /* Pass an object. Now ob.a and ob.b in object
       used in the call will be changed.*/
    
    void changed(ArguementPassedbyReference ob){
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

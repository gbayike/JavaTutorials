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
public class ArguementPassedbyReferenceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        ArguementPassedbyReference ob = new ArguementPassedbyReference(15, 20);
        
        System.out.println("ob.a and ob.b before call: " + ob.a + " " +ob.b);
        
        ob.changed(ob);
        
        System.out.println("ob.a and ob.b after call: " + ob.a + " " +ob.b);
    }
}

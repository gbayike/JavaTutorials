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
public class StaticDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Static ob1 = new Static();
        Static ob2 = new Static();
        
        // Each object has its own copy of an instance variable
        ob1.x = 10;
        ob2.x = 20;
        
        System.out.println("Of course, ob1.x and ob2.x are independent.");
        System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);
        System.out.println();
        
        // Each object shares one copy of a static variable.
        System.out.println("The static variable y is shared.");
        Static.y = 19;
        System.out.println("Set Static.y to 19.");
        
        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
        
        Static.y = 100;
        System.out.println("Change Static.y to 100");
        
        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
    }
}

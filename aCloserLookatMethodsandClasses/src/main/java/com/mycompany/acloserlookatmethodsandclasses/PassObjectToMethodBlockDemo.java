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
public class PassObjectToMethodBlockDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        PassObjectToMethodBlock obj1 = new PassObjectToMethodBlock(10, 2, 5);
        PassObjectToMethodBlock obj2 = new PassObjectToMethodBlock(10, 2, 5);
        PassObjectToMethodBlock obj3 = new PassObjectToMethodBlock(4, 5, 5);
        
        System.out.println("obj1 same dimensions as ob2: " + obj1.sameBlock(obj2));
        System.out.println("obj1 same dimensions as ob3: " + obj1.sameBlock(obj3));
        System.out.println("obj1 same volume as ob3: " + obj1.sameVolume(obj3));
    }
}

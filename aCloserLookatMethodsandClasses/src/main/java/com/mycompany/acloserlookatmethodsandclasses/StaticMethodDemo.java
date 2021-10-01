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
public class StaticMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        System.out.println("val is "+ StaticMethod.val);
        System.out.println("StaticMethod.valDiv(): "+ StaticMethod.valDiv());
        
        StaticMethod.val = 4;
        System.out.println("val is "+ StaticMethod.val);
        System.out.println("StaticMethod.valDiv(): "+ StaticMethod.valDiv());
    }
}

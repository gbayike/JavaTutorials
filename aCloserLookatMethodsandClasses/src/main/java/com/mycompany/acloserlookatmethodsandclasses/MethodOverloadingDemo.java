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
public class MethodOverloadingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        MethodOverloading ov = new MethodOverloading();
        int resI;
        double resD;
        
        // call all versions of ovlDemo()
        ov.ovlDemo();
        System.out.println("");
        
        ov.ovlDemo(2);
        System.out.println("");
        
        resI = ov.ovlDemo(4, 6);
        System.out.println("Result of ov.ovlDemo(4, 6): " + resI);
        System.out.println("");
        
        resD = ov.ovlDemo(1.1, 2.32);
        System.out.println("Result of ov.ovlDemo(1.1, 2.32): " + resD);
        System.out.println("");
    }
}

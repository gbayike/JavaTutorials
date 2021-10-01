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
public class OverloadingConstructorsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        OverloadingConstructors oc1 = new OverloadingConstructors();
        OverloadingConstructors oc2 = new OverloadingConstructors(86);
        OverloadingConstructors oc3 = new OverloadingConstructors(17.23);
        OverloadingConstructors oc4 = new OverloadingConstructors(2, 4);
        
        System.out.println("oc1.x: " + oc1.x);
        System.out.println("oc2.x: " + oc2.x);
        System.out.println("oc3.x: " + oc3.x);
        System.out.println("oc4.x: " + oc4.x);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inheritance;

/**
 *
 * @author Olugbayike
 */
public class DynamicMethodDispatchDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SuperClassDynMethDisp superOb = new SuperClassDynMethDisp();
        SubClassDynMethDisp1 subOb1 = new SubClassDynMethDisp1();
        SubClassDynMethDisp2 subOb2 = new SubClassDynMethDisp2();
        
        SuperClassDynMethDisp supRef;
        
        supRef = superOb;
        supRef.who();
        
        supRef = subOb1;
        supRef.who();
        
        supRef = subOb2;
        supRef.who();
    }
    
}

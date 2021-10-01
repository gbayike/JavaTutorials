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
public class MethodOverloading {
    void ovlDemo(){
        System.out.println("No parameters");
    }
    
    // Overload ovl Demo for one integer parameter.
    void ovlDemo(int a){
        System.out.println("One parameter: " + a);
    }
    
    // Overload ovl Demo for two integer parameters.
    int ovlDemo(int a, int b){
        System.out.println("two parameter: " + a + " & "+ b);
        return a + b;
    }
    
    // Overload ovl Demo for two double parameters.
    double ovlDemo(double a, double b){
        System.out.println("two parameter: " + a + " & "+ b);
        return a + b;
    }
    
    // One ovlDemo(int) is ok.
//    void ovlDemo(Int a){
//        System.out.println("One parameter: " + a);
//    }
    
    // Error! Two ovlDemo(int)s are not OK even though 
    // return types differ
//    int ovlDemo(Int a){
//        System.out.println("One parameter: " + a);
//        return a * a;
//    }
}

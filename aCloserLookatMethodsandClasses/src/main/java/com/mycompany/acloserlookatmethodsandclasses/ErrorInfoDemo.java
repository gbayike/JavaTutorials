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
public class ErrorInfoDemo {
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e;
        
        e = err.getErrorInfo(2);
        System.out.println(e.msg + " severit: "+ e.severity);
        
        e = err.getErrorInfo(19);
        System.out.println(e.msg + " severit: "+ e.severity);
    }
}

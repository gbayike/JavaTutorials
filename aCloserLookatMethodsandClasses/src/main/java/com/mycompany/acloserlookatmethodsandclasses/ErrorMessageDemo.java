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
public class ErrorMessageDemo {
    public static void main(String[] args) {
        ErrorMessage err = new ErrorMessage();
        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));
    }
}

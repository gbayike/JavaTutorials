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
public class AOverriding {
    int i , j;
    AOverriding(int a, int b){
        i = a;
        j = b;
    }
    
    void show(){
        System.out.println("i and j: " + i + " " + j);
    }
}

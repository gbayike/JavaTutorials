/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classesmethodsandobjects;

/**
 *
 * @author Olugbayike
 */
public class Factor {

    /**
     * @param args the command line arguments
     */
    
    boolean isFactor(int a, int b){
        if( (b % a) == 0) return true;
        return false;
    }
}

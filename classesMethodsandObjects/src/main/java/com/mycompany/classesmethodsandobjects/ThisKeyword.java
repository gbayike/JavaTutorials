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
public class ThisKeyword {

    /**
     * @param args the command line arguments
     */
    
    double b;
    int e;
    double val;
    
    ThisKeyword(double b, int e){
        this.b = b;
        this.e = e;
        
        val = 1;
        if(e == 0) return;
        for(;e>0; e--) val = val * b;
    }
    
    double get_pwr(){
        return this.val;
    }
    public static void main(String args[]) {
        // TODO code application logic here
    }
}

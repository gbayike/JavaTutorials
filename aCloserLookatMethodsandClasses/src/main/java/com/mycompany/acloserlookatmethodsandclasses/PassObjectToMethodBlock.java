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
public class PassObjectToMethodBlock {
    int a, b, c;
    int volume;
    
    PassObjectToMethodBlock(int i, int j, int k){
        a = i;
        b = j;
        c = k;
        volume = a * b* c;
    }
    
    // Return true if ch defines the same block.
    boolean sameBlock(PassObjectToMethodBlock ob){
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }
    
    // Return true if ob has same volume
    boolean sameVolume(PassObjectToMethodBlock ob){
        if(ob.volume == volume) return true;
        else return false;
    }
}

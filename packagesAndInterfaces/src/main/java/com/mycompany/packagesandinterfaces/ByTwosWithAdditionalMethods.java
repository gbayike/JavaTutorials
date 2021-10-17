/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.packagesandinterfaces;

/**
 *
 * @author Olugbayike
 */
public class ByTwosWithAdditionalMethods implements Series{
    int start;
    int val;
    int prev;

    ByTwosWithAdditionalMethods(){
        start = 0;
        val = 0;
        prev = -2;
    }
    
    @Override
    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    @Override
    public void reset() {
        val = start;
        prev = start -2;
    }

    @Override
    public void setStart(int x) {
       start =x;
       val = x;
       prev = x - 2;
    }
    
    int getPrevious(){ // Adding method not declared in interface.
        return prev;
    }
}

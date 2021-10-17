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
public class ByThrees implements Series{
    int start;
    int val;

    public ByThrees() {
        start = val = 0;
    }
    
    @Override
    public int getNext() {
        val += 3;
        return val;
    }

    @Override
    public void reset() {
        val = start;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }
    
}

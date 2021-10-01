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
public class ArguementsPassedbyValue {
    // This method cuses no change to thr arguements
    // used in the call.
    void noChange(int i, int j){
        i = i + j;
        j = -j;
    }
}

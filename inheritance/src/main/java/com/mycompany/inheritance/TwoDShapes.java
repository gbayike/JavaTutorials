package com.mycompany.inheritance;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olugbayike
 */
public class TwoDShapes {

    double width;
    double height;
    private String msg;
        
    // to access msg(PRIVATE VARIABLES) in sub class use accessor methods  
    String getMsg(){
        return msg;
    }
    
    void setMsg(String m){
        msg = m;
    }
    
    // Function to show dimensions.
    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
}

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

    public TwoDShapes(double width, double height, String msg) {
        this.width = width;
        this.height = height;
        this.msg = msg;
    }
    
    TwoDShapes(){
        width = height = 0;
        msg = null;
    }
        
    TwoDShapes(double x, String msg){
        width = height = x;
        this.msg = msg;
    }
    
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

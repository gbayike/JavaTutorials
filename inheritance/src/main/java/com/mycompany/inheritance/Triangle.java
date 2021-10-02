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
public class Triangle extends TwoDShapes{
    String style;
  
    // Function to show area.
    double area(){
        return width * height / 2;
    }
    
    
    // Function to show style.
    void showStyle(){
        // msg = "Triangle is "; // !error : msg is private and can't be inherited by subclass
        // correct way to access msg(PRIVATE VARIABLES) in subclass.
        setMsg("Triangle is ");
        
        System.out.println(getMsg() + style);
    }
}

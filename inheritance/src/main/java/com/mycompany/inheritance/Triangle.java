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
  
    // Subclass Constructor.
    Triangle(String style, String msg, double width, double height) {
        // call to superclass constructor.
        super(width,height,msg);
        this.style = style;   
        // setMsg(msg);
    }

    public Triangle() {
        super();
        style = "none";
    }

    public Triangle(String style, double x, String msg) {
        super(x, msg);
        this.style = style;
    }
    
    
    // Function to show area.
    double area(){
        return width * height / 2;
    }
    
    
    // Function to show style.
    void showStyle(){
        // msg = "Triangle is "; // !error : msg is private and can't be inherited by subclass
        // correct way to access msg(PRIVATE VARIABLES) in subclass.
        // setMsg("Triangle is ");
        
        System.out.println(getMsg() + style);
    }
}

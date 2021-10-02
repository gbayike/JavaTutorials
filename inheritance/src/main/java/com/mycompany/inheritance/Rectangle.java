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
public class Rectangle extends TwoDShapes{
    boolean isSquare(){
        if(width == height) return true;
        return false;
    }
    
    double area(){
        return width * height;
    }
}

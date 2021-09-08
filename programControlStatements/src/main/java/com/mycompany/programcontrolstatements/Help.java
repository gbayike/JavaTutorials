/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programcontrolstatements;

import java.io.IOException;

/**
 *
 * @author Olugbayike
 */
public class Help {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        // TODO code application logic here
        System.out.println("Help on");
        System.out.println(" 1. if");
        System.out.println(" 2. Switch");
        System.out.println("Choose one:");
        
        char choice = (char) System.in.read();
        
        switch(choice){
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statemnt;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("   case constant:");
                System.out.println("      statement sequence");
                System.out.println("      break");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Selection not found");
        }
    }
}

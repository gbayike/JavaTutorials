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
public class Help2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        // TODO code application logic here
        char choice, ignore;
        do{
            System.out.println("Help on");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while");
            System.out.println("Choose one:");

            choice = (char) System.in.read();

            do{
                ignore = (char) System.in.read();
            }while(ignore != '\n');
        }while(choice < '1' | choice > '5');
        
        System.out.println("\n");
        
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
                case '3':
                    System.out.println("The for:\n");
                    System.out.println("for(init; conditions; iteration)");
                    System.out.println("   statement;");
                    break;
                case '4':
                    System.out.println("while:\n");
                    System.out.println("while(condition) statement");
                    break;
                case '5':
                    System.out.println("The do-while:\n");
                    System.out.println("do{");
                    System.out.println("   statement");
                    System.out.println("}ehile(condition);");
                    break;
//                default:
//                    System.out.println("Selection not found");
            }
    }
}

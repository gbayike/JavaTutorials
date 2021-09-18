/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classesmethodsandobjects;

import java.io.IOException;

/**
 *
 * @author Olugbayike
 */
public class HelpClassDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        // TODO code application logic here
        char choice, ignore;
        Help hlpobj = new Help();
        
        for(;;){
            do{
               hlpobj.showMenu();

                choice = (char) System.in.read();



                do{
                    ignore = (char) System.in.read();
                }while(ignore != '\n');


            }while(!hlpobj.isValid((choice)));

            if(choice == 'q') break;

            System.out.println("\n");

            
            hlpobj.helpOn(choice);
        }
    }
}

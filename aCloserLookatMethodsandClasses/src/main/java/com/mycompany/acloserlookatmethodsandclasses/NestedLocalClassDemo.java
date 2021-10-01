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
public class NestedLocalClassDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        class ShowBits{
            int numbits;
            
            ShowBits(int n){
                numbits = n;
            }
            
            void show(long val){
                long mask = 1;
                
                //left-shift a 1 into the proper position
                mask <<= numbits-1;
                
                int spacer = 0;
                for(;mask != 0; mask >>>= 1){
                    if((val & mask) != 0) System.out.print("1");
                    else System.out.print("0");
                    spacer++;
                    if((spacer % 8) == 0){
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }
        for(byte b = 0; b < 10; b++){
            ShowBits byteval = new ShowBits(8);
            System.out.println(b + " in binary: ");
            byteval.show(b);
        }
    }
}

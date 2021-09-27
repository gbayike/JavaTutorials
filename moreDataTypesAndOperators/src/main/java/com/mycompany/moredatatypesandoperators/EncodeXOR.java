/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moredatatypesandoperators;

/**
 *
 * @author Olugbayike
 */
public class EncodeXOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        // This has no practical value as it is trivially easy to break.
        
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int Key = 88;
        
        System.out.print("Original meassage: ");
        System.out.println(msg);
        
        // encode the message
        for (int i = 0; i < msg.length(); i++) 
            encmsg = encmsg + (char) (msg.charAt(i) ^ Key);
        
        System.out.print("Encoded message: ");
        System.out.println(encmsg);
        
        // decode the message
        for(int i = 0; i < msg.length(); i++)
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ Key);
        
        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }
}

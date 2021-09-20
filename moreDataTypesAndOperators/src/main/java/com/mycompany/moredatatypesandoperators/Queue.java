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
public class Queue {
    char queue[]; // this array holds the queue.
    int putloc, getloc; // to put and get indices
    
    Queue(int size){
        queue = new char[size]; // allocates memory for queue
        putloc = getloc = 0;
    }
    
    // put a character into the queue
    void put(char ch){
        if(putloc == queue.length){
            System.out.println(" - Queue is full.");
            return;
        }
        
        queue[putloc++] = ch;
    }
    
    // get a character from the queue.
    char get(){
        if(getloc == putloc){
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        return queue[getloc++];
    }
}

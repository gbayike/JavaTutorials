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
public class QueueMethodOverloading {
    private char queue[]; // this array holds the queue.
    private int putloc, getloc; // to put and get indices
    
    // Construct an empty queue given its size.
    QueueMethodOverloading(int size){
        queue = new char[size]; // allocates memory for queue
        putloc = getloc = 0;
    }    

    // Construct queue from an object
    public QueueMethodOverloading(QueueMethodOverloading ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        queue = new char[ob.queue.length];
        
        // copy elements
        for(int i = getloc; i < putloc; i++)
            queue[i] = ob.queue[i];
    }
    
    // Construct queue from an Array
    public QueueMethodOverloading(char a[]) {
        putloc = 0;
        getloc = 0;
        queue = new char[a.length];
        
        for (int i = 0; i < a.length; i++) 
            put(a[i]);
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
    int queuelength(){
        return queue.length;
    }
}

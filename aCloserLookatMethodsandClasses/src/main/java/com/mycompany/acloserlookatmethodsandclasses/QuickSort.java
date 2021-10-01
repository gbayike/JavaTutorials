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
public class QuickSort {

    // Set up a call to the actual Quicksort method.
    static void qsort(char items[]){
        qs(items, 0, items.length-1);
    }
    
    // A recursive version of Quicksort for characters.
    private static void qs(char items[], int left, int right){
        int i, j;
        char x, y;
        
        i = left; j = right;
        int sum =(left+right);
        int index = sum/2;
        x = items[index];
        
        do{
            while((items[i] < x) && (i < right)) i++;
            while((x < items[j]) && (j > left)) j--;
            
            if(i <= j){
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
        }while(i <= j);
        
        if(left < j) qs(items, left, j);
        if(i < right) qs(items, i , right);
    }
}

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
public class Truck extends VehicleInheritance{
    private int cargoCap; // carge capacity in pounds.
    
    // This is a constructor for truck.
    Truck(int p, int f, int m, int c){
        // Initialize Vehicle members using vehicle's constructor.
        super(p,f,m);
    
        cargoCap = c;
    }
    
    // Accesor methods for cargoCap.
    int getCargo(){ return cargoCap; }
    void putCargo(int c) { cargoCap = c; }
}

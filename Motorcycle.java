/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicleinheritance;

/**
 *
 * @author gelde
 */
public class Motorcycle extends Vehicle {
    public boolean hasSideCar;


public Motorcycle(String brand, String model, int year, boolean hasSideCar, Engine engine){
this.hasSideCar = hasSideCar;
}
 

 @Override
    public void start(){
        System.out.println("Motorcycle starting: " + brand + " " + model);
        engine.startEngine();
    }
    
    @Override
    public void stop(){
        System.out.println("Motorcycle stopping: " + brand + " " + model);
        engine.stopEngine();
    }
}

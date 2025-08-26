/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicleinheritance;

/**
 *
 * @author gelde
 */
public class Car extends Vehicle {
    public int numberOfDoors;
   
    public Car(String brand, String model, int year, int numberOfDoors, Engine engine){
        this.numberOfDoors = numberOfDoors;
        
    }
    
    @Override
    public void start(){
        System.out.println("Car starting: " + brand + " " + model);
        engine.startEngine();
    }
    
    @Override
    public void stop(){
        System.out.println("Car stopping: " + brand + " " + model);
        engine.stopEngine();
    }
    
}

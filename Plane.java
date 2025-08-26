/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicleinheritance;

/**
 *
 * @author gelde
 */
public class Plane extends Vehicle {
    public int numberOfEngines;

public Plane(String brand, String model, int year, int numberOfEngines, Engine engine){
    this.numberOfEngines = numberOfEngines;
    }

@Override 
public void start(){
    System.out.println("Plane prepareing for take off:" + brand + " " + model);
    engine.startEngine();
}

@Override
public void stop(){
    System.out.println("Plane shutting down" + brand + " " + model);
    engine.stopEngine();
}

}
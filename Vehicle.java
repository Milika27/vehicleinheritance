/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicleinheritance;

/**
 *
 * @author gelde
 */
public class Vehicle {
    public String brand;
    public String model;
    public int year;
    public Engine engine;
    
    public void start(){
        System.out.println("Starting vehicle...");
        engine.startEngine();
    }
    
    public void stop(){
        System.out.println("Stopping vehicle...");
        engine.stopEngine();
    }
    
    public String getInfo(){
        return year + " " + brand + " " + model + "/n" + engine.getSpecs();
    }
 }

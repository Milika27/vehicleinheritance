/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicleinheritance;

/**
 *
 * @author gelde
 */
public class Engine {
    public String type;
    public int horsePower;
    
    public Engine(String type, int horsePower){
        this.type = type;
        this.horsePower = horsePower;
    }
    
    public String getSpecs(){
        return "Engine Type:" + type + ", Horsepower: " + horsePower;
    }
    
   public void startEngine(){
       System.out.println("The" + type + "engine with" + horsePower + "HP is starting...");
   }
        
   public void stopEngine(){
       System.out.println("The" + type + "engine has stopped.");
   } 
   
}

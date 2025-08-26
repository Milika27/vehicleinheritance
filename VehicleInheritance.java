/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehicleinheritance;

/**
 *
 * @author gelde
 */
public class VehicleInheritance {

    public static void main(String[] args) {
        Engine carEngine = new Engine("petrol",150);
        Car myCar = new Car("Toyota","Corolla",2020,4,carEngine);
        System.out.println(myCar.getInfo());
        myCar.start();
        myCar.stop();
        
        
        Engine bikeEngine = new Engine("Diesel",80);
        Motorcycle myBike = new Motorcycle("Harley","Sportster", 2018, false, bikeEngine);
        myBike.start();
        myBike.stop();
        
        Engine planeEngine = new Engine ("jet",1000);
        Plane myPlane = new Plane("Boeing","747",2015,4,planeEngine);
        myPlane.start();
        myPlane.stop();
    }
}

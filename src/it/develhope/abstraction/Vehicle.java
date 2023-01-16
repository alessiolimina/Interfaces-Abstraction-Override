package it.develhope.abstraction;

public abstract class Vehicle {
    public String type;
    public int numberOfWheels;
    public void showVehicleDetails(){
        System.out.println("This vehicle is of type " + type + " and has " + numberOfWheels + " wheels");
    }
    public abstract void doVehicleSound();

}


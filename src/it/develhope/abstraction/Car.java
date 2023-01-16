package it.develhope.abstraction;

public class Car extends Vehicle {
    public int numberOfDoors;
    public double carPrice;

    public Car (int wheels, int doors, double price){
        this.type = "Car";
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Vroom!!");
    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("This car has " + numberOfDoors + " doors and its price is "+ carPrice + "€");
    }

}

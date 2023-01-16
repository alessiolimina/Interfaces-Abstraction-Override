package it.develhope.abstraction;

public class Start {
    public static void main(String[] args) {

        System.out.println("------CREATING VEHICLES-------");

        Car car = new Car(4, 5, 19999.99);
        car.doVehicleSound();
        car.showVehicleDetails();

        System.out.println("------------------------------");

        Boat boat = new Boat(50.33, 264);
        boat.doVehicleSound();
        boat.showVehicleDetails();
        boat.getBoatWeightAndSpeed();

        System.out.println("-------------------------------");

    }

}


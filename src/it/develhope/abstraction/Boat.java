package it.develhope.abstraction;

public class Boat extends Vehicle {
    public double maxKnotsSpeed;
    public int boatKilosWeight;

    public Boat(double maxSpeed, int weight){
        this.type = "Boat";
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Puh puh puh!!");
    }

    public void getBoatWeightAndSpeed(){
        System.out.println("This boat weighs " + boatKilosWeight + " kg and its maximum knots speed is " + maxKnotsSpeed);
    }

}

package org.module;

public class Main {
    public static void main(String[] args) {

        // Class vehicle can accelerate
        Vehicle newVehicle = new Vehicle();
        newVehicle.accelerate();

        System.out.println(); // new line

        // Car can use accelerate from parent class
        Car newCar = new Car();
        newCar.accelerate();
        System.out.println(newCar.hasFourWheels);

        System.out.println(); // new line

        // BMW can use accelerate from the parent class of its parent class
        BMW newBMW = new BMW();
        System.out.println(newBMW.hasFourWheels);
        newBMW.accelerate();
        System.out.println(newBMW.logo);
    }
}

class Vehicle {
    void accelerate(){
        System.out.println("I am accelerating!");
    }
}

class Car extends Vehicle {
    boolean hasFourWheels = true;
}

class BMW extends Car {
    String logo = "blue and white";
}
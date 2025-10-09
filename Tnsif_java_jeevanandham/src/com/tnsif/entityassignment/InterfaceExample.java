package com.tnsif.entityassignment;

// Define an interface
interface Vehicle {
    void start();  // abstract method
    void stop();
}

// Implement the interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();
    }
}

package com.tnsif.entityassignment;

// Abstract class example
abstract class Animal {
    // final variable (cannot be changed)
    final String speciesType = "Mammal";

    // abstract method (must be implemented by subclass)
    abstract void makeSound();

    // static method (can be called without creating an object)
    static void showCategory() {
        System.out.println("All animals belong to the Animal Kingdom.");
    }

    // final method (cannot be overridden)
    final void breathe() {
        System.out.println("All animals breathe oxygen.");
    }
}

// Concrete subclass
class Dog extends Animal {
    // Implementing abstract method
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Main class
public class Aminal {
    public static void main(String[] args) {
        // Call static method using class name
        Animal.showCategory();

        // Create object of subclass
        Dog dog = new Dog();
        dog.makeSound();
        dog.breathe();

        // Access final variable
        System.out.println("Type: " + dog.speciesType);

        // ❌ dog.speciesType = "Reptile"; // Error! final variable cannot be changed
    }
}

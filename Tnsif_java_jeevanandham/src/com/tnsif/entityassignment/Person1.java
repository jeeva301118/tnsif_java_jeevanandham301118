package com.tnsif.entityassignment;

public class Person1 {
    private String name;        // private - accessible only inside Person
    int age;                    // default - accessible within same package
    protected String address;   // protected - accessible in same package or subclass
    public String country;      // public - accessible everywhere

    // Constructor
    public Person1(String name, int age, String address, String country) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.country = country;
    }

    // Private method
    private void showPrivateInfo() {
        System.out.println("Private Method: Name = " + name);
    }

    // Public method to access private data
    public void displayInfo() {
        showPrivateInfo();
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Country: " + country);
    }
}

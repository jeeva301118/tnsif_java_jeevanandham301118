package com.tnsif.entityassignment;

public class Accessmodifiers {
		public class Person {
	    private String name;        // private - accessible only inside this class
	    int age;                    // default (no modifier) - accessible within same package
	    protected String address;   // protected - accessible in same package or subclasses
	    public String country;      // public - accessible from anywhere

	    // Constructor
	    public Person(String name, int age, String address, String country) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	        this.country = country;
	    }

	    // Private method
	    private void showPrivateInfo() {
	        System.out.println("Private Method: Name = " + name);
	    }

	    // Public method that can access private data
	    public void displayInfo() {
	        showPrivateInfo();
	        System.out.println("Age: " + age);
	        System.out.println("Address: " + address);
	        System.out.println("Country: " + country);
	    }
	}


}

package com.tnsif.entityassignment;

import java.util.Scanner;

// Student class with default constructor
class StudentDetails1 {
    // Default constructor
    StudentDetails1() {
        System.out.println("Student object is created");
    }
}

// Commission class
class Commission {
    // Data Members
    String name;
    String address;
    String phone;
    double salesAmount;
    double commission;

    // Method to accept employee details
    void acceptDetails() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        name = sc.nextLine();

        System.out.println("Enter Address:");
        address = sc.nextLine();

        System.out.println("Enter Phone Number:");
        phone = sc.nextLine();

        System.out.println("Enter Sales Amount:");
        salesAmount = sc.nextDouble();
    }

    // Method to calculate commission
    void calculateCommission() {
        if (salesAmount >= 100000)
            commission = salesAmount * 0.10;
        else if (salesAmount >= 50000)
            commission = salesAmount * 0.05;
        else if (salesAmount >= 30000)
            commission = salesAmount * 0.03;
        else
            commission = 0;

        System.out.println("\nEmployee Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission Earned: " + commission);
    }
}

// Main class
public class StudentMain {
    public static void main(String[] args) {
        // Create Student object (default constructor runs)
        var Student = new StudentDetails1();

        // Create Commission object and perform operations
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
    }
}

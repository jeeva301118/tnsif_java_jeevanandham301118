package com.tnsif.entityassignment;

import java.util.Scanner;  // Import the Scanner class

public class ScannerExample {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Get string input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Get integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Get double input
        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();

        // Display output
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        // Close the scanner
        sc.close();
    }
}

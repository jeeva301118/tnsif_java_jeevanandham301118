package com.tnsif.entityassignment;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter your Full Name with Initial:");
        String name = sc.nextLine();

        System.out.println("Enter your Roll Number:");
        String rollNumber = sc.nextLine();

        System.out.println("Enter your Grade:");
        String grade = sc.nextLine();

        System.out.println("Enter your Percentage:");
        String percentage = sc.nextLine();

        // Displaying the details
        System.out.println("\n" + name);
        System.out.println(rollNumber);
        System.out.println("\t" + grade);
        System.out.println("\t" + percentage);

        sc.close();
    }
}

package com.tnsif.entityassignment;

import java.util.Scanner;

public class ExceptionHandingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Take input from user
            System.out.print("Enter a number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter another number: ");
            int num2 = sc.nextInt();

            // Division operation (may cause ArithmeticException)
            int result = num1 / num2;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }
        catch (Exception e) {
            System.out.println("Error: Invalid input! " + e);
        }
        finally {
            System.out.println("Execution finished. Closing scanner.");
            sc.close();  // always close resources
        }
    }
}

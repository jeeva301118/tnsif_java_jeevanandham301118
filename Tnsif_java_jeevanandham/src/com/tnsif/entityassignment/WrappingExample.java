package com.tnsif.entityassignment;

public class WrappingExample {
    public static void main(String[] args) {
        // Primitive types
        int num = 50;
        double pi = 3.14;

        // Convert primitives to wrapper objects (Autoboxing)
        Integer intObj = num;
        Double doubleObj = pi;

        // Convert wrapper objects back to primitives (Unboxing)
        int n = intObj;
        double d = doubleObj;

        // Display
        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Primitive int: " + n);
        System.out.println("Primitive double: " + d);

        // Useful Wrapper methods
        System.out.println("Max of 10 and 20: " + Integer.max(10, 20));
        System.out.println("Parse string to int: " + Integer.parseInt("123"));
    }
}

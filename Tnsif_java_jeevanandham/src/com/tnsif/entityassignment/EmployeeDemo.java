package com.tnsif.entityassignment;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ravi", "Chennai", 101, 45000, "IT");
        Student s1 = new Student("Priya", "Bangalore", 202, "Computer Science");

        System.out.println(e1);
        System.out.println(s1);
    }
}

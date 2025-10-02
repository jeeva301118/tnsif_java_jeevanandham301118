// Employee.java
package com.tnsif.entityassignment;;

// Parent class
class Person {
    private String name;
    private String city;

    public Person() {
        System.out.println("Person Class Default Constructor");
    }

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", city=" + city + "]";
    }
}

// Child class 1
class Employee extends Person {
    private int empId;
    private float salary;
    private String dept;

    public Employee() {
        System.out.println("Employee Class Default Constructor");
    }

    public Employee(String name, String city, int empId, float salary, String dept) {
        super(name, city);
        this.empId = empId;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", salary=" + salary + ", dept=" + dept +
               ", name=" + getName() + ", city=" + getCity() + "]";
    }
}

// Child class 2
class Student extends Person {
    private int rollNo;
    private String course;

    public Student() {
        System.out.println("Student Class Default Constructor");
    }

    public Student(String name, String city, int rollNo, String course) {
        super(name, city);
        this.rollNo = rollNo;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", course=" + course +
               ", name=" + getName() + ", city=" + getCity() + "]";
    }
}



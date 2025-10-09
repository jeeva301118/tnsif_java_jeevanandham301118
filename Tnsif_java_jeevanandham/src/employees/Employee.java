package employees;

public class Employee {
	    private String name;
	    private int employeeId;
	    private double salary;

	    // Default constructor
	    public Employee() {
	        System.out.println("Default Employee constructor called");
	    }

	    // Parameterized constructor
	    public Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    // Getter for name
	    public String getName() {
	        return name;
	    }

	    // Setter for name
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter for employeeId
	    public int getEmployeeId() {
	        return employeeId;
	    }

	    // Setter for employeeId
	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    // Getter for salary
	    public double getSalary() {
	        return salary;
	    }

	    // Setter for salary
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    // Display employee details
	    public void displayEmployeeDetails() {
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: ₹" + salary);
	    }
	}



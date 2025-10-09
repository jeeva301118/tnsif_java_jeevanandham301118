package employees;

public class EmployeeTest {
	
	    public static void main(String[] args) {
	        // Create employee objects
	        Employee emp1 = new Employee("Ravi Kumar", 101, 50000);
	        Employee emp2 = new Employee("Anita Sharma", 102, 60000);

	        // Display details
	        emp1.displayEmployeeDetails();
	        System.out.println();
	        emp2.displayEmployeeDetails();

	        // Modify details using setters
	        emp1.setSalary(55000);
	        System.out.println("\nAfter salary update:");
	        emp1.displayEmployeeDetails();
	    }
	}


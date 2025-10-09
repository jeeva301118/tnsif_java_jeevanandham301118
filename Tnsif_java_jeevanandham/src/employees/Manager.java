package employees;

public class Manager extends Employee {  // ✅ Added inheritance
    private String department;
    private int teamSize;

    // Default constructor
    public Manager() {
        super(); // ✅ Calls the Employee default constructor
        System.out.println("Manager default constructor called");
    }

    // Parameterized constructor
    public Manager(String name, int employeeId, double salary, String department, int teamSize) {
        super(name, employeeId, salary); // ✅ Calls the Employee parameterized constructor
        this.department = department;
        this.teamSize = teamSize;
    }

    // Getters and Setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    // Override method to display full manager details
    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails(); // ✅ Calls Employee class method
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
    }
}

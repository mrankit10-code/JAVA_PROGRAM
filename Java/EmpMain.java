// Abstract class Employee
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double getSalary();

    // Concrete method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Manager class extending Employee
class Manager extends Employee {
    String dept, projectName;
    double salary;

    Manager(String name, int id, String dept, String projectName, double salary) {
        super(name, id);
        this.dept = dept;
        this.projectName = projectName;
        this.salary = salary;
    }

    // Implementing abstract method
    @Override
    double getSalary() {
        return salary;
    }

    // Overriding displayDetails() to add manager-specific details
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + dept);
        System.out.println("Project: " + projectName);
        System.out.println("Salary: " + getSalary());
    }
}

// Main class
public class EmpMain {
    public static void main(String[] args) {
        // Creating a Manager object
        Manager m = new Manager("John Doe", 101, "IT", "AI Assistant", 75000);

        // Displaying details
        m.displayDetails();
    }
}
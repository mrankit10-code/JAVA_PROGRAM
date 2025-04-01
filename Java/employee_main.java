class Employee {
    String name;
    String id;

    Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("Name = " + this.name + " ID = " + this.id);
    }
}

class Manager extends Employee {
    String dept;
    String projectName;

    Manager(String name, String id, String dept, String projectName) {
        super(name, id);
        this.dept = dept;
        this.projectName = projectName;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Dept = " + this.dept + "Project Name = " + this.projectName);
    }
}

class TechLead extends Employee {
    String techUsed;

    TechLead(String name, String id, String techUsed) {
        super(name, id);
        this.techUsed = techUsed;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Technology used = " + this.techUsed);
    }
}

class employee_main {
    public static void main(String[] aa) {
        Employee e = new Employee("Ankit", "IT123");
        e.displayDetails();
        Manager m = new Manager("Ani", "IT123", "Technology", "cloud_migration");
        m.displayDetails();
        TechLead t = new TechLead("Ankit", "IT123", "cloud");
        t.displayDetails();
    }
}

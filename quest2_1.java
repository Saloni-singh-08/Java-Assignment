import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;
    String department;
    
   
    Employee(String name, int id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }
    
    
    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("----------------------");
    }
}

public class quest2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];
        
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Department: ");
            String department = scanner.nextLine();
            
            employees[i] = new Employee(name, id, salary, department);
        }
        
        scanner.close();
        

        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}


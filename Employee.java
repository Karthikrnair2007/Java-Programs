package mod1;

import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double salary;

    // Constructor
    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    // Method to display employee details
    void displayEmployee() {
        System.out.println("\nEmployee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            emp[i] = new Employee(id, name, salary);
        }

        System.out.println("\n----- Employee Details -----");

        for (int i = 0; i < n; i++) {
            emp[i].displayEmployee();
        }

        sc.close();
    }
}
package Test20Dec;

import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    Employee() {
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID");
        id = scanner.nextInt();
        System.out.println("Enter Name");
        name = scanner.next();
        System.out.println("Enter department");
        department = scanner.next();
        System.out.println("Enter Salary");
        salary = scanner.nextDouble();
    }

    void display() {
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Dept:" + department);
        System.out.println("Salary:" + salary);
    }

    double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private double bonus;

    Manager() {
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(int id, String name, String department, double salary, double bonus) {
        super(id, name, department, salary);
        this.bonus = bonus;
    }

    void accept() {
        super.accept();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter bonus");
        bonus = scanner.nextDouble();
    }

    void display() {
        super.display();
        System.out.println("Bonus:" + bonus);
        System.out.println("Total Salary:"+calculateSalary());
    }

    double calculateSalary(){
        return super.getSalary() + bonus;
    }
}

class EmployeeImpl {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.accept();
        manager.display();
    }
}
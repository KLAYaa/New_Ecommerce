package gqt375pro;
import java.util.Scanner;

class Employees {
    private String name;
    private int id;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employees e = new Employees();

        System.out.print("Enter name: ");
        e.setName(sc.nextLine());

        System.out.print("Enter ID: ");
        e.setId(sc.nextInt());

        System.out.print("Enter salary: ");
        e.setSalary(sc.nextDouble());

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + e.getName());
        System.out.println("ID: " + e.getId());
        System.out.println("Salary: " + e.getSalary());
    }
}
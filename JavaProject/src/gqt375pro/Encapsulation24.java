package gqt375pro;
import java.util.Scanner;

class EmployeeInfo {
    private String employeeName;
    private double salary;

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Encapsulation24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeInfo employee = new EmployeeInfo();

        System.out.print("Enter employee name: ");
        employee.setEmployeeName(sc.nextLine());

        System.out.print("Enter salary: ");
        employee.setSalary(sc.nextDouble());

        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getSalary());
    }
}
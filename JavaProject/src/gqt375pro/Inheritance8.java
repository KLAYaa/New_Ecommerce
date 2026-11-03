package gqt375pro;
class Employee8 {
    String company = "Infosys";
    double salary = 50000;
}

class Manager8 extends Employee8 {
    String team = "Development";
}

public class Inheritance8 {
    public static void main(String[] args) {

        Employee8 e = new Employee8();
        Manager8 m = new Manager8();

        System.out.println("Employee: " + e.company + " " + e.salary);
        System.out.println("Manager: " + m.company + " " + m.salary + " " + m.team);
    }
}
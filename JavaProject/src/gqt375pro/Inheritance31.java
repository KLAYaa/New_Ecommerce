package gqt375pro;
class Employee31 {
    String name;
    int id;
    double salary;
}

class Manager31 extends Employee31 {
    String department;
    String designation;
}

public class Inheritance31 {
    public static void main(String[] args) {

        Manager31 m = new Manager31();

        m.name = "Meena";
        m.id = 301;
        m.salary = 70000;
        m.department = "Finance";
        m.designation = "Senior Manager";

        System.out.println(m.name);
        System.out.println(m.id);
        System.out.println(m.salary);
        System.out.println(m.department);
        System.out.println(m.designation);
    }
}
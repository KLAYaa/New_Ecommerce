package gqt375pro;
class Employee7 {
    String name;
    int id;
    double salary;
}

class Manager7 extends Employee7 {
    String department;
    String designation;
}

public class Inheritance7 {
    public static void main(String[] args) {

        Manager7 m = new Manager7();

        m.name = "Anita";
        m.id = 101;
        m.salary = 65000;
        m.department = "IT";
        m.designation = "Project Manager";

        System.out.println(m.name);
        System.out.println(m.id);
        System.out.println(m.salary);
        System.out.println(m.department);
        System.out.println(m.designation);
    }
}
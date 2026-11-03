package gqt375pro;
class Person21 {
    String name;
    int age;
}

class Employee21 extends Person21 {
    int id;
    double salary;
}

public class Inheritance21 {
    public static void main(String[] args) {

        Employee21 e = new Employee21();

        e.name = "Sneha";
        e.age = 26;
        e.id = 205;
        e.salary = 45000;

        System.out.println("Name: " + e.name);
        System.out.println("Age: " + e.age);
        System.out.println("ID: " + e.id);
        System.out.println("Salary: " + e.salary);
    }
}
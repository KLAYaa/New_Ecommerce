package gqt375pro;
class Person22 {
    String name = "Arjun";
    int age = 28;
}

class Employee2 extends Person22 {
    int id = 501;
    double salary = 55000;
}

public class Inheritance22 {
    public static void main(String[] args) {

        Person22 p = new Person22();
        Employee2 e = new Employee2();

        System.out.println(p.name + " " + p.age);
        System.out.println(e.name + " " + e.age + " " +
                           e.id + " " + e.salary);
    }
}
package gqt375pro;
class Employee32 {
    String name = "Vijay";
    int id = 402;
    double salary = 60000;
}

class Manager32 extends Employee32 {
    String department = "HR";
}

public class Inheritance32 {
    public static void main(String[] args) {

        Employee32 e = new Employee32();
        Manager32 m = new Manager32();

        System.out.println(e.name + " " + e.id + " " + e.salary);
        System.out.println(m.name + " " + m.id + " " +
                           m.salary + " " + m.department);
    }
}
package gqt375pro;
abstract class Employee5 {
    abstract void calculateSalary();
    abstract void calculateBonus();
}

class Manager5 extends Employee5 {
    void calculateSalary() { System.out.println("Manager Salary = 60000"); }
    void calculateBonus() { System.out.println("Manager Bonus = 10000"); }
}

class Clerk5 extends Employee5 {
    void calculateSalary() { System.out.println("Clerk Salary = 25000"); }
    void calculateBonus() { System.out.println("Clerk Bonus = 3000"); }
}

public class Abstract5 {
    public static void main(String[] args) {
        Employee5 e1 = new Manager5();
        Employee5 e2 = new Clerk5();

        e1.calculateSalary();
        e1.calculateBonus();
        e2.calculateSalary();
        e2.calculateBonus();
    }
}
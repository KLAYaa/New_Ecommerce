package gqt375pro;
abstract class Employee22 {
    abstract void work();
}

class Developer22 extends Employee22 {
    void work() {
        System.out.println("Developer writes programs");
    }
}

class Designer22 extends Employee22 {
    void work() {
        System.out.println("Designer creates designs");
    }
}

public class Abstract22 {
    public static void main(String[] args) {
        Employee22 e1 = new Developer22();
        Employee22 e2 = new Designer22();

        e1.work();
        e2.work();
    }
}
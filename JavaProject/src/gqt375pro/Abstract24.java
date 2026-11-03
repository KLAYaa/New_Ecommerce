package gqt375pro;
abstract class Machine24 {
    abstract void start();
}

class Printer24 extends Machine24 {
    void start() {
        System.out.println("Printer started");
    }
}

class Computer24 extends Machine24 {
    void start() {
        System.out.println("Computer started");
    }
}

public class Abstract24 {
    public static void main(String[] args) {
        Machine24 m1 = new Printer24();
        Machine24 m2 = new Computer24();

        m1.start();
        m2.start();
    }
}
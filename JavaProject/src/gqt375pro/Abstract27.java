package gqt375pro;
abstract class Vehicle27 {
    abstract void start();
    abstract void stop();
}

class Car27 extends Vehicle27 {
    void start() { System.out.println("Car starts"); }
    void stop() { System.out.println("Car stops"); }
}

class Motorcycle27 extends Vehicle27 {
    void start() { System.out.println("Motorcycle starts"); }
    void stop() { System.out.println("Motorcycle stops"); }
}

public class Abstract27 {
    public static void main(String[] args) {
        Vehicle27 v1 = new Car27();
        Vehicle27 v2 = new Motorcycle27();

        v1.start();
        v1.stop();
        v2.start();
        v2.stop();
    }
}
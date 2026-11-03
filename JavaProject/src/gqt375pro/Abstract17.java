package gqt375pro;
abstract class Vehicle17 {
    abstract void drive();
    abstract void stop();
}

class Car17 extends Vehicle17 {
    void drive() { System.out.println("Car is driving"); }
    void stop() { System.out.println("Car stopped"); }
}

class Truck17 extends Vehicle17 {
    void drive() { System.out.println("Truck is driving"); }
    void stop() { System.out.println("Truck stopped"); }
}

public class Abstract17 {
    public static void main(String[] args) {
        Vehicle17 v1 = new Car17();
        Vehicle17 v2 = new Truck17();

        v1.drive();
        v1.stop();
        v2.drive();
        v2.stop();
    }
}
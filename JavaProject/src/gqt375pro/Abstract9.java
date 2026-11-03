package gqt375pro;
abstract class Vehicle9 {
    abstract void start();
    abstract void stop();
}

class Car9 extends Vehicle9 {
    void start() { System.out.println("Car starts"); }
    void stop() { System.out.println("Car stops"); }
}

class Motorcycle9 extends Vehicle9 {
    void start() { System.out.println("Bike starts"); }
    void stop() { System.out.println("Bike stops"); }
}

class Abstract9 {
    public static void main(String[] args) {
        Vehicle9 v1 = new Car9();
        Vehicle9 v2 = new Motorcycle9();

        v1.start();
        v1.stop();
        v2.start();
        v2.stop();
    }
}
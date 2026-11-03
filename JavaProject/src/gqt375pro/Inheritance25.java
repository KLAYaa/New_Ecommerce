package gqt375pro;
class Vehicle25 {
    String make;
    String model;
    int year;
}

class Car25 extends Vehicle25 {
    String color;
    double mileage;
}

public class Inheritance25 {
    public static void main(String[] args) {

        Car25 c = new Car25();

        c.make = "Maruti";
        c.model = "Swift";
        c.year = 2025;
        c.color = "Silver";
        c.mileage = 22.5;

        System.out.println(c.make);
        System.out.println(c.model);
        System.out.println(c.year);
        System.out.println(c.color);
        System.out.println(c.mileage);
    }
}
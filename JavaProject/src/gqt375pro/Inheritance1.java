package gqt375pro;
class Vehicle1 {
    String make;
    String model;
    int year;
}

class Car1 extends Vehicle1 {
    String color;
    double mileage;
}

public class Inheritance1 {
    public static void main(String[] args) {

        Car1 c = new Car1();

        c.make = "Hyundai";
        c.model = "i20";
        c.year = 2025;
        c.color = "Blue";
        c.mileage = 20.5;

        System.out.println(c.make);
        System.out.println(c.model);
        System.out.println(c.year);
        System.out.println(c.color);
        System.out.println(c.mileage);
    }
}
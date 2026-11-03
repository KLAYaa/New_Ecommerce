package gqt375pro;
class Vehicle6 {
    String brand = "Toyota";
    int year = 2023;
}

class Car6 extends Vehicle6 {
    String color = "Black";
}

public class Inheritance6 {
    public static void main(String[] args) {

        Vehicle6 v = new Vehicle6();
        Car6 c = new Car6();

        System.out.println("Vehicle: " + v.brand + " " + v.year);
        System.out.println("Car: " + c.brand + " " + c.year + " " + c.color);
    }
}

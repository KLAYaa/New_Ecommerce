package gqt375pro;
class Vehicle18 {
    String brand = "Kia";
    int year = 2024;
}

class Car18 extends Vehicle18 {
    String color = "Red";
}

public class Inheritance18 {
    public static void main(String[] args) {

        Vehicle18 v = new Vehicle18();
        Car18 c = new Car18();

        System.out.println("Vehicle: " + v.brand + " " + v.year);
        System.out.println("Car: " + c.brand + " " + c.year + " " + c.color);
    }
}
package gqt375pro;
class Vehicle26 {
    String brand = "Ford";
    String model = "EcoSport";
    int year = 2023;
}

class Car26 extends Vehicle26 {
    String color = "Blue";
    double mileage = 17.8;
}

public class Inheritance26 {
    public static void main(String[] args) {

        Vehicle26 v = new Vehicle26();
        Car26 c = new Car26();

        System.out.println("Vehicle: " + v.brand + " " +
                           v.model + " " + v.year);

        System.out.println("Car: " + c.brand + " " +
                           c.model + " " + c.year + " " +
                           c.color + " " + c.mileage);
    }
}
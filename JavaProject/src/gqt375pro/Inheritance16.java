package gqt375pro;
class Vehicle16 {
    String brand = "Ashok Leyland";
    int year = 2025;
}

class Truck16 extends Vehicle16 {
    double capacity = 12.5;
}

public class Inheritance16 {
    public static void main(String[] args) {

        Vehicle16 v = new Vehicle16();
        Truck16 t = new Truck16();

        System.out.println("Vehicle: " + v.brand + " " + v.year);
        System.out.println("Truck: " + t.brand + " " + t.year + " " + t.capacity);
    }
}
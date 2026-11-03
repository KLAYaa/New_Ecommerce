package gqt375pro;
class Vehicle2 {
    String brand = "Honda";
    int year = 2024;
}

class Bike2 extends Vehicle2 {
    int engine = 150;
}

public class Inheritance2 {
    public static void main(String[] args) {

        Vehicle2 v = new Vehicle2();
        Bike2 b = new Bike2();

        System.out.println(v.brand);
        System.out.println(v.year);

        System.out.println(b.brand);
        System.out.println(b.year);
        System.out.println(b.engine);
    }
}
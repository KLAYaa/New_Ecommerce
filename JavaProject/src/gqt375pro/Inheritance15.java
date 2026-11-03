package gqt375pro;
class Vehicle15 {
    String make;
    String model;
    int year;
}

class Truck15 extends Vehicle15 {
    double capacity;
    double mileage;
}

class Inheritance15 {
    public static void main(String[] args) {

        Truck15 t = new Truck15();

        t.make = "Tata";
        t.model = "Prima";
        t.year = 2024;
        t.capacity = 15.5;
        t.mileage = 8.2;

        System.out.println(t.make);
        System.out.println(t.model);
        System.out.println(t.year);
        System.out.println(t.capacity + " tons");
        System.out.println(t.mileage + " km/l");
    }
}
package gqt375pro;
class Animal28 {
    String name = "Parrot";
    String type = "Bird";
}

class Bird28 extends Animal28 {
    String color = "Green";
    double wingspan = 0.4;
}

public class Inheritance28 {
    public static void main(String[] args) {

        Animal28 a = new Animal28();
        Bird28 b = new Bird28();

        System.out.println("Animal: " + a.name + " " + a.type);

        System.out.println("Bird: " + b.name + " " +
                           b.type + " " + b.color + " " +
                           b.wingspan);
    }
}
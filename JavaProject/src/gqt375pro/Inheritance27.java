package gqt375pro;
class Animal27 {
    String name;
    String type;
}

class Bird27 extends Animal27 {
    String color;
    double wingspan;
}

public class Inheritance27 {
    public static void main(String[] args) {

        Bird27 b = new Bird27();

        b.name = "Eagle";
        b.type = "Bird";
        b.color = "Brown";
        b.wingspan = 2.3;

        System.out.println("Name: " + b.name);
        System.out.println("Type: " + b.type);
        System.out.println("Color: " + b.color);
        System.out.println("Wingspan: " + b.wingspan + " meters");
    }
}
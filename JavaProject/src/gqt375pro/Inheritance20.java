package gqt375pro;
class Animal20 {
    String name = "Max";
    String type = "Dog";
}

class Dog20 extends Animal20 {
    String breed = "German Shepherd";
}

class Cat20 extends Animal20 {
    String color = "Black";
}

public class Inheritance20 {
    public static void main(String[] args) {

        Dog20 d = new Dog20();
        Cat20 c = new Cat20();

        System.out.println("Dog: " + d.name + " " + d.type + " " + d.breed);
        System.out.println("Cat: " + c.name + " " + c.type + " " + c.color);
    }
}
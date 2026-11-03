package gqt375pro;
class Animal5 {
    String name;
    int age;
}
class Dog5 extends Animal5 {
    String breed;
}
class Cat5 extends Animal5 {
    String color;
}
public class Inheritance5 {
    public static void main(String[] args) {

        Dog5 d = new Dog5();
        d.name = "Bruno";
        d.age = 3;
        d.breed = "Labrador";

        Cat5 c = new Cat5();
        c.name = "Milo";
        c.age = 2;
        c.color = "White";

        System.out.println("Dog: " + d.name + " " + d.age + " " + d.breed);
        System.out.println("Cat: " + c.name + " " + c.age + " " + c.color);
    }
}
package gqt375pro;
abstract class Animal21 {
    abstract void eat();
    abstract void sleep();
}

class Dog21 extends Animal21 {
    void eat() { System.out.println("Dog eats meat"); }
    void sleep() { System.out.println("Dog sleeps"); }
}

class Cat21 extends Animal21 {
    void eat() { System.out.println("Cat eats fish"); }
    void sleep() { System.out.println("Cat sleeps"); }
}

public class Abstract21 {
    public static void main(String[] args) {
        Animal21 a1 = new Dog21();
        Animal21 a2 = new Cat21();

        a1.eat();
        a1.sleep();
        a2.eat();
        a2.sleep();
    }
}
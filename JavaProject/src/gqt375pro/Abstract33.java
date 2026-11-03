package gqt375pro;
abstract class Animal33 {
    abstract void eat();
    abstract void sleep();
}

class Dog33 extends Animal33 {
    void eat() { System.out.println("Dog eats food"); }
    void sleep() { System.out.println("Dog sleeps at night"); }
}

class Cat33 extends Animal33 {
    void eat() { System.out.println("Cat eats milk"); }
    void sleep() { System.out.println("Cat sleeps during day"); }
}

public class Abstract33 {
    public static void main(String[] args) {
        Animal33 a1 = new Dog33();
        Animal33 a2 = new Cat33();

        a1.eat();
        a1.sleep();
        a2.eat();
        a2.sleep();
    }
}
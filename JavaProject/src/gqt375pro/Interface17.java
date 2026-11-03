package gqt375pro;
interface Runnable17 {
    void run();
}
interface Walkable17 {
    void walk();
}
class Cheetah17 implements Runnable17 {
    public void run() {
        System.out.println("Cheetah runs fast");
    }
}
class Tortoise17 implements Walkable17 {
    public void walk() {
        System.out.println("Tortoise walks slowly");
    }
}
public class Interface17 {
    public static void main(String[] args) {
        new Cheetah17().run();
        new Tortoise17().walk();
    }
}
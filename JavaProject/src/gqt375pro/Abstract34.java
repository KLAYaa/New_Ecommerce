package gqt375pro;
abstract class Food34 {
    abstract void prepare();
}

class Pizza34 extends Food34 {
    void prepare() {
        System.out.println("Preparing pizza");
    }
}

class Pasta34 extends Food34 {
    void prepare() {
        System.out.println("Preparing pasta");
    }
}

public class Abstract34 {
    public static void main(String[] args) {
        Food34 f1 = new Pizza34();
        Food34 f2 = new Pasta34();

        f1.prepare();
        f2.prepare();
    }
}
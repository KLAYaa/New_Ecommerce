package gqt375pro;
abstract class Machine18 {
    abstract void run();
}

class Printer18 extends Machine18 {
    void run() {
        System.out.println("Printer is printing");
    }
}

class Scanner18 extends Machine18 {
    void run() {
        System.out.println("Scanner is scanning");
    }
}

public class Abstract18 {
    public static void main(String[] args) {
        Machine18 m1 = new Printer18();
        Machine18 m2 = new Scanner18();

        m1.run();
        m2.run();
    }
}
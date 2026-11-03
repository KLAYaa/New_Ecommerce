package gqt375pro;
abstract class Worker6 {
    abstract void work();
}

class Developer6 extends Worker6 {
    void work() {
        System.out.println("Developer writes code");
    }
}

class Tester6 extends Worker6 {
    void work() {
        System.out.println("Tester tests software");
    }
}

public class Abstract6 {
    public static void main(String[] args) {
        Worker6 w1 = new Developer6();
        Worker6 w2 = new Tester6();

        w1.work();
        w2.work();
    }
}
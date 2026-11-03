package gqt375pro;
abstract class Service8 {
    abstract void startService();
}

class Banking8 extends Service8 {
    void startService() {
        System.out.println("Banking service started");
    }
}

class Insurance8 extends Service8 {
    void startService() {
        System.out.println("Insurance service started");
    }
}

public class Abstract8 {
    public static void main(String[] args) {
        Service8 s1 = new Banking8();
        Service8 s2 = new Insurance8();

        s1.startService();
        s2.startService();
    }
}
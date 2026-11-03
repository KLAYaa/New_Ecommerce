package gqt375pro;
abstract class Service26 {
    abstract void provide();
}

class Internet26 extends Service26 {
    void provide() {
        System.out.println("Internet service provided");
    }
}

class Mobile26 extends Service26 {
    void provide() {
        System.out.println("Mobile service provided");
    }
}

class Abstract26 {
    public static void main(String[] args) {
        Service26 s1 = new Internet26();
        Service26 s2 = new Mobile26();

        s1.provide();
        s2.provide();
    }
}
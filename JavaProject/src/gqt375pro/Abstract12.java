package gqt375pro;
abstract class Appliance12 {
    abstract void operate();
}

class Fan12 extends Appliance12 {
    void operate() {
        System.out.println("Fan rotates");
    }
}

class WashingMachine12 extends Appliance12 {
    void operate() {
        System.out.println("Washing machine washes clothes");
    }
}

class Abstract12 {
    public static void main(String[] args) {
        Appliance12 a1 = new Fan12();
        Appliance12 a2 = new WashingMachine12();

        a1.operate();
        a2.operate();
    }
}
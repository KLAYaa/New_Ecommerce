package gqt375pro;
abstract class Device30 {
    abstract void operate();
}

class Camera30 extends Device30 {
    void operate() {
        System.out.println("Camera takes photos");
    }
}

class Speaker30 extends Device30 {
    void operate() {
        System.out.println("Speaker plays sound");
    }
}

class Abstract30 {
    public static void main(String[] args) {
        Device30 d1 = new Camera30();
        Device30 d2 = new Speaker30();

        d1.operate();
        d2.operate();
    }
}
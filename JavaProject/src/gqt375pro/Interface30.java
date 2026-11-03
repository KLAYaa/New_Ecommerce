package gqt375pro;
interface Drawable30 {
    void draw();
}

interface Printable30 {
    void print();
}

class DigitalCanvas30 implements Drawable30 {
    public void draw() {
        System.out.println("Canvas is drawing");
    }
}

class OfficePrinter30 implements Printable30 {
    public void print() {
        System.out.println("Printer is printing");
    }
}

public class Interface30 {
    public static void main(String[] args) {

        DigitalCanvas30 c = new DigitalCanvas30();
        OfficePrinter30 p = new OfficePrinter30();

        c.draw();
        p.print();
    }
}
package gqt375pro;
interface Drawable29 {
    void draw();
}

interface Printable29 {
    void print();
}

class Canvas29 implements Drawable29 {
    public void draw() {
        System.out.println("Drawing on canvas");
    }
}

class Printer29 implements Printable29 {
    public void print() {
        System.out.println("Printing document");
    }
}

public class Interface29 {
    public static void main(String[] args) {

        Canvas29 c = new Canvas29();
        Printer29 p = new Printer29();

        c.draw();
        p.print();
    }
}
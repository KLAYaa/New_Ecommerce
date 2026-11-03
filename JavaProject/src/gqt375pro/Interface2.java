package gqt375pro;
interface Printable2 {
    void print();
}

interface Scannable2 {
    void scan();
}

class Printer2 implements Printable2, Scannable2 {
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        Printer2 p = new Printer2();
        p.print();
        p.scan();
    }
}
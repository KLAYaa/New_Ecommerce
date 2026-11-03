package gqt375pro;
interface Printable9 {
    void print();
}

interface Scannable9 {
    void scan();
}

class Printer9 implements Printable9 {
    public void print() {
        System.out.println("Printer prints");
    }
}

class Scanner9 implements Scannable9 {
    public void scan() {
        System.out.println("Scanner scans");
    }
}

public class Interface9 {
    public static void main(String[] args) {
        new Printer9().print();
        new Scanner9().scan();
    }
}
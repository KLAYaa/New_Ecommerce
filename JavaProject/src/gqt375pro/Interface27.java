package gqt375pro;
interface Writable27 {
    void write();
}

interface Readable27 {
    void read();
}

class TextFile27 implements Writable27 {
    public void write() {
        System.out.println("Writing to text file");
    }
}

class DatabaseTable27 implements Readable27 {
    public void read() {
        System.out.println("Reading database table");
    }
}

public class Interface27 {
    public static void main(String[] args) {
        new TextFile27().write();
        new DatabaseTable27().read();
    }
}
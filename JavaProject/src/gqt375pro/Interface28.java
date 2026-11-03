package gqt375pro;
interface Writable28 {
    void write();
}

interface Readable28 {
    void read();
}

class TextFile28 implements Writable28 {
    public void write() {
        System.out.println("Writing data to text file");
    }
}

class DatabaseTable28 implements Readable28 {
    public void read() {
        System.out.println("Reading data from database table");
    }
}

public class Interface28 {
    public static void main(String[] args) {

        TextFile28 t = new TextFile28();
        DatabaseTable28 d = new DatabaseTable28();

        t.write();
        d.read();
    }
}
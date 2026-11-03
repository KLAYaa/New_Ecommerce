package gqt375pro;
interface DrawTask22 {
    void draw();
}

interface EraseTask22 {
    void erase();
}

class Whiteboard22 implements DrawTask22, EraseTask22 {
    public void draw() {
        System.out.println("Whiteboard drawing");
    }

    public void erase() {
        System.out.println("Whiteboard erased");
    }
}

class Chalkboard22 implements DrawTask22, EraseTask22 {
    public void draw() {
        System.out.println("Chalkboard drawing");
    }

    public void erase() {
        System.out.println("Chalkboard erased");
    }
}

public class Interface22 {
    public static void main(String[] args) {
        Whiteboard22 w = new Whiteboard22();
        Chalkboard22 c = new Chalkboard22();

        w.draw();
        w.erase();
        c.draw();
        c.erase();
    }
}
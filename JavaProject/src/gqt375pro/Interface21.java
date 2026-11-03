package gqt375pro;
interface Drawable21 {
    void draw();
}

interface Erasable21 {
    void erase();
}

class Whiteboard21 implements Drawable21, Erasable21 {
    public void draw() {
        System.out.println("Drawing on whiteboard");
    }

    public void erase() {
        System.out.println("Erasing whiteboard");
    }
}

public class Interface21 {
    public static void main(String[] args) {
        Whiteboard21 w = new Whiteboard21();
        w.draw();
        w.erase();
    }
}
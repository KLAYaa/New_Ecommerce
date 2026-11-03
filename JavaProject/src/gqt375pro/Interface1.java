package gqt375pro;
interface Drawable1 {
    void draw();
}

interface Resizable1 {
    void resize();
}

class Shape1 implements Drawable1, Resizable1 {
    public void draw() {
        System.out.println("Shape is drawn");
    }

    public void resize() {
        System.out.println("Shape is resized");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Shape1 s = new Shape1();
        s.draw();
        s.resize();
    }
}
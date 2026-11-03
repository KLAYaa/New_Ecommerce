package gqt375pro;
abstract class Figure15 {
    abstract void draw();
    abstract void erase();
}

class Rectangle15 extends Figure15 {
    void draw() { System.out.println("Drawing rectangle"); }
    void erase() { System.out.println("Erasing rectangle"); }
}

class Circle15 extends Figure15 {
    void draw() { System.out.println("Drawing circle"); }
    void erase() { System.out.println("Erasing circle"); }
}

class Abstract15 {
    public static void main(String[] args) {
        Figure15 f1 = new Rectangle15();
        Figure15 f2 = new Circle15();

        f1.draw();
        f1.erase();
        f2.draw();
        f2.erase();
    }
}
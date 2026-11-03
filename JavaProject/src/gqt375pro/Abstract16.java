package gqt375pro;
abstract class Tool16 {
    abstract void use();
}
class Pencil16 extends Tool16 {
    void use() {
        System.out.println("Pencil is used for writing");
    }
}
class Brush16 extends Tool16 {
    void use() {
        System.out.println("Brush is used for painting");
    }
}
public class Abstract16 {
    public static void main(String[] args) {
        Tool16 t1 = new Pencil16();
        Tool16 t2 = new Brush16();

        t1.use();
        t2.use();
    }
}
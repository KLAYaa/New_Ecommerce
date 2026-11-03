package gqt375pro;
interface RunTask18 {
    void run();
}
interface WalkTask18 {
    void walk();
}
class Runner18 implements RunTask18 {
    public void run() {
        System.out.println("Runner runs");
    }
}
class Walker18 implements WalkTask18 {
    public void walk() {
        System.out.println("Walker walks");
    }
}
public class Interface18 {
    public static void main(String[] args) {
        new Runner18().run();
        new Walker18().walk();
    }
}
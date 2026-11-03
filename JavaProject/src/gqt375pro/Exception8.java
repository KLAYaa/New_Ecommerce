package gqt375pro;
public class Exception8 {
    static void test() {
        test();
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (StackOverflowError e) {
            System.out.println("Stack overflow handled");
        }
    }
}
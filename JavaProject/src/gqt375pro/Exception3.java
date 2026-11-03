package gqt375pro;
public class Exception3 {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Object is null");
        }
    }
}
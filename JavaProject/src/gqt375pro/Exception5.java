package gqt375pro;
public class Exception5 {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt("hello");
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}
package gqt375pro;
public class Exception7 {
    public static void main(String[] args) {
        try {
            Class.forName("ABC123");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}
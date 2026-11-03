package gqt375pro;
public class Exception18 {
    public static void main(String[] args) {
        try {
            throw new SecurityException("Access denied");
        } catch (SecurityException e) {
            System.out.println("Security exception handled");
        }
    }
}
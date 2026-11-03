package gqt375pro;
public class Exception11 {
    public static void main(String[] args) {
        try {
            Object[] data = new String[2];
            data[0] = 100;
        } catch (ArrayStoreException e) {
            System.out.println("Wrong type stored in array");
        }
    }
}
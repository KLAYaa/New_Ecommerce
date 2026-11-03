package gqt375pro;
import java.util.*;

class Exception21 {
    public static void main(String[] args) {
        try {
            ResourceBundle bundle =
                    ResourceBundle.getBundle("MissingFile");
            System.out.println(bundle);
        } catch (MissingResourceException e) {
            System.out.println("Resource not found");
        }
    }
}
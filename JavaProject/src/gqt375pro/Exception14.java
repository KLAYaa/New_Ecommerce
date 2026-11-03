package gqt375pro;
import java.util.*;
public class Exception14 {
    public static void main(String[] args) {
        try {
            List<String> list = Arrays.asList("A", "B");
            list.add("C");
        } catch (UnsupportedOperationException e) {
            System.out.println("Operation not supported");
        }
    }
}
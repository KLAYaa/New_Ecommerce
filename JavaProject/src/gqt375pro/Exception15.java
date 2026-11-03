package gqt375pro;
import java.util.*;
public class Exception15 {
    public static void main(String[] args) {
        try {
            List<Integer> numbers = Collections.unmodifiableList(
                    Arrays.asList(10, 20)
            );
            numbers.set(0, 50);
        } catch (UnsupportedOperationException e) {
            System.out.println("Modification not supported");
        }
    }
}
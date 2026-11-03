package gqt375pro;
import java.util.*;

public class Exception16 {
    public static void main(String[] args) {
        try {
            ArrayList<String> names = new ArrayList<>();
            names.add("Ram");
            names.add("Sam");

            for (String name : names) {
                names.remove(name);
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Concurrent modification detected");
        }
    }
}
package gqt375pro;
import java.util.*;

class Exception13 {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<>();
            list.iterator().next();
        } catch (NoSuchElementException e) {
            System.out.println("Element does not exist");
        }
    }
}
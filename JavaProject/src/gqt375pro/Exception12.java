package gqt375pro;
import java.util.*;

public class Exception12 {
    public static void main(String[] args) {
        try {
            ArrayList<Integer> list = new ArrayList<>();
            list.iterator().remove();
        } catch (IllegalStateException e) {
            System.out.println("Illegal state");
        }
    }
}
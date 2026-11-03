package gqt375pro;
import java.util.*;

public class Exception22 {
    public static void main(String[] args) {
        try {
            Formatter f = new Formatter();
            f.close();
            f.format("Hello");
        } catch (FormatterClosedException e) {
            System.out.println("Formatter is closed");
        }
    }
}
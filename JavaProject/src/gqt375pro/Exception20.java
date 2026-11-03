package gqt375pro;
import java.util.regex.*;
public class Exception20 {
    public static void main(String[] args) {
        try {
            Pattern.compile("[");
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid regular expression");
        }
    }
}
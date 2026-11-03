package gqt375pro;
import java.time.*;
public class Exception25 {
    public static void main(String[] args) {
        try {
            LocalDate date = LocalDate.of(2025, 13, 10);
            System.out.println(date);
        } catch (DateTimeException e) {
            System.out.println("Invalid date or time");
        }
    }
}
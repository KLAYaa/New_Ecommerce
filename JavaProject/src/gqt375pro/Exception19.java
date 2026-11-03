package gqt375pro;
import java.time.*;
import java.time.format.*;
public class Exception19 {
    public static void main(String[] args) {
        try {
            LocalDate date = LocalDate.parse("2025-15-40");
            System.out.println(date);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format");
        }
    }
}

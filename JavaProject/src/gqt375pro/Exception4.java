package gqt375pro;
import java.io.*;
public class Exception4 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("abc.txt");
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}
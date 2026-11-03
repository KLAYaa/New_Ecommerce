package gqt375pro;
import java.io.*;
public class Exception6 {
    public static void main(String[] args) {
        try {
            throw new IOException("Input error");
        } catch (IOException e) {
            System.out.println("IOException handled");
        }
    }
}
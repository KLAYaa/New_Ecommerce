package gqt375pro;
import java.util.Scanner;

class Static20 {
    static double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        System.out.println("Celsius = " +
                convertToCelsius(fahrenheit));
    }
}
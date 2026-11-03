package gqt375pro;
import java.util.Scanner;

class FahrenheitToCelsius {

    double convert(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        FahrenheitToCelsius obj = new FahrenheitToCelsius();

        System.out.println("Celsius = " + obj.convert(fahrenheit));
    }
}
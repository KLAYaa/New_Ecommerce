package gqt375pro;
import java.util.Scanner;
class CelsiusToFahrenheit {

    double convert(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        double celsius = sc.nextDouble();

        CelsiusToFahrenheit obj = new CelsiusToFahrenheit();

        System.out.println("Fahrenheit = " + obj.convert(celsius));
    }
}
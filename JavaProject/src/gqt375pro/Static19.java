package gqt375pro;
import java.util.Scanner;

class Static19 {
    static double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        System.out.println("Fahrenheit = " +
                convertToFahrenheit(celsius));
    }
}
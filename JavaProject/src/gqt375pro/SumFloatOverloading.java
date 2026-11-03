package gqt375pro;
import java.util.Scanner;

class SumFloatOverloading {

    float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two float values: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        SumFloatOverloading obj = new SumFloatOverloading();

        System.out.println("Sum = " + obj.sum(a, b));
    }
}
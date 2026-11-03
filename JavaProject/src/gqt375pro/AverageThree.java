package gqt375pro;
import java.util.Scanner;

class AverageThree {

    double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        AverageThree obj = new AverageThree();

        System.out.println("Average = " + obj.average(a, b, c));
    }
}
package gqt375pro;
import java.util.Scanner;
class SphereVolume {
    double volume(double radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        SphereVolume obj = new SphereVolume();

        System.out.println("Volume = " + obj.volume(radius));
    }
}
package gqt375pro;
import java.util.Scanner;

class CylinderVolume {

    double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        CylinderVolume obj = new CylinderVolume();

        System.out.println("Volume = " + obj.volume(radius, height));
    }
}
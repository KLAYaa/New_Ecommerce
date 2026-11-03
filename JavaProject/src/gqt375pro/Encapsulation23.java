package gqt375pro;
import java.util.Scanner;

class RoomDimensions {
    private double length;
    private double width;
    private double area;

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }
}

class Encapsulation23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RoomDimensions room = new RoomDimensions();

        System.out.print("Enter room length: ");
        double length = sc.nextDouble();

        System.out.print("Enter room width: ");
        double width = sc.nextDouble();

        room.setLength(length);
        room.setWidth(width);
        room.setArea(length * width);

        System.out.println("Length: " + room.getLength());
        System.out.println("Width: " + room.getWidth());
        System.out.println("Area: " + room.getArea());
    }
}
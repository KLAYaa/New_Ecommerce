package gqt375pro;
import java.util.Scanner;

class Car {
    private String model;
    private String color;
    private double price;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

public class CarDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car c = new Car();

        System.out.print("Enter model: ");
        c.setModel(sc.nextLine());

        System.out.print("Enter color: ");
        c.setColor(sc.nextLine());

        System.out.print("Enter price: ");
        c.setPrice(sc.nextDouble());

        System.out.println("\nCar Details:");
        System.out.println("Model: " + c.getModel());
        System.out.println("Color: " + c.getColor());
        System.out.println("Price: " + c.getPrice());
    }
}
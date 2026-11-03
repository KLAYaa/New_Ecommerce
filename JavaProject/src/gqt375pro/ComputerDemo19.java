package gqt375pro;
import java.util.Scanner;

class Computer {
    private String brand;
    private String model;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

public class ComputerDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Computer c = new Computer();

        System.out.print("Enter brand: ");
        c.setBrand(sc.nextLine());

        System.out.print("Enter model: ");
        c.setModel(sc.nextLine());

        System.out.print("Enter price: ");
        c.setPrice(sc.nextDouble());

        System.out.println("\nComputer Details:");
        System.out.println("Brand: " + c.getBrand());
        System.out.println("Model: " + c.getModel());
        System.out.println("Price: " + c.getPrice());
    }
}
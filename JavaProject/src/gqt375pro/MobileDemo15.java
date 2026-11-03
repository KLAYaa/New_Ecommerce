package gqt375pro;
import java.util.Scanner;

class MobilePhone {
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

public class MobileDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MobilePhone m = new MobilePhone();

        System.out.print("Enter brand: ");
        m.setBrand(sc.nextLine());

        System.out.print("Enter model: ");
        m.setModel(sc.nextLine());

        System.out.print("Enter price: ");
        m.setPrice(sc.nextDouble());

        System.out.println("\nMobile Details:");
        System.out.println("Brand: " + m.getBrand());
        System.out.println("Model: " + m.getModel());
        System.out.println("Price: " + m.getPrice());
    }
}
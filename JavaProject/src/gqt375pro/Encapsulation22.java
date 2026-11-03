package gqt375pro;
import java.util.Scanner;

class MobileInfo {
    private String model;
    private double price;

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
class Encapsulation22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MobileInfo mobile = new MobileInfo();

        System.out.print("Enter mobile model: ");
        mobile.setModel(sc.nextLine());

        System.out.print("Enter mobile price: ");
        mobile.setPrice(sc.nextDouble());

        System.out.println("Model: " + mobile.getModel());
        System.out.println("Price: " + mobile.getPrice());
    }
}
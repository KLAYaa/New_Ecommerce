package gqt375pro;
import java.util.Scanner;

class ProductRecord {
    private String productName;
    private int quantity;
    private double cost;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}

class Encapsulation26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProductRecord product = new ProductRecord();

        System.out.print("Enter product name: ");
        product.setProductName(sc.nextLine());

        System.out.print("Enter quantity: ");
        product.setQuantity(sc.nextInt());

        System.out.print("Enter cost: ");
        product.setCost(sc.nextDouble());

        System.out.println("Product: " + product.getProductName());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Cost: " + product.getCost());
    }
}
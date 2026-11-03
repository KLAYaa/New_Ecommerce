package gqt375pro;
class ComputerData {
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

public class ComputerDataDemo20 {
    public static void main(String[] args) {

        ComputerData c = new ComputerData();

        c.setBrand("Lenovo");
        c.setModel("IdeaPad");
        c.setPrice(60000);

        System.out.println("Brand: " + c.getBrand());
        System.out.println("Model: " + c.getModel());
        System.out.println("Price: " + c.getPrice());
    }
}
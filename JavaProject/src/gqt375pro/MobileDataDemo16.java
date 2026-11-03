package gqt375pro;
class MobileData {
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

public class MobileDataDemo16 {
    public static void main(String[] args) {

        MobileData m = new MobileData();

        m.setBrand("Samsung");
        m.setModel("Galaxy S25");
        m.setPrice(75000);

        System.out.println("Brand: " + m.getBrand());
        System.out.println("Model: " + m.getModel());
        System.out.println("Price: " + m.getPrice());
    }
}
package gqt375pro;
class CarData {
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
public class CarDataCarDataDemo7 {
    public static void main(String[] args) {

        CarData c = new CarData();

        c.setModel("Toyota");
        c.setColor("White");
        c.setPrice(1500000);

        System.out.println("Model: " + c.getModel());
        System.out.println("Color: " + c.getColor());
        System.out.println("Price: " + c.getPrice());
    }
}

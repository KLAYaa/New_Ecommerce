package gqt375pro;
class CircleData {
    private double radius;
    private double area;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }
}

public class CircleDataDemo12 {
    public static void main(String[] args) {

        CircleData c = new CircleData();

        c.setRadius(5);
        c.setArea(78.5);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.getArea());
    }
}
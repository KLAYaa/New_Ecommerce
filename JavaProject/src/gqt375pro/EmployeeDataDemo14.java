package gqt375pro;
class EmployeeData {
    private String name;
    private int id;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeDataDemo14 {
    public static void main(String[] args) {

        EmployeeData e = new EmployeeData();

        e.setName("Rahul");
        e.setId(101);
        e.setSalary(45000);

        System.out.println("Name: " + e.getName());
        System.out.println("ID: " + e.getId());
        System.out.println("Salary: " + e.getSalary());
    }
}
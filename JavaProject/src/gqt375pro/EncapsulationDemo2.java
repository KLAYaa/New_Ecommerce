package gqt375pro;
class Employee {
    private String name;
    private int id;

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
}

class EncapsulationDemo2 {
    public static void main(String[] args) {

        Employee e = new Employee();

        e.setName("Laya");
        e.setId(101);

        System.out.println("Name: " + e.getName());
        System.out.println("ID: " + e.getId());
    }
}

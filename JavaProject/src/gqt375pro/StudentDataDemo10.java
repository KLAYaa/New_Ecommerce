package gqt375pro;
class StudentData {
    private String name;
    private int rollNumber;
    private double marks;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }
}

public class StudentDataDemo10 {
    public static void main(String[] args) {

        StudentData s = new StudentData();

        s.setName("Laya");
        s.setRollNumber(101);
        s.setMarks(85.5);

        System.out.println("Name: " + s.getName());
        System.out.println("Roll Number: " + s.getRollNumber());
        System.out.println("Marks: " + s.getMarks());
    }
}
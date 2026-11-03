package gqt375pro;
import java.util.Scanner;

class StudentMarks {
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

public class StudentMarksDemo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentMarks s = new StudentMarks();

        System.out.print("Enter name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter roll number: ");
        s.setRollNumber(sc.nextInt());

        System.out.print("Enter marks: ");
        s.setMarks(sc.nextDouble());

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + s.getName());
        System.out.println("Roll Number: " + s.getRollNumber());
        System.out.println("Marks: " + s.getMarks());
    }
}

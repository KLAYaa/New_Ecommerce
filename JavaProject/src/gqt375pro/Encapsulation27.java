package gqt375pro;
import java.util.Scanner;

class StudentRecord {
    private String studentName;
    private int rollNumber;
    private double marks;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
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

class Encapsulation27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentRecord student = new StudentRecord();

        System.out.print("Enter student name: ");
        student.setStudentName(sc.nextLine());

        System.out.print("Enter roll number: ");
        student.setRollNumber(sc.nextInt());

        System.out.print("Enter marks: ");
        student.setMarks(sc.nextDouble());

        System.out.println("Name: " + student.getStudentName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Marks: " + student.getMarks());
    }
}
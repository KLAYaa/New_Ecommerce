// Write a program to demonstrate the use of arrays of objects.
package gqt375pro;
import java.util.Scanner;
class Student {
    int id;
    String name;
    double marks;
    void getData(Scanner sc) {
        System.out.print("Enter Student ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
    }
    void displayData() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
public class datatype20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));
            students[i] = new Student();
            students[i].getData(sc);
        }
        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            students[i].displayData();
        }
    }
}

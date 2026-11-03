package gqt375pro;
import java.util.Scanner;

class Student1 {
    private String name;
    private int rollNumber;
    private int age;

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

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student1 s = new Student1();

        System.out.print("Enter name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter roll number: ");
        s.setRollNumber(sc.nextInt());

        System.out.print("Enter age: ");
        s.setAge(sc.nextInt());

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + s.getName());
        System.out.println("Roll Number: " + s.getRollNumber());
        System.out.println("Age: " + s.getAge());
    }
}

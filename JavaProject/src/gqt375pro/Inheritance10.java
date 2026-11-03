package gqt375pro;
class Person10 {
    String name = "Kiran";
    int age = 22;
}

class Student10 extends Person10 {
    String course = "Data Science";
}

class Teacher10 extends Person10 {
    String subject = "Python";
}

public class Inheritance10 {
    public static void main(String[] args) {

        Student10 s = new Student10();
        Teacher10 t = new Teacher10();

        System.out.println("Student: " + s.name + " " + s.age + " " + s.course);
        System.out.println("Teacher: " + t.name + " " + t.age + " " + t.subject);
    }
}
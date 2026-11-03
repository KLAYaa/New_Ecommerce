package gqt375pro;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
public class BookDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b = new Book();

        System.out.print("Enter title: ");
        b.setTitle(sc.nextLine());

        System.out.print("Enter author: ");
        b.setAuthor(sc.nextLine());

        System.out.print("Enter price: ");
        b.setPrice(sc.nextDouble());

        System.out.println("\nBook Details:");
        System.out.println("Title: " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Price: " + b.getPrice());
    }
}


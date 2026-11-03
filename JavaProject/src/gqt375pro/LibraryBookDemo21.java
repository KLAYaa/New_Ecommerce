package gqt375pro;
import java.util.Scanner;

class LibraryBook {
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

public class LibraryBookDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LibraryBook b = new LibraryBook();

        System.out.print("Enter book title: ");
        b.setTitle(sc.nextLine());

        System.out.print("Enter author: ");
        b.setAuthor(sc.nextLine());

        System.out.print("Enter price: ");
        b.setPrice(sc.nextDouble());

        System.out.println("\nLibrary Book Details:");
        System.out.println("Title: " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Price: " + b.getPrice());
    }
}
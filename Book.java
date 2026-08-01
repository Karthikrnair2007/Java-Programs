package mod1;

import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Method to display book details
    void displayBook() {
        System.out.println("\nBook Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Book " + (i + 1));

            System.out.print("Enter Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Author: ");
            String author = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            books[i] = new Book(title, author, price);
        }

        System.out.println("\n----- Book Details -----");

        for (int i = 0; i < n; i++) {
            books[i].displayBook();
        }

        sc.close();
    }
}
package com.pluralsight;

import java.util.Scanner;

public class InventoryManagement {
    public static void main(String[] args) {

        Book[] inventory = {
                 new Book(1, "978-0439139601", "Harry Potter and the Goblet of Fire", "",false),
                new Book(2, "978-0141439600", "Pride and Prejudice", "Jane Austen", true),
                 new Book(3, "978-0553380163", "A Game of Thrones", "",false),
                 new Book(4, "978-0061120084", "To Kill a Mockingbird", "Harper Lee", false),
                new Book(5, "978-0451524935", "1984", "George Orwell", true),
        };
        Scanner input = new Scanner(System.in);


        System.out.println("---Super Duper's Library Inventory System---\n");
        while (true) {

            System.out.println("Please choose from the fallowing options");
            System.out.println(" 1. show availible books");
            System.out.println(" 2. show checked out books");
            System.out.println(" 3. exit program\n");
            System.out.println(" enter a number choice");

            int userChoice = input.nextInt();
            input.nextLine();

            switch (userChoice) {
                case 1: //Show Available Books
                    //showAvailableBooks()
                    break;
                case 2: //Show Checked Out Books
                    //showCheckedOutBooks()
                    break;
                case 3: //Exit Program
                    input.close();
                    System.exit(0);
                    break;
                default: //Invalid Choice
                    System.out.println("Invalid Choice, try again...");

            }
        }
    }
}

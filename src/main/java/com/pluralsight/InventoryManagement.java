package com.pluralsight;

public class inventorymanagement {
    public static void main(String[] args) {

        Book[] inventory = {
                inventory[0] = new Book(1, "978-0439139601", "Harry Potter and the Goblet of Fire", "J.K. Rowling", false)
        };
        inventory[1] = new Book(2, "978-0141439600", "Pride and Prejudice", "Jane Austen", true);
        inventory[2] = new Book(3, "978-0553380163", "A Game of Thrones", "George R.R. Martin", false);
        inventory[3] = new Book(4, "978-0061120084", "To Kill a Mockingbird", "Harper Lee", false);
        inventory[4] = new Book(5, "978-0451524935", "1984", "George Orwell", true);
        };

        System.out.println("--- Inventory Management System\n"---);
        while(true){

            System.out.println("Please choose from the fallowing options");
            System.out.println(" 1. show availible books");
            System.out.println(" 2. show checked out books");
            System.out.println(" 3. exit program\n");
            System.out.println(" enter a number choice");
            int userChoice = keyboard.nextInt();
            keyboard.nextLine();

            switch (userChoice) {
                case 1: //Show Available Books
                    //showAvailableBooks()
                    break;
                case 2: //Show Checked Out Books
                    //showCheckedOutBooks()
                    break;
                case 3: //Exit Program
                    keyboard.close();
                    System.exit(0);
                    break;
                default: //Invalid Choice
                    System.out.println("Invalid Choice, try again...");

        }
    }
}

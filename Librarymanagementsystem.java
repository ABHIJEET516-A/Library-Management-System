import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] books = new String[50];
        boolean[] issued = new boolean[50];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter book name: ");
                books[count] = sc.nextLine();

                issued[count] = false;
                count++;

                System.out.println("Book added successfully.");

            } else if (choice == 2) {

                if (count == 0) {
                    System.out.println("No books available.");
                } else {

                    System.out.println("\nBooks in Library:");

                    for (int i = 0; i < count; i++) {

                        System.out.print((i + 1) + ". " + books[i]);

                        if (issued[i]) {
                            System.out.println(" - Issued");
                        } else {
                            System.out.println(" - Available");
                        }
                    }
                }

            } else if (choice == 3) {

                System.out.print("Enter book number: ");
                int bookNumber = sc.nextInt();

                if (bookNumber > 0 && bookNumber <= count) {

                    if (issued[bookNumber - 1]) {
                        System.out.println("Book is already issued.");
                    } else {
                        issued[bookNumber - 1] = true;
                        System.out.println("Book issued successfully.");
                    }

                } else {
                    System.out.println("Invalid book number.");
                }

            } else if (choice == 4) {

                System.out.print("Enter book number: ");
                int bookNumber = sc.nextInt();

                if (bookNumber > 0 && bookNumber <= count) {

                    if (issued[bookNumber - 1]) {
                        issued[bookNumber - 1] = false;
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("This book is not issued.");
                    }

                } else {
                    System.out.println("Invalid book number.");
                }

            } else if (choice == 5) {

                System.out.println("Thank you for using Library Management System.");

            } else {

                System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
                       }

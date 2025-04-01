package com.app.library;

import java.util.InputMismatchException;
import java.util.Scanner;


public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\n Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display Available Books");
            System.out.println("6. Search Book");
            System.out.println("7. Delete Book ");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice;
            try {

                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Choice, Please enter a valid option (1-8)");
                scanner.next();
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter Book ID: ");
                    int bookId = 0;
                    try {
                        bookId = scanner.nextInt();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid Input, Please enter a Integer");
                    }

                    System.out.println("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter Book Author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(bookId, title, author));
                    break;
                case 2:
                    System.out.println("Enter member ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter member Name: ");
                    String name = scanner.nextLine();
                    library.addMember(new Member(memberId, name));
                    break;
                case 3:
                    System.out.println("Enter Book ID to issue: ");
                    int issueBookId = scanner.nextInt();
                    System.out.println("Enter Member ID : ");
                    int issueMemberId = scanner.nextInt();
                    library.issueBook(issueBookId, issueMemberId);
                    break;
                case 4:
                    System.out.println("Enter Member ID to return Book: ");
                    int returnMemId = scanner.nextInt();
                    library.returnBook(returnMemId);
                    break;
                case 5:
                    library.displayAvailableBooks();
                    break;
                case 6:
                    System.out.println("Enter Book ID to search: ");
                    int searchBookId = scanner.nextInt();
                    library.searchBook(searchBookId);
                    break;
                case 7:
                    System.out.println("Enter Book Id to delete book");
                    int deleteBookId = scanner.nextInt();
                    library.removeBook(deleteBookId);
                    break;
                case 8:
                    System.out.println("Exit, Good Bye!!!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Choice; Try Again!!!! ");

            }
        }
    }
}

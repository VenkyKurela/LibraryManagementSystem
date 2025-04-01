package com.app.library;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Member> members = new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void issueBook(int bookId, int memberId) {
        Book book = findBook(bookId);
        Member member = findMember(memberId);

        if (book != null && member != null) {
            if (book.isAvailable()) {
                member.issueBook(book);
            } else {
                System.out.println("book is already Issued");
            }
        } else {
            System.out.println("Invalid book ID or member ID.");
        }
    }

    public void returnBook(int memberId) {
        Member member = findMember(memberId);

        if (member != null) {
            member.returnBook();
        } else {
            System.out.println("Invalid Member Id");
        }
    }

    public void displayAvailableBooks() {
        System.out.println("Books Available: ");
        int count = 0;
        for (Book book : books) {
            if (book.isAvailable()) {
                count++;
                System.out.print(count + ": ");
                book.dsiplayDetails();
            } else {
                System.out.println("No Books Available right now ...!! Try later");
            }
        }

    }

    public Book findBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;

    }

    public Member findMember(int memberId) {
        for (Member member : members) {
            if (member.getMemberId() == memberId) {
                return member;
            }
        }
        return null;
    }

    public Book searchBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                if (book.isAvailable()) {
                    System.out.print("Book Available!! : " + book.getTitle());
                    return book;
                }
                else {
                    System.out.println("Book Existed, but currently Unavailable "+book.getTitle());
                }
            }
        }
        System.out.println("No such book is available, Try with proper Book ID");
        return null;
    }

    public Book removeBook ( int bookId)
    {
        for(int i =0; i<books.size(); i++) {
            Book book=books.get(i);
            if (book.getBookId() == bookId) {
                books.remove(book);
                System.out.println(book.getTitle() + " Book removed Successfully !!!");
            }
        }
        System.out.println("No Such Book Available, Try Again..!!");
        return null;
    }

}

package com.app.library;

public class Member {
    private int memberId;
    private String name;
    private Book issuedBook;


    public Member(int memberId, String name)
    {
        this.memberId = memberId;
        this.name = name;
        this.issuedBook = null;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public Book getIssuedBook() {
        return issuedBook;
    }

    public void issueBook(Book book)
    {
        this.issuedBook =  book;
        book.setAvailable(false);
        System.out.println(name + " has issued "+book.getTitle());
    }

    public void returnBook()
    {
        if(issuedBook != null)
        {
            issuedBook.setAvailable(true);
            System.out.println(name + " has returned "+ issuedBook.getTitle());
        }
        else{
            System.out.println("No book return");
        }


    }
}

package com.app.library;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable = true;

    public Book(int bookId, String title, String author)
    {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable =  isAvailable;

    }


    public int getBookId() {
        return bookId;
    }

    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return getAuthor();
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }



    public void dsiplayDetails() {

        //System.out.println("\n Available Books: ");
        System.out.println("{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}');
    }
}

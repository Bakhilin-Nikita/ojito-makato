package ru.lab3.book;

public abstract class Book {
    private  String author;
    private  String title;

    public Book() {
    }

    public Book(String a, String t) {
        author = a;
        title = t;
    }


    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}

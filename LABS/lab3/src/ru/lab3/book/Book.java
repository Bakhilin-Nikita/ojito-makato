package ru.lab3.book;

public abstract class Book {
    private String author;
    private String title;

    public Book(String a, String t) {
        this.author = a;
        this.title = t;
    }

    public void setAuthor(String a) {
        this.author = a;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public String getTitle() {
        return this.title;
    }


}

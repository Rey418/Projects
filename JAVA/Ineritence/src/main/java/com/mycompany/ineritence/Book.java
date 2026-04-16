/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ineritence;

/**
 *
 * @author rhechavarria
 */
public class Book {
    protected String title;
    protected String author;
    protected String genre;
    protected String isbn;

    public Book(String title, String author, String genre, String isbn) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book Title: " + title + "\nAuthor: " + author + "\nGenre: " + genre + "\nISBN: " + isbn;
    }
}

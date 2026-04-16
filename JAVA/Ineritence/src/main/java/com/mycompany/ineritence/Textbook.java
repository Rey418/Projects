/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ineritence;

/**
 *
 * @author rhechavarria
 */
public class Textbook extends Book {
    private String subject;
    private String edition;
    private boolean isOpenSource;
    private String audience; // "College" or "High School"

    public Textbook(String title, String author, String genre, String isbn,
                    String subject, String edition, boolean isOpenSource, String audience) {
        super(title, author, genre, isbn);
        this.subject = subject;
        this.edition = edition;
        this.isOpenSource = isOpenSource;
        this.audience = audience;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nSubject: " + subject +
               "\nEdition: " + edition +
               "\nOpen Source: " + (isOpenSource ? "Yes" : "No") +
               "\nAudience: " + audience;
    }
}
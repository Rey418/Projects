/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ineritence;

/**
 *
 * @author rhechavarria
 */
public class Audiobook extends Book {
    private String narrator;
    private String formatType; // "MP3" or "CD"
    private boolean isUnabridged;

    public Audiobook(String title, String author, String genre, String isbn,
                     String narrator, String formatType, boolean isUnabridged) {
        super(title, author, genre, isbn);
        this.narrator = narrator;
        this.formatType = formatType;
        this.isUnabridged = isUnabridged;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nNarrator: " + narrator +
               "\nFormat Type: " + formatType +
               "\nUnabridged: " + (isUnabridged ? "Yes" : "No");
    }
}
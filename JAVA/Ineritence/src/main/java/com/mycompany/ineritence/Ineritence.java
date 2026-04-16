/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ineritence;

/**
 *
 * @author rhechavarria
 */
public class Ineritence {
    public static void main(String[] args) {
        // Create an Audiobook object
        Audiobook audio = new Audiobook(
            "The Hobbit",
            "J.R.R. Tolkien",
            "Fantasy",
            "978-0547928227",
            "Andy Serkis",
            "MP3",
            true
        );

        // Create a Textbook object
        Textbook textbook = new Textbook(
            "Introduction to Algorithms",
            "Thomas H. Cormen",
            "Education",
            "978-0262033848",
            "Computer Science",
            "3rd Edition",
            false,
            "College"
        );

        // Print information
        System.out.println("=== Audiobook Info ===");
        System.out.println(audio);

        System.out.println("\n=== Textbook Info ===");
        System.out.println(textbook);
    }
}

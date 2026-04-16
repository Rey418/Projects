/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methods;

/**
 *
 * @author rhechavarria
 */
import java.util.Scanner;

public class Calculate {

    // Method to calculate age based on birth date and today's date
    public static int CalculateAge(int birthMonth, int birthDay, int birthYear,
                                   int currentMonth, int currentDay, int currentYear) {
        // Convert both dates to YYYYMMDD format
        int birthDate = birthYear * 10000 + birthMonth * 100 + birthDay;
        int currentDate = currentYear * 10000 + currentMonth * 100 + currentDay;

        // Subtract birth date from current date, divide by 10000 to get age
        int age = (currentDate - birthDate) / 10000;

        return age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner for user input

        // Ask for birth date
        System.out.println("Enter your birth date:");
        System.out.print("Month (1-12): ");
        int birthMonth = scanner.nextInt();

        System.out.print("Day (1-31): ");
        int birthDay = scanner.nextInt();

        System.out.print("Year (e.g., 2000): ");
        int birthYear = scanner.nextInt();

        // Ask for today's date
        System.out.println("\nEnter today's date:");
        System.out.print("Month (1-12): ");
        int currentMonth = scanner.nextInt();

        System.out.print("Day (1-31): ");
        int currentDay = scanner.nextInt();

        System.out.print("Year (e.g., 2025): ");
        int currentYear = scanner.nextInt();

        // Call CalculateAge method and print the result
        int age = CalculateAge(birthMonth, birthDay, birthYear,
                               currentMonth, currentDay, currentYear);

        System.out.println("\nYou are " + age + " years old.");

        scanner.close();  // Close the scanner
    }
}

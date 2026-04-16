/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.methods;

/**
 *
 * @author rhechavarria
 */
import java.util.Scanner;  // Import Scanner class

public class Methods {

    // Method to reverse the digits of an integer
    public static int Reverse_Digits(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;           // Extract last digit
            reversed = reversed * 10 + digit;  // Append to reversed number
            number = number / 10;              // Remove last digit
        }

        return reversed;  // Return the final reversed number
    }

    // Main method: gets user input and calls Reverse_Digits
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        System.out.print("Enter an integer: ");    // Prompt user
        int input = scanner.nextInt();             // Read integer input

        int result = Reverse_Digits(input);        // Call the method

        System.out.println("Reversed number: " + result);  // Display output

        scanner.close();  // Always close the scanner
    }
}
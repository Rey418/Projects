/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraysandstrings;

/**
 *
 * @author rhechavarria
 */
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[10];
        int count = 0;  // Number of grades entered

        System.out.println("Enter up to 10 grades (enter a negative number to stop):");

        // Input loop
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Grade #" + (i + 1) + ": ");
            int input = scanner.nextInt();

            if (input < 0) {
                // Sentinel to stop input early
                break;
            }

            grades[count] = input;
            count++;
        }

        if (count == 0) {
            System.out.println("No grades entered.");
            scanner.close();
            return;
        }

        // Calculate average
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += grades[i];
        }
        double average = sum / count;

        // Count how many grades are above or equal to average, and how many below
        int aboveOrEqual = 0;
        int below = 0;

        for (int i = 0; i < count; i++) {
            if (grades[i] >= average) {
                aboveOrEqual++;
            } else {
                below++;
            }
        }

        // Print results
        System.out.println("\nGrades entered:");
        for (int i = 0; i < count; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println();

        System.out.printf("Average grade: %.2f%n", average);
        System.out.println("Number of grades above or equal to average: " + aboveOrEqual);
        System.out.println("Number of grades below average: " + below);

        scanner.close();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arraysandstrings;

/**
 *
 * @author rhechavarria
 */
import java.security.SecureRandom;

public class ArraysandStrings {

    public static void main(String[] args) {
        // Secure random number generator
        SecureRandom random = new SecureRandom();

        // Array to track frequency of each face (1-10)
        int[] frequency = new int[10];

        // Simulate rolling a 10-sided die 1,000,000 times
        for (int i = 0; i < 1_000_000; i++) {
            int roll = random.nextInt(10) + 1; // Range: 1 to 10
            frequency[roll - 1]++; // Update corresponding index (0 = face 1)
        }

        // Output results
        System.out.printf("%-6s %10s%n", "Face", "Frequency");
        System.out.println("====   ==========");
        for (int i = 0; i < frequency.length; i++) {
            System.out.printf("%4d %12d%n", i + 1, frequency[i]);
        }
    }
}

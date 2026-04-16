/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

/**
 *
 * @author rhechavarria
 */
public class TrianglePattern {
    public static void main(String[] args) {
        // Step 1: Define how many rows the triangle should have
        int rows = 3;

        // Step 2: Outer loop controls the number of rows
        for (int i = 1; i <= rows; i++) {
            // Step 3: Inner loop prints asterisks for each column in the row
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print one star and a space
            }
            // Step 4: Move to the next line after each row
            System.out.println();
        }
    }
}

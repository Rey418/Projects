/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculator;

/**
 *
 * @author rhechavarria
 */
public class Calculator {
    public static void main(String[] args) {
        // Step 1: Declare and initialize two integer variables
        int num1 = 10;  // First number
        int num2 = 5;   // Second number

        // Step 2: Choose an operator
        // 1 = +, 2 = -, 3 = *, 4 = /, 5 = %
        int op = 1;  // Change this value to try other operations

        // Step 3: Use a switch statement to perform the operation
        switch (op) {
            case 1:
                // Addition
                System.out.println("Addition: " + (num1 + num2));
                break;
            case 2:
                // Subtraction
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case 3:
                // Multiplication
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case 4:
                // Division with zero check
                if (num2 != 0) {
                    System.out.println("Division: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            case 5:
                // Modulus with zero check
                if (num2 != 0) {
                    System.out.println("Modulus: " + (num1 % num2));
                } else {
                    System.out.println("Error: Modulus by zero");
                }
                break;
            default:
                // If the operator is not between 1 and 5
                System.out.println("Invalid operation");
        }
    }
}

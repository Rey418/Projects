/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basicprogramming;

/**
 *
 * @author rhechavarria
 */
public class Exercise2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an integer");
            return;
        }

        int number = Integer.parseInt(args[0]);

        // Simple subtraction method to check even or odd:
        int temp = number;
        while (temp > 1) {
            temp = temp - 2;
        }

        if (temp == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}

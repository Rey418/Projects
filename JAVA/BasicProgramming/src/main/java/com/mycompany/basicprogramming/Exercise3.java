/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basicprogramming;

/**
 *
 * @author rhechavarria
 */
public class Exercise3 {
    public static void main(String[] args) {
        double miles = 150.0;   // Example miles driven
        double gallons = 5.0;   // Example gallons used

        if (gallons == 0) {
            System.out.println("Gallons cannot be zero.");
        } else {
            double mpg = miles / gallons;
            System.out.printf("Miles per gallon (MPG): %.2f\n", mpg);
        }
    }
}

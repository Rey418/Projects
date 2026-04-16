/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.elevator;

/**
 *
 * @author rhechavarria
 */
public class Elevator {
    //Instance variable
    private int currentFloor;
    
    //constructor
    public Elevator() {
        currentFloor = 1; //start on the first floor
    }
    
    
    //methods
    public void goUp() {
        //check to see if the currentFloor == 3
            //if so, display an error message (you can't go up!)
            //else add 1 to currentFloor
            //Display current floor
        if (currentFloor == 3) {
            System.out.println("you can't go up!");
        } else {
            currentFloor++;
            displayCurrentFloor();
        }
    }
    
    public void goDown() {
        //check to see if the currentFloor == 3
            //if so, display an error message (you can't go down!)
            //else subtract 1 to currentFloor
            //Display current floor
            if (currentFloor == 1) {
            System.out.println("you can't go down!");
        } else {
            currentFloor--;
            displayCurrentFloor();
        }
    }
    
    public void displayCurrentFloor() {
        //display current floor
        System.out.println("You are now on floor " + currentFloor + ".");
    }
}

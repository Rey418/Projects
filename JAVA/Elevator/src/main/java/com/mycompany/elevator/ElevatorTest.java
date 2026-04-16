/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elevator;

/**
 *
 * @author rhechavarria
 */
public class ElevatorTest {
    public static void main(String[] args) {
        //Create a *new* Elevator object
        Elevator myElevator = new Elevator();
        //Display starting floor
        myElevator.displayCurrentFloor();
        //Make the elevator go up to the 2nd floor
        myElevator.goUp();
        //Make the elevator go up to the 3rd floor
        myElevator.goUp();
        //Try to go up to the 4th floor
        myElevator.goUp();
        //Make the elvator go down to the 2nd floor
        myElevator.goDown();
        //Make the elvator go down to the 1st floor
        myElevator.goDown();
        // Try to go down below 1st floor
        myElevator.goDown();
    }
    
    
}

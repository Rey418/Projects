/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;

/**
 *
 * @author rhechavarria
 */
// File: TemperatureConverter.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Celsius to Fahrenheit Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 150);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel celsiusLabel = new JLabel("Celsius:");
        JTextField celsiusField = new JTextField();

        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
        JTextField fahrenheitField = new JTextField();
        fahrenheitField.setEditable(false);

        JButton convertButton = new JButton("Calculate");
        JButton clearButton = new JButton("Clear");

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(celsiusField.getText());
                    double fahrenheit = (celsius * 9/5) + 32;
                    fahrenheitField.setText(String.format("%.2f", fahrenheit));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                celsiusField.setText("");
                fahrenheitField.setText("");
            }
        });

        panel.add(celsiusLabel);
        panel.add(celsiusField);
        panel.add(fahrenheitLabel);
        panel.add(fahrenheitField);
        panel.add(convertButton);
        panel.add(clearButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}

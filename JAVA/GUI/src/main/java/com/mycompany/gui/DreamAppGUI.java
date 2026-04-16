/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;

/**
 *
 * @author rhechavarria
 */
import javax.swing.*;
import java.awt.*;

public class DreamAppGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Daily Planner App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel mainPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Widgets for planner
        mainPanel.add(new JLabel("Task Name:"));
        mainPanel.add(new JTextField());

        mainPanel.add(new JLabel("Start Time:"));
        mainPanel.add(new JTextField());

        mainPanel.add(new JLabel("End Time:"));
        mainPanel.add(new JTextField());

        mainPanel.add(new JLabel("Priority:"));
        String[] priorities = {"Low", "Medium", "High"};
        mainPanel.add(new JComboBox<>(priorities));

        frame.add(mainPanel, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(new JButton("Add Task"));
        buttonPanel.add(new JButton("Clear"));

        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}

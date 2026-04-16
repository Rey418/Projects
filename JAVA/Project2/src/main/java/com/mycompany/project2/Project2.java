/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project2;

/**
 *
 * @author rhechavarria
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project2 extends JFrame implements ActionListener {
    private JTextField display;
    private double num1 = 0, num2 = 0, result = 0;
    private String operator = "";
    private boolean startNew = true;

    public Project2() {
        setTitle("Simple Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 28));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);

        JPanel panel = new JPanel(new GridLayout(5, 4, 10, 10));
        String[] buttons = {
            "C", "+/-", "/", "*",
            "7", "8", "9", "-",
            "4", "5", "6", "+",
            "1", "2", "3", "=",
            "0", ".", "", ""
        };

        for (String text : buttons) {
            if (!text.equals("")) {
                JButton button = new JButton(text);
                button.setFont(new Font("Arial", Font.BOLD, 20));
                button.addActionListener(this);
                panel.add(button);
            } else {
                panel.add(new JLabel()); // empty placeholder
            }
        }

        setLayout(new BorderLayout(10, 10));
        add(display, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if ("0123456789.".contains(cmd)) {
            if (startNew || display.getText().equals("0")) {
                display.setText("");
                startNew = false;
            }
            display.setText(display.getText() + cmd);
        } else if ("+-*/".contains(cmd)) {
            num1 = Double.parseDouble(display.getText());
            operator = cmd;
            startNew = true;
        } else if (cmd.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num2 != 0 ? num1 / num2 : 0; break;
            }
            display.setText(String.valueOf(result));
            startNew = true;
        } else if (cmd.equals("C")) {
            display.setText("0");
            num1 = num2 = result = 0;
            operator = "";
            startNew = true;
        } else if (cmd.equals("+/-")) {
            double val = Double.parseDouble(display.getText());
            val *= -1;
            display.setText(String.valueOf(val));
        }
    }

    public static void main(String[] args) {
        new Project2();
    }
}

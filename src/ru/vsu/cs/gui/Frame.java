package ru.vsu.cs.gui;

import ru.vsu.cs.gui.listener.CreateANewListOfMinimumDigitsListener;

import javax.swing.*;

public class Frame extends JFrame {
    private JPanel mainPanel;
    private JTextField inputArray;
    private JButton buttonCreateNewArray;
    private JTextField resultOfProgram;
    private JTextField textField1;

    public Frame() {
        super("Task 9");

        setContentPane(mainPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        pack();
        setBounds(550, 300, 500, 300);

        buttonCreateNewArray.addActionListener(new CreateANewListOfMinimumDigitsListener(inputArray, resultOfProgram, textField1));
    }
}

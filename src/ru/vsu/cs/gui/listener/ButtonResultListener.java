package ru.vsu.cs.gui.listener;

import ru.vsu.cs.common.ListHandler;
import ru.vsu.cs.gui.utils.ArrayListUtils;
import ru.vsu.cs.gui.utils.ArrayUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ButtonResultListener implements ActionListener {
    JTextField inputArray;
    JTextField resultOfProgram;
    JTextField textField1;

    public ButtonResultListener(JTextField inputArray, JTextField resultOfProgram, JTextField textField1) {
        this.inputArray = inputArray;
        this.resultOfProgram = resultOfProgram;
        this.textField1 = textField1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int[] number = ArrayUtils.toIntArray(textField1.getText());
        int n = number[0];
        int[] sourceArray = ArrayUtils.toIntArray(inputArray.getText());
        List<Integer> list = ArrayListUtils.createArrayList(sourceArray);
        List<Integer> listNew = ListHandler.createNewList(list, n);
        resultOfProgram.setText(String.valueOf(listNew));
    }
}
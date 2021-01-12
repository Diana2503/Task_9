package ru.vsu.cs.console;

import ru.vsu.cs.common.ListHandler;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Integer> list = readFile(args[0]);
        List<Integer> newList = ListHandler.createNewList(list, parseInt(args[2]));
        writeFile(args[1], newList);
    }

    public static List<Integer> readFile(String fileName) {
        List<Integer> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNext()) {
                list.add(scanner.nextInt());
            }
            scanner.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found!");
        }
        return list;
    }

    public static void writeFile(String fileName, List<Integer> list) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(String.valueOf(list));
        fileWriter.close();
    }
}
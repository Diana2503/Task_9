package ru.vsu.cs.gui.utils;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUtils {

    public static List<Integer> createArrayList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
    }
}

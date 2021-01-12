package ru.vsu.cs.common;

import java.util.List;

public class ListHandler {
    public static List<Integer> createNewList(List<Integer> list, int n) {
        sortTheListInAscendingOrder(list);
        deleteTheSameDigitsInList(list);
        cutTheListToN(list, n);
        return list;
    }

    public static void sortTheListInAscendingOrder(List<Integer> list) {
        int greaterDigitAheadOfThePrevious;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(i)) {
                    greaterDigitAheadOfThePrevious = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, greaterDigitAheadOfThePrevious);
                }
            }
        }
    }

    public static void deleteTheSameDigitsInList(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(i);
                    i--;
                }
            }
        }
    }

    public static void cutTheListToN(List<Integer> list, int n) {
        for (int i = 0; i < list.size(); i++) {
            if (i >= n) {
                list.remove(i);
                i--;
            }
        }
    }
}
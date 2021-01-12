package ru.vsu.cs.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.common.ListHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheMinimalDigits {
    @Test
    public void test1FindTheMinimalDigits() {
        List<Integer> listInput = new ArrayList<>(Arrays.asList(7, 2, 3, 2, 2, 6, 5, 7, 8, 8, 3));
        List<Integer> listNew = ListHandler.createNewList(listInput, 4);
        List<Integer> listExpected = new ArrayList<>(Arrays.asList(2, 3, 5, 6));
        Assert.assertEquals(listNew, listExpected);
    }

    @Test
    public void test2FindTheMinimalDigits() {
        List<Integer> listInput = new ArrayList<>(Arrays.asList(3, 3, 7, 3, 5, 3));
        List<Integer> listNew = ListHandler.createNewList(listInput, 5);
        List<Integer> listExpected = new ArrayList<>(Arrays.asList(3, 5, 7));
        Assert.assertEquals(listNew, listExpected);
    }

    @Test
    public void test3FindTheMinimalDigits() {
        List<Integer> listInput = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1));
        List<Integer> listNew = ListHandler.createNewList(listInput, 3);
        List<Integer> listExpected = new ArrayList<>(Arrays.asList(1));
        Assert.assertEquals(listNew, listExpected);
    }

    @Test
    public void test4FindTheMinimalDigits() {
        List<Integer> listInput = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0));
        List<Integer> listNew = ListHandler.createNewList(listInput, 4);
        List<Integer> listExpected = new ArrayList<>(Arrays.asList(0, 1, 2, 3));
        Assert.assertEquals(listNew, listExpected);
    }

    @Test
    public void test5FindTheMinimalDigits() {
        List<Integer> listInput = new ArrayList<>(Arrays.asList(7, 3, 9, 2, 6, 6, 6, 4, 3, 7));
        List<Integer> listNew = ListHandler.createNewList(listInput, 3);
        List<Integer> listExpected = new ArrayList<>(Arrays.asList(2, 3, 4));
        Assert.assertEquals(listNew, listExpected);
    }
}


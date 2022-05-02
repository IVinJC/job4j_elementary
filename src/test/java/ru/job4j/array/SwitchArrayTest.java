package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to4() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 2, 3, 4, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to5() {
        int[] input = {10, 2, 3, 4, 5, 8};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {8, 2, 3, 4, 5, 10};
        Assert.assertArrayEquals(expected, result);
    }
}
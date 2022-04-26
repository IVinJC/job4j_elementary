package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {
    @Test
    public void whenA1B1C1X1Then40() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 30;
        int rsl = X2.calc(a, b, c, x);
        assertEquals(expected, rsl);
    }
    @Test
    public void whenA0B1C1X1Then40() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 10;
        int rsl = X2.calc(a, b, c, x);
        assertEquals(expected, rsl);
    }
    @Test
    public void whenA1B1C0X1Then40() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 15;
        int rsl = X2.calc(a, b, c, x);
        assertEquals(expected, rsl);
    }
    @Test
    public void whenA1B1C1X0Then40() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 5;
        int rsl = X2.calc(a, b, c, x);
        assertEquals(expected, rsl);
    }
}
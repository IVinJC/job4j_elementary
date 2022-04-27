package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to35then3() {
        double expected = 3;
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3x4to8x12then5() {
        double expected = 5;
        int x1 = 3;
        int y1 = 4;
        int x2 = 8;
        int y2 = 12;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2x4to8x15then10() {
        double expected = 10;
        int x1 = 2;
        int y1 = 4;
        int x2 = 8;
        int y2 = 15;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
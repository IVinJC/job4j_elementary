package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then12dot52() {
        double expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point2.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to35then3dot61() {
        double expected = 3.61;
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 5);
        double out = point2.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3x4to8x12then9dot43() {
        double expected = 9.43;
        Point point1 = new Point(3, 4);
        Point point2 = new Point(8, 12);
        double out = point2.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2x4to8x15then12dot53() {
        double expected = 12.53;
        Point point1 = new Point(2, 4);
        Point point2 = new Point(8, 15);
        double out = point2.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2x4x8to8x15x20then17dot35() {
        double expected = 17.35;
        Point point1 = new Point(2, 4, 8);
        Point point2 = new Point(8, 15, 20);
        double out = point2.distance3d(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1x3x4to7x10x12then12dot21() {
        double expected = 12.21;
        Point point1 = new Point(1, 3, 4);
        Point point2 = new Point(7, 10, 12);
        double out = point2.distance3d(point1);
        Assert.assertEquals(expected, out, 0.01);
    }
}
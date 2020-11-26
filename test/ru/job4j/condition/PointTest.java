package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when03To05Then2() {

        double expected = 2;
        int x1 = 0;
        int y1 = 3;
        int x2 = 0;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);

    }

    @Test
    public void when30To70Then4() {

        double expected = 4;
        int x1 = 3;
        int y1 = 0;
        int x2 = 7;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);

    }

    @Test
    public void when00To11Then4() {

        double expected = 1.41;
        int x1 = 0;
        int y1 = 0;
        int x2 = 1;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);

    }

}
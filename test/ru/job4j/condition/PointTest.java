package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when03To05Then2() {

        double expected = 2;
        Point one = new Point(0, 3);
        Point two = new Point(0, 5);
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.1);

    }

    @Test
    public void when000To001Then1() {

        double expected = 1;
        Point one = new Point(0, 0, 0);
        Point two = new Point(0, 0, 1);
        double out = one.distance3d(two);
        Assert.assertEquals(expected, out, 0.1);

    }

    @Test
    public void when000To111Then173() {

        double expected = 1.73;
        Point one = new Point(0, 0, 0);
        Point two = new Point(1, 1, 1);
        double out = one.distance3d(two);
        Assert.assertEquals(expected, out, 0.01);

    }

}
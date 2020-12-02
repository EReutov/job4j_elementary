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

}
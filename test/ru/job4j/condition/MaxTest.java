package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when2And3Then3() {
        int a = 2, b = 3;
        int expected = 3;
        int out = Max.max(a, b);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when5And1Then5() {
        int a = 5, b = 1;
        int expected = 5;
        int out = Max.max(a, b);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when7And7Then7() {
        int a = 7, b = 7;
        int expected = 7;
        int out = Max.max(a, b);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when7And1And5Then7() {
        int a = 7, b = 1, c = 5;
        int expected = 7;
        int out = Max.max(a, b, c);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when7And1And5And9Then9() {
        int a = 7, b = 1, c = 5, d = 9;
        int expected = 9;
        int out = Max.max(a, b, c, d);
        Assert.assertEquals(expected, out);
    }

}
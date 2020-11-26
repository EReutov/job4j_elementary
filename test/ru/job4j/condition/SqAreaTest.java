package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP3K1Then0562() {
        int p = 3, k = 1;
        double expected = 0.5625;
        double out = SqArea.square(3, 1);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenP10K3Then46875() {
        int p = 10, k = 3;
        double expected = 4.6875;
        double out = SqArea.square(10, 3);
        Assert.assertEquals(expected, out, 0.001);
    }

}
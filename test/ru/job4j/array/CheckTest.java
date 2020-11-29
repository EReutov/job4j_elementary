package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenMonoArrayThanTrue() {
        boolean[] arrayIn = {true, true, true, true};
        boolean expected = true;
        boolean out = Check.mono(arrayIn);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMixArrayThanFalse() {
        boolean[] arrayIn = {true, true, false, true};
        boolean expected = false;
        boolean out = Check.mono(arrayIn);
        Assert.assertEquals(expected, out);
    }
}
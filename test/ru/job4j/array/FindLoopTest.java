package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas7Then7() {
        int[] input = {5, 4, 3, 2, 4, 1, 0, 7, 8};
        int value = 7;
        int result = FindLoop.indexOf(input, value);
        int expect = 7;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas10ThenMinus1() {
        int[] input = {5, 4, 3, 2, 4, 1, 0, 7, 8};
        int value = 10;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind2() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 10;
        int start = 1;
        int finish = 3;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotFind() {
        int[] input = new int[] {5, 2, 10, 2, 99};
        int value = 99;
        int start = 0;
        int finish = 3;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

}
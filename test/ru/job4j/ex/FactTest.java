package ru.job4j.ex;

import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenCalcBelowZero() {
        new Fact().calc(-1);
    }
}
package ru.job4j.ex;

import org.junit.Test;

public class FactTest {
    @Test (expected = IllegalArgumentException.class)
    public void whennless0() {
        int rsl = new Fact().calc(-10);
    }
}
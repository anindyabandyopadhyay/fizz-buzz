package com.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz cut;

    @Test
    public void testFizz()
    {
        assertEquals("Fizz", cut.getFizzBuzz(3));
        assertEquals("Fizz", cut.getFizzBuzz(6));
        assertEquals("Fizz", cut.getFizzBuzz(13));
        assertEquals("Fizz", cut.getFizzBuzz(18));
        assertEquals("Fizz", cut.getFizzBuzz(23));
    }

    @Test
    public void testBuzz()
    {
        assertEquals("Buzz", cut.getFizzBuzz(5));
        assertEquals("Buzz", cut.getFizzBuzz(10));
        assertEquals("Buzz", cut.getFizzBuzz(25));
    }

    @Test
    public void testFizzBuzz()
    {
        assertEquals("FizzBuzz", cut.getFizzBuzz(15));
        assertEquals("FizzBuzz", cut.getFizzBuzz(30));
        assertEquals("FizzBuzz", cut.getFizzBuzz(45));
    }

    @Test
    public void testNumbers()
    {
        assertEquals("7", cut.getFizzBuzz(7));
        assertEquals("16", cut.getFizzBuzz(16));
        assertEquals("28", cut.getFizzBuzz(28));
    }

    @Before
    public void setup()
    {
        cut = new FizzBuzz();
    }

}
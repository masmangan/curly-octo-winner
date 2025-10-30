package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        String expected = "Hello World!";
        String actual = Main.greetings();
        assertTrue(  expected.equals(actual) );
    }
}

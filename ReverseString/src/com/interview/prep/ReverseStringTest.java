package com.interview.prep;

import static org.junit.Assert.*;
import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void testReverseRegularString() {
        String input = "Hello World!";
        String expected = "!dlroW olleH";
        assertEquals(expected, ReverseString.reverse(input));
    }

    @Test
    public void testReverseEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, ReverseString.reverse(input));
    }

    @Test
    public void testReverseSingleCharacter() {
        String input = "A";
        String expected = "A";
        assertEquals(expected, ReverseString.reverse(input));
    }

    @Test
    public void testReversePalindrome() {
        String input = "madam";
        String expected = "madam";
        assertEquals(expected, ReverseString.reverse(input));
    }

    @Test
    public void testReverseWithSpaces() {
        String input = " a b ";
        String expected = " b a ";
        assertEquals(expected, ReverseString.reverse(input));
    }

    @Test(expected = NullPointerException.class)
    public void testReverseNull() {
        ReverseString.reverse(null);
    }
}

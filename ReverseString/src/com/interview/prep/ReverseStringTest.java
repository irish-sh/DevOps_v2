package com.interview.prep;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

    @Test
    void testReverseRegularString() {
        String input = "Hello World!";
        String expected = "!dlroW olleH";
        assertEquals(expected, ReverseString.reverse(input));
    }

    @Test
    void testReverseEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, ReverseString.reverse(input));
    }

    @Test
    void testReverseSingleCharacter() {
        String input = "A";
        String expected = "A";
        assertEquals(expected, ReverseString.reverse(input));
    }

    @Test
    void testReversePalindrome() {
        String input = "madam";
        String expected = "madam";
        assertEquals(expected, ReverseString.reverse(input));
    }

    @Test
    void testReverseWithSpaces() {
        String input = " a b ";
        String expected = " b a ";
        assertEquals(expected, ReverseString.reverse(input));
    }

    @Test
    void testReverseNull() {
        assertThrows(NullPointerException.class, () -> {
            ReverseString.reverse(null);
        });
    }
}

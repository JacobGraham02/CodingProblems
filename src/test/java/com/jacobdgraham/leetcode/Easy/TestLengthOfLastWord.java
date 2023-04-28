package com.jacobdgraham.leetcode.Easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestLengthOfLastWord {
    public static LengthOfLastWord lengthOfLastWord;

    @BeforeAll
    public static void setUp() {
        lengthOfLastWord = new LengthOfLastWord();
    }

    @Test
    void lengthOfLastWordInSentenceIs4() {
        String input_string = "     Fly me  to    the   moon  ";
        int expected_word_length = 4;
        assertEquals(expected_word_length, lengthOfLastWord.lengthOfLastWord(input_string));
    }

    @BeforeAll
    public static void tearDown() {
        lengthOfLastWord = null;
    }
}

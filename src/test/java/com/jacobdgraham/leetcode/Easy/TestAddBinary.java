package com.jacobdgraham.leetcode.Easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestAddBinary {
    private static AddBinary addBinary;

    @BeforeAll
    public static void setUp() {
        addBinary = new AddBinary();
    }

    @Test
    void testTwoBinaryStringsSumToBinaryString() {
        String first_binary_string = "1010";
        String second_binary_string = "1011";
        String expected_result_binary_string = "10101";
        String actual_result_binary_string = addBinary.addBinary(first_binary_string, second_binary_string);
        assertEquals(expected_result_binary_string, actual_result_binary_string);
    }

    @AfterAll
    public static void tearDown() {
        addBinary = null;
    }
}

package com.jacobdgraham.leetcode.Easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestPlusOne {
    
    private static PlusOne plusOne;

    @BeforeAll
    public static void setUp() {
        plusOne = new PlusOne();
    }

    @Test
    void testPlusOneWithNoNineInArray() {
        int digits[] = {4,3,2,1};
        int expectedResult[] = {4,3,2,2};
        int[] resultOfPlusOne = plusOne.plusOne(digits);
        String stringResultOfPlusOne = Arrays.toString(resultOfPlusOne);
        assertEquals(Arrays.toString(expectedResult), stringResultOfPlusOne);
    }

    @Test
    void testPlusOneWithNineInArray() {
        int digits[] = {9};
        int expectedResult[] = {1,0};
        int resultOfPlusOne[] = plusOne.plusOne(digits);
        String stringResultOfPlusOne = Arrays.toString(resultOfPlusOne);
        assertEquals(Arrays.toString(expectedResult), stringResultOfPlusOne); 
    }

    @AfterAll
    public static void tearDown() {
        plusOne = null;
    }
}

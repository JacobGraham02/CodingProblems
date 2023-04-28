package com.jacobdgraham.leetcode.Easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestSqrt_x_ {
    private static Sqrt_x_ sqrt;

    @BeforeAll
    public static void setUp() {
        sqrt = new Sqrt_x_();
    }

    @Test
    void testSqrtOf8EqualsInteger2() {
        int number_to_sqroot = 8;
        int expected_result_of_sqroot = 2;
        int result_of_sqroot = sqrt.mySqrt(number_to_sqroot);
        assertEquals(expected_result_of_sqroot, result_of_sqroot);
    }

    @AfterAll
    public static void tearDown() {
        sqrt = null;
    }
}

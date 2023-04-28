package com.jacobdgraham.leetcode.Easy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestClimbStairs {

    ClimbStairs climbStairsInstance;

    @BeforeEach
    void setUp() {
        climbStairsInstance = new ClimbStairs();
    }

    @Test
    public void testClimbStairsInput5() {
        int testNum = 5;
        int expectedTestResult = 8;
        int climbStairsResult = climbStairsInstance.climbStairs(testNum);
        assertEquals(expectedTestResult, climbStairsResult);
    }

    @Test
    public void testClimbStairsNegativeInput() {
        int testNum = -12;
        int expectedTestResult = 0;
        int climbStairsResult = climbStairsInstance.climbStairs(testNum);
        assertEquals(expectedTestResult, climbStairsResult);
    }

    @Test
    public void testClimbStairsEdgeCasePositiveInput() {
        int testNum = 20064;
        int climbStairsResult = climbStairsInstance.climbStairs(testNum);
        assertNotEquals(0, climbStairsResult);
    }
}

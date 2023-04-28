package com.jacobdgraham.leetcode.Easy;

public class ClimbStairs {

    /*
    You are climbing a staircase. It takes n steps to reach the top.

    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

        Example 1:

        Input: n = 2
        Output: 2
        Explanation: There are two ways to climb to the top.
        1. 1 step + 1 step
        2. 2 steps

        Example 2:

        Input: n = 3
        Output: 3
        Explanation: There are three ways to climb to the top.
        1. 1 step + 1 step + 1 step
        2. 1 step + 2 steps
        3. 2 steps + 1 step

     */
    public int climbStairs(int n) {
        // If there are 0 stairs to climb there is invalid input
        if (n <= 0) {
            return 0;
        }
        // 1 stair to climb will always return only 1 combination of stairs to climb
        if (n == 1) {
            return 1;
        }
        final int[] climbStairsArray = new int[n];

        // We will build additional combinations from previous combinations, so we must pre-fill our array
        climbStairsArray[0] = 1;
        climbStairsArray[1] = 2;

        // Beginning at the new array location for the number of combinations, perform a fibonacchi-like calculation
        // which uses the previous 2 inputs in the array to calculate the new input.
        for (int i = 2; i < n; i++) {
            climbStairsArray[i] = climbStairsArray[i-1] + climbStairsArray[i-2];
        }

        return climbStairsArray[n-1];
    }
}

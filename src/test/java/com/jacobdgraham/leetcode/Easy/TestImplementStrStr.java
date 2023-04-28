package com.jacobdgraham.leetcode.Easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestImplementStrStr {
    
    private static ImplementStrStr implementStrStr;

    @BeforeAll
    public static void setUp() {
        implementStrStr = new ImplementStrStr();
    }

    @Test
    public void test3CharacterNeedleExistsInHaystack() {
        String haystack = "hello";
        String needle = "llo";
        int expectedNeedleStartingIndex = 2;
        assertEquals(expectedNeedleStartingIndex, implementStrStr.strStr(haystack, needle));
    }

    @AfterAll
    public static void tearDown() {
        implementStrStr = null;
    }
}

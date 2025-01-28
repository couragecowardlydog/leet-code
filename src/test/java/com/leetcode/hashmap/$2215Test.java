package com.leetcode.hashmap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $2215Test {

    $2215 solution = new $2215();

    @Test
    public void testSolution() {
        solution.findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2});
    }
}
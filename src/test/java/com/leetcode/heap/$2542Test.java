package com.leetcode.heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $2542Test {

    $2542 solution = new $2542();

    @Test
    public void smoke() {
        assertEquals(12, solution.maxScore(new int[]{1,3,3,2}, new int[]{2,1,3,4}, 3));
    }

}
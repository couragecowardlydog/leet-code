package com.leetcode.slidingwindow;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $1004Test {

    $1004 solution = new $1004();

    public Stream<Arguments> inputs() {
        return Stream.of(
                arguments(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2, 6),
                arguments(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int[] nums, int k, int expected) {
        assertEquals(expected, solution.longestOnes(nums, k));
    }

}
package com.leetcode.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $735Test {

    $735 solution = new $735();

    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(new int[]{5, 10, -5}, new int[]{5, 10}),
                Arguments.arguments(new int[]{8, -8}, new int[]{}),
                Arguments.arguments(new int[]{-2, -1, 1, 2}, new int[]{-2, -1, 1, 2}),
                Arguments.arguments(new int[]{-2, -2, 1, -2}, new int[]{-2, -2, -2}),
                Arguments.arguments(new int[]{1,-2,-2,-2}, new int[]{-2, -2, -2}),
                Arguments.arguments(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, -9}, new int[]{1, 2, 3, 4, 5, 6, 7, 8})
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int[] nums, int[] expected) {
        Assertions.assertArrayEquals(expected, solution.asteroidCollision(nums));
    }
}
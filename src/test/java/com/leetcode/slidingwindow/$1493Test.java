package com.leetcode.slidingwindow;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $1493Test {

    private final $1493 solution = new $1493();

    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 1, 0, 1}, 3),
                Arguments.arguments(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}, 5),
                Arguments.arguments(new int[]{1, 1, 1}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int[] nums, int expected) {
        assertEquals(expected, solution.longestSubarray(nums));
    }

}
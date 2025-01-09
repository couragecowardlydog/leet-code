package com.leetcode.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $238Test {

    private final $238 solution = new $238();


    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 2, 3, 4, 5}, new int[]{120, 60, 40, 30, 24}),
                Arguments.arguments(new int[]{-1, 1, 0, -3, 3}, new int[]{0, 0, 9, 0, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int[] input, int[] expected) {
        assertArrayEquals(expected, solution.productExceptSelf(input));
    }
}
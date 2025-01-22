package com.leetcode.twopointers;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $1679Test {

    private final $1679 solution = new $1679();


    public Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 2, 3, 4}, 5, 2),
                Arguments.arguments(new int[]{3, 1, 5, 1, 1, 1, 1, 1, 2, 2, 3, 2, 2}, 1, 0),
                Arguments.arguments(new int[]{3, 5, 1, 5}, 2, 0),
                Arguments.arguments(new int[]{4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4}, 2, 2),
                Arguments.arguments(new int[]{3, 1, 3, 4, 3}, 6, 1),
                Arguments.arguments(new int[]{3, 6, 7, 5, 4, 1, 7, 8, 2, 4}, 8, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void test(int[] input, int k, int expectedResult) {
        assertEquals(expectedResult, solution.maxOperations(input, k));
    }
}
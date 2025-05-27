package com.leetcode.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $1947Test {

    $1947 solution = new $1947();

    public Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.arguments(8, new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 1}}, new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 1, 0}}),
                Arguments.arguments(10, new int[][]{{0, 1, 0, 1, 1, 1}, {1, 0, 0, 1, 0, 1}, {1, 0, 1, 1, 0, 0}}, new int[][]{{1, 0, 0, 0, 0, 1}, {0, 1, 0, 0, 1, 1}, {0, 1, 0, 0, 1, 1}})
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    public void test(int expected, int[][] scores, int[][] mentors) {
        Assertions.assertEquals(expected, solution.maxCompatibilitySum(scores, mentors));
    }

}
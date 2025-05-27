package com.leetcode.backtracking;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $22Test {

    $22 solution = new $22();

    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(4, 14)
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int input, int expected) {
        assertEquals(expected, solution.generateParenthesis(input).size());
    }

}
package com.leetcode.backtracking;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $79Test {

    $79 solution = new $79();

    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED", true),
                Arguments.arguments(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "SEE", true),
                Arguments.arguments(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCB", false),
                Arguments.arguments(new char[][]{{'a','b'}}, "ba", true)
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(char[][] arr, String word, boolean expected) {
        assertEquals(expected, solution.exist(arr, word));
    }

}
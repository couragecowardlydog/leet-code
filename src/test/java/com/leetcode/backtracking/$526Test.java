package com.leetcode.backtracking;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $526Test {



    public Stream<Arguments> inputs(){
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(3, 3),
                Arguments.of(4, 8),
                Arguments.of(5, 10),
                Arguments.of(6, 36),
                Arguments.of(7, 41),
                Arguments.of(8, 132)
        );
    }

    @MethodSource("inputs")
    @ParameterizedTest
    public void test(int n, int expected) {
        $526 solution = new $526();
        int result = solution.countArrangement(n);
        assertEquals(expected, result);

    }

}
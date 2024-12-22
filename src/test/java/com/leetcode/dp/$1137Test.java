package com.leetcode.dp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $1137Test {

    $1137 solution = new $1137();


    public Stream<Arguments> inputs() {
        return Stream.of(
//                Arguments.arguments(1, 1),
//                Arguments.arguments(2, 1),
//                Arguments.arguments(4, 4),
                Arguments.arguments(25, 1389537)
        );
    }


    @ParameterizedTest
    @MethodSource("inputs")
    public void smoke(int n, int result) {
        assertEquals(result, solution.tribonacci(n));
    }
}
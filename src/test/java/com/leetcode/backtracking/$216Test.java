package com.leetcode.backtracking;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $216Test {

    $216 solution = new $216();

    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(3, 7),
                Arguments.arguments(3, 9)
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int k, int n) {
        solution.combinationSum3(k, n);
    }
}
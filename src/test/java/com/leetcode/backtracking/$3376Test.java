package com.leetcode.backtracking;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $3376Test {

    $3376 solution = new $3376();

    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(new ArrayList<>(Arrays.asList(3, 4, 1)), 1, 4),
                Arguments.arguments(new ArrayList<>(Arrays.asList(3, 4, 1, 4)), 1, 5),
                Arguments.arguments(new ArrayList<>(Arrays.asList(2, 5, 4)), 2, 5),
                Arguments.arguments(new ArrayList<>(Arrays.asList(45)), 10, 45),
                Arguments.arguments(new ArrayList<>(Arrays.asList(7,3,6,18,22,50)), 4, 12)
        );

    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(List<Integer> list, int k, int expected) {
        assertEquals(expected, solution.findMinimumTime(list, k));
    }

}
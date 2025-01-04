package com.leetcode.heap;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $215Test {

    $215 solution = new $215();

    public Stream<Arguments> parameters() {
        return Stream.of(
                arguments(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4, 4),
                arguments(new int[]{3, 2, 1, 5, 6, 4}, 2, 5),
                arguments(new int[]{10000, -10000, 0}, 2, 0),
                arguments(new int[]{10000, -10000, 0}, 2, 0),
                arguments(new int[]{99, 99}, 1, 99),
                arguments(new int[]{3, 2, 1, 5, 6, 4}, 2, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void test(int[] arr, int k, int num) {
        assertEquals(num, solution.findKthLargest2(arr, k));
    }

}
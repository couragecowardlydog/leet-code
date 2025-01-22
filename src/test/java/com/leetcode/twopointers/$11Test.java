package com.leetcode.twopointers;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $11Test {

    $11 solution = new $11();


    public Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void test(int[] nums, int expected) {
        assertEquals(expected, solution.maxArea(nums));
    }
}
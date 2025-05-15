package com.leetcode.binarysearch;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $162Test {

    private final $162 solution = new $162();


    public Stream<Arguments> inputs() {
        return Stream.of(
//                Arguments.arguments(new int[]{1, 2, 3, 1}, 2),
                Arguments.arguments(new int[]{5, 4, 3, 2, 1}, 0),
                Arguments.arguments(new int[]{1, 2, 3, 4, 5}, 4)
        );
    }

    @MethodSource("inputs")
    @ParameterizedTest
    public void test(int[] nums, int result) {
        assertEquals(result, solution.findPeakElement(nums));
    }
}
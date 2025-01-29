package com.leetcode.hashmap;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $1207Test {

    $1207 solution = new $1207();


    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 2, 2, 1, 1, 3}, true),
                Arguments.arguments(new int[]{1, 2}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int[] nums, boolean expected) {
        assertEquals(expected, solution.uniqueOccurrences(nums));
    }
}
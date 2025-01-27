package com.leetcode.prefixsum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $724Test {

    $724 solution = new $724();

    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 7, 3, 6, 5, 6}, 3),
                Arguments.arguments(new int[]{1,2,3}, -1),
                Arguments.arguments(new int[]{2,1,-1}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void smokeTest(int[] nums, int expected) {
        Assertions.assertEquals(expected, solution.pivotIndex(nums));
    }

}
package com.leetcode.prefixsum;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $1732Test {

    $1732 solution = new $1732();

    public Stream<Arguments> inputs() {
        return Stream.of(
                arguments(new int[]{-5, 1, 5, 0, -7}, 1),
                arguments(new int[]{-4,-3,-2,-1,4,3,2}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int[] nums, int result) {
        assertEquals(result, solution.largestAltitude(nums));
    }

}
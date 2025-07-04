package com.leetcode.dp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $213Test {

    $213 obj = new $213();


    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(new int[]{2, 3, 2}, 3),
                Arguments.arguments(new int[]{2, 1, 1, 2}, 3),
                Arguments.arguments(new int[]{1, 2, 3, 1}, 4),
                Arguments.arguments(new int[]{1, 2, 3}, 3),
                Arguments.arguments(new int[]{6, 6, 4, 8, 4, 3, 3, 10}, 27),
                Arguments.arguments(new int[]{1, 1, 3, 6, 7, 10, 7, 1, 8, 5, 9, 1, 4, 4, 3}, 41),
                Arguments.arguments(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5}, 16)
        );
    }

    @MethodSource("inputs")
    @ParameterizedTest
    public void test(int[] nums, int expected) {
        assertEquals(expected, obj.rob(nums));
    }

}
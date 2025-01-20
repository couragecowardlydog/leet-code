package com.leetcode.twopointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $283Test {

    $283 solution = new $283();


    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(new int[]{5, 0, 3, 0, 0, 0, 1, 0}, new int[]{5, 3, 1, 0, 0, 0, 0, 0}),
                Arguments.arguments(new int[]{5, 0, 3, 0, 0, 0, 0, 1}, new int[]{5, 3, 1, 0, 0, 0, 0, 0}),
                Arguments.arguments(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void smoke(int[] arr, int[] result) {
        assertArrayEquals(result, solution.moveZeroes(arr));
    }

}
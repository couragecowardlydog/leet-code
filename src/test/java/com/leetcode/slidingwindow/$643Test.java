package com.leetcode.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $643Test {


    private $643 code;

    @BeforeAll
    public void init() {
        this.code = new $643();
    }

    @Test
    public void smoke() {
        assertEquals(12.75, code.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4), 1e-5);
    }


    public Stream<Arguments> inputs() {
        return Stream.of(
                arguments(new int[]{1, 12, -5, -6, 50, 3}, 4, 12.75),
                arguments(new int[]{5}, 1, 5),
                arguments(new int[]{-1}, 1, -1),
                arguments(new int[]{3, 3, 4, 3, 0}, 3, 3.33333),
                arguments(new int[]{4, 2, 1, 3, 3}, 2, 3.0),
                arguments(new int[]{7, 4, 5, 8, 8, 3, 9, 8, 7, 6}, 7, 7.00000)
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int[] arr, int k, double expected) {
        assertEquals(expected, this.code.findMaxAverage(arr, k), 1e-5);
    }

}
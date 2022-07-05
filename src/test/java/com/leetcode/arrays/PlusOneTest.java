package com.leetcode.arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PlusOneTest {

    PlusOne code;

    @BeforeAll
    public void init() {
        code = new PlusOne();
    }

    public Stream inputs() {
        return Stream.of(
                arguments(new int[]{1, 2, 4}, new int[]{1, 2, 3}),
                arguments(new int[]{1, 0, 0, 0}, new int[]{9, 9, 9}),
                arguments(new int[]{1, 0}, new int[]{9}),
                arguments(new int[]{9, 9, 0}, new int[]{9, 8, 9}),
                arguments(new int[]{9, 9, 8, 9, 0}, new int[]{9, 9, 8, 8, 9}),
                arguments(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 1}, new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})
        );
    }


    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int[] output, int[] digits) {
        Assertions.assertArrayEquals(output, code.plusOne(digits));
    }
}
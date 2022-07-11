package com.leetcode.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SqrtTest {
    Sqrt code;

    @BeforeAll
    void init() {
        code = new Sqrt();
    }

    Stream<Arguments> inputs() {
        return Stream.of(
                arguments(3, 9),
                arguments(2, 8),
                arguments(5, 25),
                arguments(1, 1),
                arguments(4, 21),
                arguments(10, 100),
                arguments(46340, Integer.MAX_VALUE)
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    void test(int expected, int x) {
        Assertions.assertEquals(expected, code.mySqrt(x));

    }
}
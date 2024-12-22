package com.leetcode.code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $189Test {

    private $189 code;

    @BeforeAll
    public void init() {
        this.code = new $189();
    }


    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(new int[]{3, 99, -1, -100}, new int[]{-1, -100, 3, 99}, 2),
                Arguments.arguments(new int[]{4, 5, 6, 7, 1, 2, 3}, new int[]{1, 2, 3, 4, 5, 6, 7}, 4)
//                Arguments.arguments(new int[]{5, 6, 7, 1, 2, 3, 4}, new int[]{1, 2, 3, 4, 5, 6, 7}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int[] expected, int[] actual, int k) {
        Assertions.assertArrayEquals(expected, this.code.rotate(actual, k));
        ;
    }
}
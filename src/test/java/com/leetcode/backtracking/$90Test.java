package com.leetcode.backtracking;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $90Test {

    $90 solution = new $90();

    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 2, 3}),
                Arguments.arguments(new int[]{2, 2, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int[] arr) {
        System.out.println(solution.subsetsWithDup(arr));
    }

}
package com.leetcode.backtracking;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $47Test {

    $47 solution = new $47();

    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 1, 2, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int[] arr) {
        System.out.println(solution.permuteUnique(arr));
    }

}
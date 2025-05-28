package com.leetcode.backtracking;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $39Test {

    $39 solution = new $39();

    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(new int[]{2, 3, 6, 7}, 7),
                Arguments.arguments(new int[]{2,3,5}, 8)
        );
    }

    @MethodSource("inputs")
    @ParameterizedTest
    public void test(int[] candidates, int target) {
        System.out.println(solution.combinationSum(candidates, target));
    }

}
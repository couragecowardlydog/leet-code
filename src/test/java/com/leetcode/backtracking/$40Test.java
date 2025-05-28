package com.leetcode.backtracking;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $40Test {

    $40 solution = new $40();

    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(new int[]{10, 1, 2, 7, 6, 1, 5}, 8)
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int[] candidates, int target) {
        System.out.println(solution.combinationSum2(candidates, target));
    }

}
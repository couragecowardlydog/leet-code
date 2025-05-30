package com.leetcode.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $1986Test {


    $1986 solution = new $1986();

    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(new int[]{2, 2, 2, 2, 2, 3}, 3, 6),
                Arguments.arguments(new int[]{1,2,3,4,5}, 5, 5),
                Arguments.arguments(new int[]{3,1,3,1,1}, 8, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int[] tasks, int sessionTime, int result) {
        Assertions.assertEquals(result, solution.minSessions(tasks, sessionTime));
    }
}
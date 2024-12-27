package com.leetcode.hashmap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $2352Test {

    $2352 solution = new $2352();

    @Test
    public void smokeTest() {

        int[][] grid = new int[][]{
                {3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}
        };
        assertEquals(1, solution.equalPairs(grid));

    }


    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(new int[][]{}, 0),
                Arguments.arguments(new int[][]{
                        {3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}
                }, 3),
                Arguments.arguments(new int[][]{
                        {11, 1},
                        {1, 11}
                }, 2)
        );
    }


    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int[][] grid, int result) {
        assertEquals(result, solution.equalPairs(grid));
    }

}
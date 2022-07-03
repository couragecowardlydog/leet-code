package com.leetcode.arrays;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SearchInsertPositionTest {

    SearchInsertPosition code;

    @BeforeAll
    public void init() {
        code = new SearchInsertPosition();
    }

    public Stream inputs() {
        return Stream.of(
                arguments(1, new int[]{1}, 5),
                arguments(0, new int[]{1}, 1),
                arguments(0, new int[]{1}, -1),
                arguments(2, new int[]{1, 3, 5, 6}, 5),
                arguments(1, new int[]{1, 3, 5, 6}, 2),
                arguments(4, new int[]{1, 3, 5, 6}, 7),
                arguments(2, new int[]{3, 9, 17, 24, 35, 56, 73, 1002}, 12),
                arguments(0, new int[]{3, 9, 17, 24, 35, 56, 73, 1002}, 1),
                arguments(7, new int[]{3, 9, 17, 24, 35, 56, 73, 1002}, 1000),
                arguments(6, new int[]{3, 9, 17, 24, 35, 56, 1000, 1002}, 1000),
                arguments(7, new int[]{3, 9, 17, 24, 35, 56, 1000, 1002}, 1001),
                arguments(6, new int[]{3, 9, 17, 24, 35, 56, 1000, 1002}, 999),
                arguments(8, new int[]{3, 9, 17, 24, 35, 56, 1000, 1002}, 1003),
                arguments(0, new int[]{1, 2, 3, 4, 6, 7, 8, 9}, 1)

        );
    }


    @ParameterizedTest(name = "{index} Input:{1} looking for {2}, expected:{0}")
    @MethodSource("inputs")
    void test(int expected, int[] nums, int target) {
        Assert.assertEquals(expected, code.searchInsert(nums, target));
    }
}
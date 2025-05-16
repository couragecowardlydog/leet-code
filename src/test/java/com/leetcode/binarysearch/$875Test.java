package com.leetcode.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $875Test {
    $875 solution = new $875();


    public Stream<Arguments> inputs() {

        return Stream.of(
                Arguments.arguments(new int[]{3, 6, 7, 11}, 8, 4),
                Arguments.arguments(new int[]{30, 11, 23, 4, 20}, 6, 23),
                Arguments.arguments(new int[]{332484035, 524908576, 855865114, 632922376, 222257295, 690155293, 112677673, 679580077, 337406589, 290818316, 877337160, 901728858, 679284947, 688210097, 692137887, 718203285, 629455728, 941802184}, 823855818, 14),
                Arguments.arguments(new int[]{30, 11, 23, 4, 20}, 5, 30),
                Arguments.arguments(new int[]{312884470}, 968709470, 1)
        );
    }


    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int[] nums, int h, int expected) {
        Assertions.assertEquals(expected, solution.minEatingSpeed(nums, h));
    }

}
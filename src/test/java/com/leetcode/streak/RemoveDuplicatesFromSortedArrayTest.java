package com.leetcode.streak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray code;

    @BeforeAll
    public void setup() {
        this.code = new RemoveDuplicatesFromSortedArray();
    }

    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(5, new int[]{1, 1, 1, 2, 2, 3}),
                Arguments.arguments(7, new int[]{1, 1, 1, 2, 2, 3, 3, 3, 5}),
                Arguments.arguments(8, new int[]{1, 1, 1, 2, 2, 3, 3, 3, 5, 5}),
                Arguments.arguments(7, new int[]{1, 1, 1, 2, 2, 3, 3, 3, 5}),
                Arguments.arguments(7, new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}),
                Arguments.arguments(8, new int[]{1, 2, 3, 4, 5, 6, 7, 8}),
                Arguments.arguments(1, new int[]{1}),
                Arguments.arguments(5, new int[]{1,1,1,1,2,2,3})
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int expected, int[] array) {
        Assertions.assertEquals(expected, code.removeDuplicates(array));
    }

}
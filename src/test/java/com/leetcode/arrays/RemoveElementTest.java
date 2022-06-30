package com.leetcode.arrays;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RemoveElementTest {

    RemoveElement code;

    @BeforeAll
    public void init() {
        code = new RemoveElement();
    }

    public Stream inputs() {
        return Stream.of(
                arguments(5, new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2),
                arguments(2, new int[]{3, 2, 2, 3}, 3),
                arguments(0, new int[]{1}, 1),
                arguments(0, new int[]{3, 3, 3, 3, 3, 3}, 3),
                arguments(2, new int[]{3, 2, 2, 3}, 3),
                arguments(1, new int[]{2}, 3),
                arguments(0, new int[]{}, 3)
        );
    }


    @ParameterizedTest(name = "#{index} Test with {1}")
    @MethodSource("inputs")
    public void test(int expected, int[] nums, int val) {
        Assert.assertEquals(expected, code.removeElement(nums, val));
    }

}
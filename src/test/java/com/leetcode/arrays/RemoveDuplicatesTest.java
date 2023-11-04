package com.leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RemoveDuplicatesTest {

    RemoveDuplicates code;


    @BeforeAll
    public void init() {
        code = new RemoveDuplicates();
    }


    public Stream inputs() {
        return Stream.of(
                arguments(2, new int[]{1, 1, 2}),
                arguments(5, new int[]{0,0,1,1,1,2,2,3,3,4})
        );
    }


    @ParameterizedTest(name = "#{index} - Test with : {1}")
    @MethodSource("inputs")
    public void test(int expected, int[] input) {
        Assertions.assertEquals(expected, code.removeDuplicates(input));
    }

}
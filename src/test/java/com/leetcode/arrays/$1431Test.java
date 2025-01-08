package com.leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $1431Test {


    private final $1431 solution = new $1431();


    public Stream<Arguments> parameters() {
        return Stream.of(
                arguments(new int[]{2, 3, 5, 1, 3}, 3, new Boolean[]{true, true, true, false, true}),
                arguments(new int[]{4,2,1,1,2}, 1, new Boolean[]{true,false,false,false,false}),
                arguments(new int[]{12,1,12}, 10, new Boolean[]{true,false,true})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void test(int[] childrens, int extra, Boolean[] expected) {
       Boolean[] resilt =  solution.kidsWithCandies(childrens, extra).toArray(new Boolean[0]);
        assertArrayEquals(expected, resilt);
    }
}
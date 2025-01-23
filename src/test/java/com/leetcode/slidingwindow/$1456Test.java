package com.leetcode.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $1456Test {

    $1456 solution = new $1456();

    public Stream<Arguments> parameters() {
        return Stream.of(
                arguments("abciiidef", 3, 3),
                arguments("aeiou", 2, 2),
                arguments("leetcode", 3, 2)
        );
    }


    @ParameterizedTest
    @MethodSource("parameters")
    public void smokeTest(String s, int k, int expected) {
        Assertions.assertEquals(expected, solution.maxVowels(s, k));
    }
}
package com.leetcode.twopointers;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $382Test {

    $382 solution = new $382();

    public Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.arguments("abc", "ahbgdc", true),
                Arguments.arguments("axc", "ahbgdc", false)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void smokeTest(String s, String t, boolean result) {
        assertEquals(result, solution.isSubsequence(s, t));
    }

}
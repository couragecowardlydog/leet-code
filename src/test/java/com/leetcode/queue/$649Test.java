package com.leetcode.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $649Test {
    $649 solution = new $649();

    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments("DDRRR", "Dire"),
                Arguments.arguments("RRR", "Radiant"),
                Arguments.arguments("RD", "Radiant")
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    void decodeString(String input, String expectedResult) {
        Assertions.assertEquals(expectedResult, solution.predictPartyVictory(input));
    }
}
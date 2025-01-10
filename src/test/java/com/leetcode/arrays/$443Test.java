package com.leetcode.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $443Test {

    $443 solution = new $443();

    public Stream<Arguments> parameters() {
        return Stream.of(
                arguments(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}, 4),
                arguments(new char[]{'a'}, 1),
                arguments(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void test(char[] chars, int expected) {
        assertEquals(expected, solution.compress(chars));
    }
}
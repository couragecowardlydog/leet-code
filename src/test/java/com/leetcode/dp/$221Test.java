package com.leetcode.dp;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $221Test {

    $221 obj = new $221();


    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments(new char[][]{
                        {'1', '0', '1', '0', '0'},
                        {'1', '0', '1', '1', '1'},
                        {'1', '1', '1', '1', '1'},
                        {'1', '0', '0', '1', '0'}
                }, 4),
                Arguments.arguments(new char[][]{
                        {'0', '1'},
                        {'1', '0'}
                }, 1),
                Arguments.arguments(new char[][]{{'0'}}, 0)
        );
    }

    @MethodSource("inputs")
    @ParameterizedTest
    public void test(char[][] inputs, int expected) {
        assertEquals(expected, obj.maximalSquare(inputs));
    }

}
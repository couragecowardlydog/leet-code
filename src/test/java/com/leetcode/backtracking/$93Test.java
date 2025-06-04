package com.leetcode.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $93Test {

    $93 solution = new $93();


    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments("25525511135", new String[]{"255.255.11.135", "255.255.111.35"}),
                Arguments.arguments("0000", new String[]{"0.0.0.0"}),
                Arguments.arguments("101023", new String[]{"1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3"})
        );
    }


    @ParameterizedTest
    @MethodSource("inputs")
    public void test(String input, String[] expected) {
        Assertions.assertArrayEquals(expected, solution.restoreIpAddresses(input).toArray());

    }

}
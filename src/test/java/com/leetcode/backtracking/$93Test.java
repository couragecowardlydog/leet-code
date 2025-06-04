package com.leetcode.backtracking;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $93Test {

    $93 solution = new $93();

    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments("25525511135")
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(String input) {
        System.out.println(solution.restoreIpAddresses(input));
    }

}
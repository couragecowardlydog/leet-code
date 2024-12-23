package com.leetcode.stack;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $2390Test {

    private $2390 code;

    @BeforeAll
    public void init() {
        this.code = new $2390();
    }


    public Stream<Arguments> parameters() {
        return Stream.of(
                arguments("leet**cod*e", "lecoe"),
                arguments("erase*****", "")
        );
    }


    @ParameterizedTest
    @MethodSource("parameters")
    public void test(String input, String expected) {
        assertEquals(expected, this.code.removeStars(input));
    }

}
package com.leetcode.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AddBinaryTest {

    AddBinary code;

    @BeforeAll
    public void init() {
        code = new AddBinary();
    }


    public Stream<Arguments> inputs() {
        return Stream.of(
                arguments("10101", "1010", "1011"),
                arguments("100000", "10111", "1001"),
                arguments("10", "1", "1"),
                arguments("11", "10", "1")
        );
    }


    @ParameterizedTest
    @MethodSource("inputs")
    void testAddBinary(String expected, String a, String b) {
        Assertions.assertEquals(expected, code.addBinary(a, b));
    }


}
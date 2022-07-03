package com.leetcode.string;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LengthofLastWordTest {

    LengthofLastWord code;

    @BeforeAll
    public void init() {
        code = new LengthofLastWord();
    }

    public Stream<Arguments> input()  {
        return Stream.of(
                arguments(5, "Hello World"),
                arguments(4, "   fly me   to   the moon  "),
                arguments(6, "luffy is still joyboy"),
                arguments(6, "      joyboy"),
                arguments(1, "joyboy       i"),
                arguments(1, "i"),
                arguments(0, ""),
                arguments(0, " ")
        );
    }


    @ParameterizedTest
    @MethodSource("input")
    void test(int expected, String s) {
        Assertions.assertEquals(expected, code.lengthOfLastWord(s));
    }
}
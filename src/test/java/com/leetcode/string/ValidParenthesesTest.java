package com.leetcode.string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ValidParenthesesTest {



    public Stream<Arguments> inputs() {
        return Stream.of(
                arguments(true, "()"),
                arguments(true, "()[]{}"),
                arguments(false, "(]"),
                arguments(false, "()[]{}[{{(]}}]"),
                arguments(true, "{[]}")
        );
    }

    @ParameterizedTest(name = "#{index} - Test with : {1}")
    @MethodSource("inputs")
    public void test(boolean expected, String input) {
        ValidParentheses code = new ValidParentheses();
        Assertions.assertEquals(expected, code.isValid(input));
    }

}
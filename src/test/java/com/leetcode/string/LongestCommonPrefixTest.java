package com.leetcode.string;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LongestCommonPrefixTest {

    LongestCommonPrefix code;

    @BeforeAll
    public void init() {
        code = new LongestCommonPrefix();
    }

    public Stream<Arguments> inputs() {
        return Stream.of(
                arguments("fl", new String[]{"flower", "flow", "flight"}),
                arguments("", new String[]{"dog", "racecar", "car"}),
                arguments("a", new String[]{"a"}),
                arguments("c", new String[]{"cir","car"}),
                arguments("f", new String[]{"flower","fkow"})
        );
    }

    @ParameterizedTest(name = "#{index} - Test with : {1}")
    @MethodSource("inputs")
    public void test(String expected, String[] input) {
        Assert.assertEquals(expected, code.longestCommonPrefix(input));
    }

}
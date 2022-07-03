package com.leetcode.string;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ImplementstrStrTest {

    ImplementstrStr code;

    @BeforeAll
    public void init() {
        code = new ImplementstrStr();
    }

    public Stream inputs() {
        return Stream.of(
                arguments(2, "hello", "ll"),
                arguments(-1, "aaaaa", "bba"),
                arguments(5, "asdasinadonlnasodubnlaofabn", "in"),
                arguments(23, "asdasinadonlnasodubnlaofabn", "fabn"),
                arguments(-1, "aaa", "aaaa"),
                arguments(4, "mississippi", "issip")
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int expected, String haystack, String needle) {
        Assert.assertEquals(expected, code.strStr(haystack, needle));
    }
}
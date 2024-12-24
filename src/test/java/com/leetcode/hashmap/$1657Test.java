package com.leetcode.hashmap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $1657Test {

    $1657 solution = new $1657();

    @Test
    public void smoke() {
//        this.solution.closeStrings("abc", "bac");
//        this.solution.closeStrings("cabbba", "abbccc");
        this.solution.closeStrings("abbbzcf", "babzzcz");
    }

    public Stream<Arguments> inputs() {
        return Stream.of(
                arguments("abbzzca", "babzzcz", false),
                arguments("abc", "bac", true),
                arguments("cabbba", "abbccc", true),
                arguments("abbbzcf", "babzzcz", false),
                arguments("aaafb", "aaabe", false)
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(String word1, String word2, boolean expectedResult) {
        assertEquals(expectedResult, this.solution.closeStrings(word1, word2));
    }

}
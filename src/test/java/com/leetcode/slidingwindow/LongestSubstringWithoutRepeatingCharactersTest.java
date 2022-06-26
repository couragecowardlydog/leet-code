package com.leetcode.slidingwindow;

import com.leetcode.slidingwindow.LongestSubstringWithoutRepeatingCharacters;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LongestSubstringWithoutRepeatingCharactersTest {

    LongestSubstringWithoutRepeatingCharacters code;

    @BeforeAll
    public void init() {
        code = new LongestSubstringWithoutRepeatingCharacters();
    }

    public Stream<Arguments> inputs() {
        return Stream.of(
                arguments(3, "abcabcbb"),
                arguments(1, "bbbbb"),
                arguments(3, "pwwkew"),
                arguments(3, "dvdf"),
                arguments(0, "")
        );
    }


    @ParameterizedTest(name = "#{index} - Test with : {1}")
    @MethodSource("inputs")
    public void test(int expected, String input) {
        Assert.assertEquals(expected, code.lengthOfLongestSubstring(input));
    }

}
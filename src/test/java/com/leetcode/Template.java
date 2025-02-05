package com.leetcode;

import com.leetcode.stack.$394;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Template {

    $394 solution = new $394();


    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments("3[a2[c]]", "accaccacc"),
                Arguments.arguments("3[z]2[2[y]pq4[2[jk]e1[f]]]ef", "zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef"),
                Arguments.arguments("2[abc]3[cd]ef", "abcabccdcdcdef"),
                Arguments.arguments("10[leetcode]", "leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode"),
                Arguments.arguments("1[leetcode]", "leetcode"),
                Arguments.arguments("9[leetcode]", "leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode")
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    void decodeString(String input, String expectedResult) {
        Assertions.assertEquals(expectedResult, solution.decodeString(input));
    }
}
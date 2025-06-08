package com.leetcode.dp;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $5Test {

    $5 solution = new $5();


    public Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.arguments("babad", "aba"),
                Arguments.arguments("aacabdkacaa", "aca"),
                Arguments.arguments("cbbd", "bb"),
                Arguments.arguments("xeeevvgrqunieginnvgvttbloinzpmoiaczszxswpmsxkhtnyrzimeckwndjnrvczcokshsachapcsbhijbbedfjnccqifibbumjchrarmvfoacdxwwkwrsnnebsdqksjmxzuwlpztltsgtllviztsqzzzzsrxkhmrugklfxinlkbdtgzaqgrrnplsbbtoqfrjwzqhwozesjqanifdswbtrkbtzkwtcodejwdorsdcairdodaluaafbviigevezrkovmcbswauhkvhrhzojdmlevuvfycjqntgpxtjtqqtjtxpgtnqjcyfvuvelmdjozhrhvkhuawsbcmvokrzevegiivbfaauladodriacdsrodwjedoctwkztbkrtbwsdfinaqjsezowhqzwjrfqotbbslpnrrgqazgtdbklnixflkgurmhkxrszzzzqstzivlltgstltzplwuzxmjskqdsbennsrwkwwxdcaofvmrarhcjmubbifiqccnjfdebbjihbscpahcashskoczcvrnjdnwkcemizrynthkxsmpwsxzszcaiompzniolbttvgvnnigeinuqrgvveeex", "xeeevvgrqunieginnvgvttbloinzpmoiaczszxswpmsxkhtnyrzimeckwndjnrvczcokshsachapcsbhijbbedfjnccqifibbumjchrarmvfoacdxwwkwrsnnebsdqksjmxzuwlpztltsgtllviztsqzzzzsrxkhmrugklfxinlkbdtgzaqgrrnplsbbtoqfrjwzqhwozesjqanifdswbtrkbtzkwtcodejwdorsdcairdodaluaafbviigevezrkovmcbswauhkvhrhzojdmlevuvfycjqntgpxtjtqqtjtxpgtnqjcyfvuvelmdjozhrhvkhuawsbcmvokrzevegiivbfaauladodriacdsrodwjedoctwkztbkrtbwsdfinaqjsezowhqzwjrfqotbbslpnrrgqazgtdbklnixflkgurmhkxrszzzzqstzivlltgstltzplwuzxmjskqdsbennsrwkwwxdcaofvmrarhcjmubbifiqccnjfdebbjihbscpahcashskoczcvrnjdnwkcemizrynthkxsmpwsxzszcaiompzniolbttvgvnnigeinuqrgvveeex")
        );
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(String input, String expected) {
        assertEquals(expected, solution.longestPalindrome(input));
    }

}
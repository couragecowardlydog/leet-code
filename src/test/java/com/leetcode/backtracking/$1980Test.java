package com.leetcode.backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $1980Test {


    $1980 solution = new $1980();


    @Test
    public void test() {
//        assertEquals("11", solution.findDifferentBinaryString(new String[]{"10", "01"}));
        assertEquals("101", solution.findDifferentBinaryString(new String[]{"111","011","001"}));

    }

}
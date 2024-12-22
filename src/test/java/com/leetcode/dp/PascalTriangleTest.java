package com.leetcode.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PascalTriangleTest {

    private PascalTriangle code;

    @BeforeAll
    public void setup() {
        this.code = new PascalTriangle();
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int input, List<List<Integer>> expected) {
        Assertions.assertEquals(expected, code.generate(input));
    }

    @Test
    public void test(){
         Assertions.assertEquals(21, code.coefficient(30, 1));
    }

}
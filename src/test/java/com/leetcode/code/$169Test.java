package com.leetcode.code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class $169Test {

    private $169 code;

    @BeforeAll
    public void init(){
        this.code = new $169();
    }

    public Stream<Arguments> inputs(){
        return Stream.of(Arguments.arguments(1, new int[]{1, 1, 1, 2, 2, 3}));
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void test(int result , int[] arr ){
        Assertions.assertEquals(result, code.majorityElement(arr));
    }

}
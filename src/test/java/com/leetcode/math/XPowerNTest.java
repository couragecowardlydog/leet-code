package com.leetcode.math;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class XPowerNTest {
    XPowerN code;

    @BeforeAll
    public void init() {
        code = new XPowerN();
    }

    public Stream<Arguments> input() {
        return Stream.of(
                arguments(1, 1),
                arguments(2, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("input")
    void find(int x, int n) {
        assertEquals(Math.pow(x, n), code.find(x, n));
    }
}
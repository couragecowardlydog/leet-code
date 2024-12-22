package com.leetcode.string;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $1768Test {

    private $1768 code;

    @BeforeAll
    public void init() {
        this.code = new $1768();
    }

    @Test
    public void smoke() {
        assertEquals("apbqcr", this.code.mergeAlternately("abc", "pqr"));
    }


}
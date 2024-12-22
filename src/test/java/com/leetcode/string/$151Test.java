package com.leetcode.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class $151Test {

    private $151 code;

    @BeforeAll
    public void init() {
        this.code = new $151();
    }

    @Test
    public void smoke() {
//        assertEquals("blue is sky the", this.code.reverseWords("the sky is blue"));
        assertEquals("world hello", this.code.optimize("  hello world  "));
    }

}
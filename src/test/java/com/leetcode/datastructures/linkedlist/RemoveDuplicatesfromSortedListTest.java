package com.leetcode.datastructures.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RemoveDuplicatesfromSortedListTest {

    private RemoveDuplicatesfromSortedList code;

    @BeforeAll
    public void init(){
        this.code = new RemoveDuplicatesfromSortedList() ;
    }

    @Test
    void deleteDuplicatesCase1() {
        // L1
        ListNode $L1_N1 = new ListNode(1);
        ListNode $L1_N1_D1 = new ListNode(1);
        ListNode $L1_N1_D2 = new ListNode(1);
        ListNode $L1_N1_D3 = new ListNode(1);
        ListNode $L1_N2 = new ListNode(2);
        ListNode $L1_N3 = new ListNode(3);
        $L1_N1.next = $L1_N1_D1;
        $L1_N1_D1.next = $L1_N1_D2;
        $L1_N1_D2.next = $L1_N1_D3;
        $L1_N1_D3.next = $L1_N2;
        $L1_N2.next = $L1_N3;
        Assertions.assertNotNull(code.deleteDuplicates($L1_N1));
    }

    @Test
    void deleteDuplicatesCase2() {
        // L1
        ListNode $L1_N1 = new ListNode(1);
        ListNode $L1_N1_D1 = new ListNode(1);
        ListNode $L1_N1_D2 = new ListNode(1);
        ListNode $L1_N1_D3 = new ListNode(1);
        $L1_N1.next = $L1_N1_D1;
        $L1_N1_D1.next = $L1_N1_D2;
        $L1_N1_D2.next = $L1_N1_D3;
        Assertions.assertNotNull(code.deleteDuplicates($L1_N1));

    }
}
package com.leetcode.datastructures.linkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MergeTwoSortedListsTest {

    MergeTwoSortedLists code;

    @BeforeAll
    public void init() {
        code = new MergeTwoSortedLists();
    }

    @Test
    public void test() {
        // L1
        ListNode $L1_1 = new ListNode(1);
        ListNode $L1_2 = new ListNode(2);
        ListNode $L1_4 = new ListNode(4);
        $L1_1.next = $L1_2;
        $L1_2.next = $L1_4;

        // L2
        ListNode $L2_1 = new ListNode(1);
        ListNode $L2_3 = new ListNode(3);
        ListNode $L2_4 = new ListNode(4);
        $L2_1.next = $L2_3;
        $L2_3.next = $L2_4;

        ListNode head = code.mergeTwoLists($L1_1, $L2_1);
        while (null != head) {
            System.out.println(head.val);
            head = head.next;
        }

    }

}
package com.leetcode.datastructures.linkedlist;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AddTwoNumbersTest {


    AddTwoNumbers code;

    @BeforeAll
    public void init() {
        code = new AddTwoNumbers();
    }

    @Test
    public void testCase1() {
        // L1
        ListNode $L1_N1 = new ListNode(2);
        ListNode $L1_N2 = new ListNode(4);
        ListNode $L1_N3 = new ListNode(3);
        $L1_N1.next = $L1_N2;
        $L1_N2.next = $L1_N3;

        // L2
        ListNode $L2_N1 = new ListNode(5);
        ListNode $L2_N2 = new ListNode(6);
        ListNode $L2_N3 = new ListNode(4);
        $L2_N1.next = $L2_N2;
        $L2_N2.next = $L2_N3;

        ListNode head = code.addTwoNumbers($L1_N1, $L2_N1);
        print(head);

    }

    @Test
    public void testCase2() {
        // L1
        ListNode $L1_N1 = new ListNode(2);
        ListNode $L1_N2 = new ListNode(1);
        $L1_N1.next = $L1_N2;

        // L2
        ListNode $L2_N1 = new ListNode(9);

        ListNode head = code.addTwoNumbers($L1_N1, $L2_N1);
        print(head);
    }

    @Test
    public void testCase3() {

        // L1 -  [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        ListNode $L1 = code.addNode(null, 9);
        $L1 = code.addNode($L1, 9);
        $L1 = code.addNode($L1, 9);
        $L1 = code.addNode($L1, 9);
        $L1 = code.addNode($L1, 9);
        $L1 = code.addNode($L1, 9);
        $L1 = code.addNode($L1, 9);


        // L2
        ListNode $L2 = code.addNode(null, 9);
        $L2 = code.addNode($L2, 9);
        $L2 = code.addNode($L2, 9);
        $L2 = code.addNode($L2, 9);

        ListNode head = code.addTwoNumbers($L1, $L2);
        print(head);
    }

    @Test
    public void testCase4() {
        // L1
        ListNode $L1_N1 = new ListNode(0);

        // L2
        ListNode $L2_N1 = new ListNode(1);

        ListNode head = code.addTwoNumbers($L1_N1, $L2_N1);
        print(head);
    }

    private void print(ListNode head) {
        while (null != head) {
            System.out.println(head.val);
            head = head.next;
        }
    }


}
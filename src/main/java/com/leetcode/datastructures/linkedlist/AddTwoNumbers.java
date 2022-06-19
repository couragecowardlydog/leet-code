package com.leetcode.datastructures.linkedlist;

public class AddTwoNumbers {

    public static int CARRY = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        CARRY = 0;
        ListNode node = null;
        while (null != l1 && null != l2) {
            int sum = CARRY + l1.val + l2.val;
            CARRY = sum / 10;
            node = addNode(node, sum % 10);
            l1 = l1.next;
            l2 = l2.next;
        }
        node = addLeft(node, l1);
        node = addLeft(node, l2);
        if (CARRY > 0) {
            node = addNode(node, CARRY);
        }
        return node;
    }

    private ListNode addLeft(ListNode node, ListNode list) {
        while (null != list) {
            int sum = CARRY + list.val;
            CARRY = sum / 10;
            node = addNode(node, sum % 10);
            list = list.next;
        }
        return node;
    }

    public ListNode addNode(ListNode list, int value) {
        if (list == null)
            return new ListNode(value);
        ListNode temp = list;
        while (null != temp.next) {
            temp = temp.next;
        }
        temp.next = new ListNode(value);
        return list;
    }
}

package com.leetcode.linkedlist;

public class $328 {

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            ListNode temp = slow.next;
            slow.next= fast.next;
            fast.next = fast.next.next;
            slow.next.next = temp;
            slow = slow.next;
            fast = fast.next;
        }

        return head;
    }


}

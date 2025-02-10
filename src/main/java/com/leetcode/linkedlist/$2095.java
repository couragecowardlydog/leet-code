package com.leetcode.linkedlist;

public class $2095 {

    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        while (fast.next != null) {
            fast = fast.next;
            count++;
            if (count % 2 == 1) {
                slow = slow.next;
            }
        }
        slow.next = slow.next.next;
        return head;
    }


}

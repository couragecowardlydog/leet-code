package com.leetcode.linkedlist;

public class $2095 {

    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;
        ListNode counter = head;
        int count = 0;
        while (counter.next != null) {
            counter = counter.next;
            count++;
        }
        int middle = ((int) Math.ceil(count / 2.0));
        int slow = 0;
        ListNode slowHead = head;
        while (slow < (middle - 1)) {
            slowHead = slowHead.next;
            slow++;
        }
        slowHead.next = slowHead.next.next;
        return head;
    }


}

package com.leetcode.linkedlist;

public class $206 {

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            ListNode temp = current.next;
            current.next = current.next.next;
            temp.next = head;
            head = temp;
        }

        return head;
    }


}

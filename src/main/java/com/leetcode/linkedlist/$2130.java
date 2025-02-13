package com.leetcode.linkedlist;

public class $2130 {

    public int pairSum(ListNode head) {
        int max = 0;
        ListNode mid = head;
        ListNode fast = head;
        int count = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next;
            if (count % 2 == 1) {
                mid = mid.next;
            }
            count++;
        }

        // reverse
        ListNode midHead = mid.next;
        ListNode current = midHead;
        while (current != null && current.next != null) {
            ListNode temp = current.next;
            current.next = current.next.next;
            temp.next = midHead;
            midHead = temp;
        }

        ListNode j = midHead;
        ListNode i = head;
        while (j != null) {
            max = Math.max(max, i.val + j.val);
            i = i.next;
            j = j.next;
        }

        return max;
    }


}

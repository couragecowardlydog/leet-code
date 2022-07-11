package com.leetcode.datastructures.linkedlist;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class RemoveDuplicatesfromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null) {
            if (slow.val != fast.val) {
                slow.next = fast;
                slow = fast;
            }
            fast = fast.next;
        }

        // Last node case
        if (slow.val != fast.val) {
            slow.next = fast;
        } else {
            slow.next = fast.next;
        }
        return head;
    }
}

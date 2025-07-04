package com.leetcode.linkedlist;

import java.util.List;

public class $141 {

    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (null != slow && null != fast) {
            slow = slow.next;
            if (null == fast.next)
                return false;
            else
                fast = fast.next.next;
            if (slow == fast)
                return true;
        }


        return false;

    }
}

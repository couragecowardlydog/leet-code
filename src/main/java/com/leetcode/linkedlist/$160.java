package com.leetcode.linkedlist;

public class $160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode Ahead = headA;
        ListNode Bhead = headB;
        int counter = 0;
        while (null != headA && headB != null) {
            headA = headA.next;
            headB = headB.next;

            if (null == headA && counter < 2) {
                headA = Bhead;
                counter++;
            }

            if (null == headB && counter < 2) {
                headB = Ahead;
                counter++;
            }

            if (headA == headB)
                break;
        }

        if (null != headA && null != headB)
            return headA;
        return null;
    }

}

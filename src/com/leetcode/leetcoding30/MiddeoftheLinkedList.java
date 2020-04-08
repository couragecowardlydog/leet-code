package com.leetcode.leetcoding30;

public class MiddeoftheLinkedList {

    class ListNode{
        ListNode next;
    }

    public ListNode middleNode(ListNode head) {
        ListNode tortoise;
        ListNode hare;
        tortoise=hare=head;
        int count =0;
        while(null != hare){
            if(null != hare.next)
                hare = hare.next.next;
            else{
                hare = null;
                break;
            }
            tortoise = tortoise.next;
        }
        return tortoise;
    }


}

package com.leetcode.datastructures.linkedlist;

public class MergeTwoSortedLists {


    /**
     * Merge two give list
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                head = addNode(head, l1.val);
                l1 = l1.next;
                continue;
            }
            head = addNode(head, l2.val);
            l2 = l2.next;
        }
        addAllFromList(head, l1);
        addAllFromList(head, l2);
        return head;
    }


    /**
     * Add add nodes from one list to another
     * @param target
     * @param source
     * @return
     */
    public ListNode addAllFromList(ListNode target, ListNode source) {
        while (null != source) {
            target = addNode(target, source.val);
            source = source.next;
        }
        return target;
    }

    /**
     * Add a node to end of the list
     * @param list
     * @param val
     * @return
     */
    public ListNode addNode(ListNode list, int val) {
        if(list == null)
            return new ListNode(val);
        ListNode temp = list;
        while (null != temp.next) {
            temp = temp.next;
        }
        temp.next = new ListNode(val);
        return list;
    }
}

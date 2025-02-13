package com.leetcode.linkedlist;

import java.util.HashMap;

public class $2130 {

    public int pairSum(ListNode head) {
        int counter = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (head != null) {
            map.put(counter, head.val);
            head = head.next;
            counter++;
        }
        int i = 0;
        int max = Integer.MIN_VALUE;
        while (i <= (counter / 2)) {
            max = Math.max(max, map.get(i) + map.get((counter - 1 - i)));
            i++;
        }
        return max;
    }


}

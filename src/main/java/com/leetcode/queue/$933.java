package com.leetcode.queue;

import java.util.Queue;

public class $933 {
    int[] calls;
    int i = 0;
    int j = 0;

    public $933() {
        calls = new int[10000];
    }

    public int ping(int t) {
        calls[i++] = t;
        while (calls[j] < (t - 3000)) {
            j++;
        }
        return i - j ;
    }

    public static void main(String[] args) {
        $933 obj = new $933();
        System.out.println(obj.ping(1));
        System.out.println(obj.ping(100));
        System.out.println(obj.ping(3001));
        System.out.println(obj.ping(3002));
    }

}

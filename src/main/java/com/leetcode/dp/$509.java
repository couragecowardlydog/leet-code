package com.leetcode.dp;

public class $509 {

    int[] arr;


    public static void main(String[] args) {
        $509 obj = new $509();
        System.out.println(obj.fib(4));
    }

    public int fib(int n) {
        arr = new int[n];
        return fibonacci(n);
    }

    private int fibonacci(int i) {
        if (i <= 0)
            return 0;
        if (i == 1)
            return 1;
        if (arr[i - 1] == 0) {
            arr[i - 1] = fibonacci(i - 1) + fibonacci(i - 2);
        }
        return arr[i - 1];
    }
}

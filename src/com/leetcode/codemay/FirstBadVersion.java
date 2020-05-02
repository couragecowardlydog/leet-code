package com.leetcode.codemay;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Arrays;

/**
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * <p>
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * <p>
 * You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 * <p>
 * Example:
 * <p>
 * Given n = 5, and version = 4 is the first bad version.
 * <p>
 * call isBadVersion(3) -> false
 * call isBadVersion(5) -> true
 * call isBadVersion(4) -> true
 * <p>
 * Then 4 is the first bad version.
 */
public class FirstBadVersion {


    public static boolean isBadVersion(int version) {
        return version >= 1702766719;
    }


    /**
     * Binary Search
     *
     * @param n
     * @return
     */
    public static int firstBadVersion(int n) {

        int start = 1;
        int end = n;
        while (start < end) {
            // Integer overflow
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid))
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(2126753390));
    }
}

package com.leetcode.string;

public class ImplementstrStr {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        int nPointer = 0;
        int fast = 0;
        int slow = 0;

        while (fast < haystack.length() && slow < haystack.length()) {
            if (haystack.charAt(fast) != needle.charAt(nPointer)) {
                slow++;
                fast = slow;
                nPointer = 0;
            } else {
                fast++;
                nPointer++;
            }

            if (nPointer >= needle.length()) {
                break;
            }
        }

        return nPointer != needle.length() ? -1 : slow;
    }
}

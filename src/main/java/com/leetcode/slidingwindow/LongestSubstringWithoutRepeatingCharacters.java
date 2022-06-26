package com.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String sequence) {
        Map<Character, Integer> map = new HashMap<>();
        int max_so_far, max_current, slow_pointer, fast_pointer;
        max_so_far = slow_pointer = fast_pointer = 0;
        while (fast_pointer < sequence.length() && slow_pointer < sequence.length()) {
            Character fast = sequence.charAt(fast_pointer);
            if (map.containsKey(fast) && map.get(fast) != 0) {
                Character slow = sequence.charAt(slow_pointer);
                map.put(slow, map.get(slow) - 1);
                slow_pointer++;
                continue;
            }
            map.put(fast, 1);
            if (slow_pointer > fast_pointer) {
                fast_pointer = slow_pointer;
            }
            max_current = fast_pointer - slow_pointer + 1;
            fast_pointer++;
            if (max_so_far < max_current) {
                max_so_far = max_current;
            }
        }
        return max_so_far;
    }
}

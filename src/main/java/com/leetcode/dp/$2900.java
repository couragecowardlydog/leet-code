package com.leetcode.dp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class $2900 {

    List[] visited;

    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        this.visited = new ArrayList[groups.length];
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            List<String> temp = find(i, -1, words, groups);
            if (temp.size() > result.size()) {
                result = temp;
            }
        }
        return result;
    }

    private List<String> find(int index, int previous, String[] words, int[] groups) {
        if (index == words.length - 1) {
            if (previous != groups[index])
                return List.of(words[index]);
            return Collections.EMPTY_LIST;
        }
        if (null != visited[index])
            return visited[index];

        List result = new ArrayList();
        if (previous != groups[index])
            result.add(words[index]);

        result.addAll(find(index + 1, groups[index], words, groups));
        visited[index] = result;
        return result;
    }

    public static void main(String[] args) {
        $2900 solution = new $2900();
        String[] words = new String[]{"s", "l", "djl", "euy", "r", "lur", "u", "ypp", "ev", "fv", "we", "qzk", "q", "xlr", "w", "wc", "a", "sd", "o", "x", "v"};
        int[] groups = new int[]{0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1};
        System.out.println(solution.getLongestSubsequence(words, groups));
    }

}

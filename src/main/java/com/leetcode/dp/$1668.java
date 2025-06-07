package com.leetcode.dp;

public class $1668 {

    int[] visited;

    public int maxRepeating(String sequence, String word) {
        int result = 0;
        visited = new int[sequence.length()];
        for (int i = 0; i < (sequence.length() - word.length() + 1); i++) {
            result = Math.max(result, findContinuousSubString(i, sequence, word));
        }
        return result;
    }

    private int findContinuousSubString(int j, String sequence, String word) {
        if (j >= (sequence.length() - word.length() + 1))
            return 0;
        if (visited[j] > 0)
            return visited[j];
        String str = sequence.substring(j, j + word.length());
        if (!str.equalsIgnoreCase(word))
            return 0;
        visited[j] = 1 + findContinuousSubString(j + word.length(), sequence, word);
        return visited[j];
    }

    public static void main(String[] args) {
        $1668 obj = new $1668();
        System.out.println(obj.maxRepeating("ababc", "ab"));
        System.out.println(obj.maxRepeating("ababc", "ac"));
        System.out.println(obj.maxRepeating("a", "a"));
        System.out.println(obj.maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba"));
    }

}

package com.leetcode.dp;

import java.util.*;


public class $139 {

    private Map<String, Boolean> dp;
    public boolean wordBreak(String s, List<String> wordDict) {
        dp = new HashMap<>();
        return traverse(s, new HashSet<>(wordDict));
    }

    private boolean traverse(String sb, Set<String> wordDict) {
        if (sb.isEmpty()) return true;
        if (dp.containsKey(sb)) return dp.get(sb);

        for (int i = 1; i <= sb.length(); i++) {
            String word = sb.substring(0, i);
            if (wordDict.contains(word) && traverse(sb.substring(i), wordDict)) {
                dp.put(word, true);
                return true;
            }
        }
        dp.put(sb, false);
        return false;

    }

    public static void main(String[] args) {
        $139 obj = new $139();
//        System.out.println(obj.wordBreak("applepenapple", List.of("apple", "pen")));
//        System.out.println(obj.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
//        System.out.println(obj.wordBreak("aaaaaaa", List.of("aaaa", "aaa")));
//        System.out.println(obj.wordBreak("ccbb", List.of("bc", "cb", "rs")));
        System.out.println(obj.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", List.of("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa")));
        System.out.println(obj.wordBreak("leetcode", List.of("leet", "code")));
        System.out.println(obj.wordBreak("applepenapple", List.of("apple", "pen")));
        System.out.println(obj.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
    }

}

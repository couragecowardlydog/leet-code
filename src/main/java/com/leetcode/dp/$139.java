package com.leetcode.dp;

import java.util.*;

public class $139 {

    private StringBuilder path = new StringBuilder();
    private Set dp;

    public boolean wordBreak(String s, List<String> wordDict) {
        dp = new HashSet();
        return traverse(s, wordDict);
    }

    private boolean traverse(String s, List<String> wordDict) {
        for (int i = 0; i < wordDict.size(); i++) {
            String word = wordDict.get(i);
            s.substring(i);
            path.append(word);
            String pathWord = path.toString();
            if (s.equals(pathWord)) {
                return true;
            }

            if (dp.contains(pathWord)) {
                dp.clear();
                continue;
            }

            if (s.startsWith(pathWord)) {
                if (traverse(s, wordDict))
                    return true;
                else
                    dp.add(pathWord);
            }
            path.delete(path.length() - word.length(), path.length());
        }
        return false;

    }

    public static void main(String[] args) {
        $139 obj = new $139();
        System.out.println(obj.wordBreak("leetcode", List.of("leet", "code")));
        System.out.println(obj.wordBreak("applepenapple", List.of("apple", "pen")));
        System.out.println(obj.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
    }

}

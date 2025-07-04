package com.leetcode.dp;

import java.util.HashMap;
import java.util.List;

public class $139 {


    public boolean wordBreak(String s, List<String> wordDict) {
        return traverse(new StringBuilder(s), wordDict);
    }

    public boolean traverse(StringBuilder sb, List<String> wordDict) {
        if (sb.length() == 0) return true;
        for (int i = 0; i < wordDict.size(); i++) {
            String word = wordDict.get(i);
            int index = sb.indexOf(word);
            if (index != -1) {
                sb.delete(index, index + word.length());
                boolean result = traverse(sb, wordDict);
                if (result)
                    return true;
                sb.insert(index, word);
            }
        }
        return false;

    }

    public static void main(String[] args) {
        $139 obj = new $139();
//        System.out.println(obj.wordBreak("applepenapple", List.of("apple", "pen")));
//        System.out.println(obj.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
//        System.out.println(obj.wordBreak("aaaaaaa", List.of("aaaa", "aaa")));
//        System.out.println(obj.wordBreak("ccbb", List.of("bc", "cb", "rs")));
        System.out.println(obj.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", List.of("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa")));
    }
}

package com.leetcode.hashmap;


import java.util.Arrays;

public class $1657 {

    int[] sourceArr = new int[26];
    int[] targetArr = new int[26];

    public void clear() {
        Arrays.fill(sourceArr, 0);
        Arrays.fill(targetArr, 0);
    }

    public boolean closeStrings(String word1, String word2) {


        // Base case 1 : String length is different
        if (word1.length() != word2.length())
            return false;

        clear();


        for (int i = 0; i < word1.length(); i++) {
            sourceArr[word1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < word2.length(); i++) {
            targetArr[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (sourceArr[i] == targetArr[i])
                continue;
            if (!(sourceArr[i] > 0 && targetArr[i] > 0)) {
                return false;
            }
        }

        for (int i = 0; i < sourceArr.length; i++) {
            if (sourceArr[i] == 0)
                continue;
            if (sourceArr[i] == targetArr[i])
                continue;

            boolean flag = false;
            for (int k = 0; k < 26; k++) {
                if (k == i || targetArr[k]== sourceArr[k])
                    continue;
                if (targetArr[i] == sourceArr[k]) {
                    int temp = sourceArr[i];
                    sourceArr[i] = sourceArr[k];
                    sourceArr[k] = temp;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return false;
            }
        }

        for (int i = 0; i < sourceArr.length; i++) {
            if (sourceArr[i] != targetArr[i])
                return false;
        }

        return true;

    }




}
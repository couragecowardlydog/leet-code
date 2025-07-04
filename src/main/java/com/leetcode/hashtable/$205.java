package com.leetcode.hashtable;

import java.util.HashMap;

public class $205 {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        System.out.println(tMap);
        for (Character key : sMap.keySet()) {
            int scount = sMap.get(key);
            boolean found = false;
            for (Character key2 : tMap.keySet()) {
                int tcount = tMap.get(key2);
                if (scount == tcount) {
                    tMap.put(key2, 0);
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        $205 isomorphic = new $205();
        System.out.println(isomorphic.isIsomorphic("egg", "add"));
    }
}

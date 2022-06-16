package com.leetcode.leetcoding30;

import java.util.*;

public class GroupAnagrams {


    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,ArrayList>H = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char x[] = strs[i].toCharArray();
            Arrays.sort(x);
            String a = new String(x);
            if(H.containsKey(a)){
                ArrayList<String>B = H.get(a);
                B.add(strs[i]);
                H.remove(a);
                H.put(a,B);
            }
            else{
                ArrayList<String>B = new ArrayList<>();
                B.add(strs[i]);
                H.put(a,B);
            }
        }
        List<List<String>>A = new LinkedList<>();
        for(String s: H.keySet()){
            List<String>B = H.get(s);
            A.add(B);
        }
        return A;

    }


    public static void main(String[] args) {
        String[] array = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(array));
    }
}

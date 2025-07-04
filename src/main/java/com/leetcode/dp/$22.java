package com.leetcode.dp;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class $22 {


    public static HashMap<Integer, List<String>> dp = new HashMap();
    public List<String> generateParenthesis(int n) {
        return getList(n);
    }
    public Map<String, String> map = new ConcurrentHashMap<>();
    public List<String> getList(int n) {

        if (n == 1 || n == 0)
            return List.of("()");
        if (dp.containsKey(n))
            return dp.get(n);
        Set<String> result = new HashSet<>();
        List<String> previous = getList(n - 1);
        for (String s : previous) {
            result.add("(".concat(s).concat(")"));
            result.add(s.concat("()"));
            result.add("()".concat(s));
        }

        int x = 1;
        int y = n - x;
        while (y >= x) {
            System.out.println("For:" + n + ",x:" + x + ", y:" + y);
            System.out.println("---");
            List<String> xList = getList(x);
            List<String> yList = getList(y);
            for (String s : xList) {
                for (String s2 : yList) {
                    result.add(s.concat(s2));
                    result.add(s2.concat(s));
                }
            }
            x++;
            y--;
        }
        dp.put(n, result.stream().toList());
        return dp.get(n);
    }


    public static void main(String[] args) {
        $22 obj = new $22();
        System.out.println(obj.generateParenthesis(6));
    }


}

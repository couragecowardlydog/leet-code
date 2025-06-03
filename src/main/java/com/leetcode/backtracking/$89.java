package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class $89 {

    List<Integer> result = new ArrayList<>();
    int[] visited;

    public List<Integer> grayCode(int n) {
        int x = 1;
        result.add(0);
        result.add(1);
        int max = (int) Math.pow(2, n);
        visited = new int[max];
        visited[0] = 1;
        visited[1] = 1;
        while (true) {
            if (result.size() >= max)
                break;
            x = getNumber(x, 0);
            result.add(x);
        }

        return result;
    }

    public int getNumber(int x, int i) {
        int y = x ^ (1 << i);
        if (visited[y] == 1)
            return getNumber(x, i + 1);
        visited[y] = 1;
        return y;
    }

    public static void main(String[] args) {
        System.out.println(new $89().TLE(1));
    }


}

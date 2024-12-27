package com.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class $2352 {

    public int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;
        if (n == 0) return 0;
        int m = grid[0].length;

        Map<String, Integer> rows = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < m; j++) {
                builder.append(grid[i][j]);
                builder.append(',');
            }
            String key = builder.toString();
            rows.put(key, rows.getOrDefault(key, 0) + 1);
        }

        System.out.println(rows);
        for (int i = 0; i < m; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < n; j++) {
                builder.append(grid[j][i]);
                builder.append(',');
            }
            String col = builder.toString();
            count += rows.getOrDefault(col, 0);
        }

        return count;
    }

}

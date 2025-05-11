package com.leetcode.graph;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class $547 {

    public static int[] PARENT;
    public static int[] RANK;

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        PARENT = new int[isConnected.length];
        RANK = new int[isConnected.length];
        for (int i = 0; i < PARENT.length; i++)
            PARENT[i] = i;

        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[i].length; j++) {
                if (isConnected[i][j] == 1 && find(i) != find(j)) {
                    union(i, j);
                    n--;
                }
            }
        }
        return n;
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX == rootY)
            return;
        if (RANK[rootX] < RANK[rootY]) {
            PARENT[rootX] = rootY;
        } else if (RANK[rootX] > RANK[rootY]) {
            PARENT[rootY] = rootX;
        } else {
            PARENT[rootY] = rootX;
            RANK[rootX]++;
        }
    }

    public int find(int x) {
        if (PARENT[x] == x)
            return PARENT[x];
        return find(PARENT[x]);
    }

}

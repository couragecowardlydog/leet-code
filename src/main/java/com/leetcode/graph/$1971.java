package com.leetcode.graph;

public class $1971 {

    public static int[] PARENT;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        PARENT = new int[n];
        for (int i = 0; i < n; i++)
            PARENT[i] = i;
        for (int i = 0; i < edges.length; i++) {
            union(edges[i][0], edges[i][1]);
        }
        return find(source) == find(destination);

    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            PARENT[rootY] = rootX;
        }
    }

    public int find(int x) {
        if (PARENT[x] != x) {
            PARENT[x] = find(PARENT[x]);
        }
        return PARENT[x];
    }


}

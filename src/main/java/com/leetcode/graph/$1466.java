package com.leetcode.graph;

import java.util.*;

public class $1466 {

    int[] visited;
    int count = 0;

    public int minReorder(int n, int[][] connections) {

        // find adjacency list
        visited = new int[n];
        Map<Integer, List<Integer>> adjcents = new HashMap<>();
        for (int[] connection : connections) {
            if (!adjcents.containsKey(connection[0])) {
                adjcents.put(connection[0], new ArrayList<>());
            }
            if (!adjcents.containsKey(connection[1])) {
                adjcents.put(connection[1], new ArrayList<>());
            }
            adjcents.get(connection[0]).add(connection[1]);
            adjcents.get(connection[1]).add(connection[1]);
        }

        dfs(0, adjcents, connections);


        return 0;

    }

    private void dfs(int i, Map<Integer, List<Integer>> adjcents, int[][] connections) {
        System.out.println("I:"+i);
        System.out.println(Arrays.toString(visited));
        if (visited[i] == 1)
            return;
        visited[i] = 1;
        List<Integer> list = adjcents.get(i);
        System.out.println(i);
        System.out.println(Arrays.toString(list.toArray()));
        for (Integer neighbor : list) {
            if (!hasConnection(neighbor, i, connections)) {
                count++;
            }
            dfs(neighbor, adjcents, connections);
        }
    }

    private boolean hasConnection(Integer neighbor, int i, int[][] connections) {
        System.out.println(neighbor + " " + i);
        for (int[] connection : connections) {
            if (connection[0] == neighbor && connection[1] == i)
                return true;
        }
        return false;
    }


}

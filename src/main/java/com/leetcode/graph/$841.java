package com.leetcode.graph;

import java.util.List;

public class $841 {

    int ROOMS;
    boolean[] visited;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        ROOMS = rooms.size();
        visited = new boolean[ROOMS];
        visit(0, rooms);
        for (int i = 0; i < ROOMS; i++)
            if (!visited[i])
                return false;
        return true;
    }

    public void visit(int room, List<List<Integer>> rooms) {
        if(visited[room])
            return;
        visited[room] = true;
        List<Integer> keys = rooms.get(room);
        for (int i = 0; i < keys.size(); i++) {
            visit(keys.get(i), rooms);
        }

    }
}

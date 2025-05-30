package com.leetcode.backtracking;


import java.util.ArrayList;
import java.util.List;

public class $1986 {

    int[] arr;
    int[] visited;
    int K;
    int RESULT = Integer.MAX_VALUE;
    List<Integer> path ;
    public int minSessions(int[] tasks, int sessionTime) {
        arr = tasks;
        K = sessionTime;
        RESULT = Integer.MAX_VALUE;
        path    = new ArrayList<>();
        visited = new int[arr.length];
        traverse(0, 0, sessionTime, 0);
        return RESULT;
    }

    public void traverse(int count, int times, int timeRemaining, int session) {
        if (count == arr.length) {
            session++;
            RESULT = Math.min(RESULT, session);
            System.out.println("RESULT: " + RESULT);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (visited[i] == 1)
                continue;
            visited[i] = 1;
            if (arr[i] > timeRemaining || timeRemaining == 0) {
                timeRemaining = K;
                session++;
            }

            if (timeRemaining == 0) {
                session++;
            }
            path.add(arr[i]);
            System.out.println(path);
            System.out.println("Val :" + arr[i] + " time Remaining " + timeRemaining + " " + " session " + session);
            traverse(count + 1, times + 1, timeRemaining - arr[i], session);
            visited[i] = 0;
            path.remove(path.size() - 1);
        }

    }


}

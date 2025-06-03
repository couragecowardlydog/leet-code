package com.leetcode.backtracking;

public class $79 {

    char[][] arr;
    char[] words;
    int[][] visited;

    public boolean exist(char[][] board, String word) {
        arr = board;
        visited = new int[arr.length][arr[0].length];
        words = word.toCharArray();
        return check();

    }

    public boolean check() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == words[0]) {
                    System.out.println("Match 1");
                    if (search(i, j, 1))
                        return true;
                }
            }
        }
        return false;

    }

    private boolean search(int i, int j, int k) {
        System.out.println("i " + i + " j " + j + " k " + k);
        visited[i][j] = 1;

        if (k >= words.length)
            return true;
        // Check left
        if ((j - 1 >= 0) && visited[i][j - 1] == 0 && arr[i][j - 1] == words[k])
            if(search(i, j - 1, k + 1))
                return true;
        // Check right
        if ((j + 1 < arr[0].length) && visited[i][j + 1] == 0 && arr[i][j + 1] == words[k])
            if(search(i, j + 1, k + 1))
                return true;
        // Check top
        if ((i - 1 >= 0) && visited[i - 1][j] == 0 && arr[i - 1][j] == words[k])
            if(search(i - 1, j, k + 1))
                return true;
        // Check bottom
        if (((i + 1) < arr.length) && visited[i + 1][j] == 0 && arr[i + 1][j] == words[k])
            if(search(i + 1, j, k + 1))
                return true;
        visited[i][j] = 0;
        return false;
    }

}

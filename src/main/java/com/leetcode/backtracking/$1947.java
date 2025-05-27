package com.leetcode.backtracking;

public class $1947 {


    int[][] scores;
    int[] visited;
    int MAX_SCORE = Integer.MIN_VALUE;
    int score = 0;

    public int maxCompatibilitySum(int[][] students, int[][] mentors) {
        scores = new int[students.length][students.length];
        visited = new int[students.length];
        genScore(students, mentors);
        traverse(0);
        return MAX_SCORE;
    }

    public void traverse(int i) {
        if (i == scores.length) {
            MAX_SCORE = Math.max(MAX_SCORE, score);
            return;
        }

        for (int j = 0; j < scores[i].length; j++) {
            if (visited[j] == 1)
                continue;
            // Should a not take account of already paired student mentor
            // Example :
            // 1st student paired with 2nd mentor
            // don't have to visit 2 mentor paired with any student , should skip this pair
            visited[j] = 1;
            score += scores[i][j];
            traverse(i + 1);
            visited[j] = 0;
            score -= scores[i][j];
        }
    }


    // Generate the score matrix based on the compatibility of students and mentors.
    public void genScore(int[][] students, int[][] mentors) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < mentors.length; j++) {
                for (int k = 0; k < students[i].length; k++)
                    if (students[i][k] == mentors[j][k])
                        scores[i][j]++;
            }
        }
    }


}

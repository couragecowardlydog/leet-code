package com.leetcode.dp;

import java.util.ArrayList;
import java.util.List;

public class $119 {

    int[][] matrix;

    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0){
            return new ArrayList<>(List.of(1));
        }
        matrix = new int[rowIndex][rowIndex];
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 1; i < rowIndex; i++) {
            result.add(find(rowIndex, i));
        }
        result.add(1);
        return result;
    }

    private Integer find(int x, int i) {
        if (i == 0 || x == 1 || x == i) {
            matrix[x][i] = 1;
            return matrix[x][i];
        }
        if (matrix[x - 1][i] == 0) {
            matrix[x - 1][i] = find(x - 1, i);
        }
        if (matrix[x - 1][i - 1] == 0) {
            matrix[x - 1][i - 1] = find(x - 1, i - 1);
        }
        return matrix[x - 1][i] + matrix[x - 1][i - 1];
    }


}

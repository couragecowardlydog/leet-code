package com.leetcode.dp;

import java.util.Arrays;

public class $97 {

    String a;
    String b;
    String c;
    StringBuilder path = new StringBuilder();
    int[][][] dp;
    boolean found = false;


    public boolean isInterleave(String a, String b, String c) {
        if (a.length() + b.length() != c.length()) return false;
        this.a = a;
        this.b = b;
        this.c = c;

        int[][] aDp = new int[a.length()][a.length()];
        int[][] bDp = new int[b.length()][b.length()];
        for (int i = 0; i < aDp.length; i++) {
            Arrays.fill(aDp[i], -1);
        }
        for (int i = 0; i < bDp.length; i++) {
            Arrays.fill(bDp[i], -1);
        }
        this.dp = new int[][][]{aDp, bDp};


        System.out.println(Arrays.deepToString(dp));
        traverse(0, 1, 0, 0);
        System.out.println("Final Path::" + found);
        if (!found) traverse(0, 0, 0, 0);
        System.out.println("Final Path::" + found);
        return found;
    }

    public void traverse(int pathIndex, int sIndex, int aIndex, int bIndex) {
        System.out.println(path);
        if (path.toString().equals(c)) found = true;
        if (found) return;
        if (path.length() > c.length() || !path.toString().equalsIgnoreCase(c.substring(0, path.length()))) return;
        if (aIndex >= a.length() && bIndex > b.length()) return;
        String current = sIndex == 0 ? a : b;
        int currentIndex = sIndex == 0 ? aIndex : bIndex;

        for (int i = 0; i < (current.length() - currentIndex); i++) {
            path.append(current.substring(currentIndex, currentIndex + i + 1));
            traverse(pathIndex + 1, (sIndex == 0 ? 1 : 0), (aIndex + (sIndex == 0 ? (i + 1) : 0)), (bIndex + (sIndex == 0 ? 0 : (i + 1))));
            path.delete(path.length() - (i + 1), path.length());
        }
    }

    public static void main(String[] args) {
        $97 obj = new $97();
        obj.isInterleave("abc", "def", "deafbc");
    }
}

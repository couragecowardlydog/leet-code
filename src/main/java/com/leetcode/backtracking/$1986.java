package com.leetcode.backtracking;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $1986 {

    public int minSessions(final int[] tasks, final int sessionTime) {
        int totalSession = 0;

        int j = tasks.length - 1;


        Arrays.sort(tasks);
        System.out.println(Arrays.toString(tasks));
        while (j >= 0) {
            System.out.println(tasks[j]);
            if (tasks[j] == 0) {
                j--;
                continue;
            }

            int timeLeft = sessionTime - tasks[j];
            int i = 0;
            System.out.println("time Left " + timeLeft);
            if (timeLeft > 0) {
                while (i < j && tasks[i] <= timeLeft) {
                    if (tasks[i] == timeLeft) {
                        System.out.println("found pair " + tasks[i]);
                        tasks[i] = 0;
                        break;
                    }
                    i++;
                }
            }

            totalSession++;
            j--;

        }

        return totalSession;

    }


}

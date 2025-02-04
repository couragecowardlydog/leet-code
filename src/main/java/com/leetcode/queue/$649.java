package com.leetcode.queue;

public class $649 {

    public String predictPartyVictory(String senate) {
        char[] chars = senate.toCharArray();
        int x = -1;
        int i = 0;
        int rcount = 0;
        int dcount = 0;
        while (true) {
            System.out.println("i: " + i);
            System.out.println("x: " + x);
            if (i == chars.length) {
                i = 0;
            }
            if (x == i)
                break;


            if (chars[i] == 'R') {
                if (dcount > 0) {
                    dcount--;
                    chars[i] = 'X';
                } else {
                    if (rcount == 0)
                        x = i;
                    rcount++;

                }
            } else if (chars[i] == 'D') {
                if (rcount > 0) {
                    rcount--;
                    chars[i] = 'X';
                } else {
                    if (dcount == 0)
                        x = i;
                    dcount++;

                }
            }
            i++;
        }
        return chars[x] == 'R' ? "Radiant" : "Dire";

    }

}

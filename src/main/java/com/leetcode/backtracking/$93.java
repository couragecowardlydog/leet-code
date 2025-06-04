package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class $93 {

    List<String> result = new ArrayList<>();
    char[] arr;
    String[] ipAddress = new String[4];
    public static final String ZERO = "0";
    public static final char DOT = '.';

    public List<String> restoreIpAddresses(String s) {
        result.clear();
        arr = s.toCharArray();
        if (s.length() > 12)
            return result;
        traverse(0, 0);
        return result;
    }


    public void traverse(int index, int counter) {
        if (counter == 4) {
            if (index == arr.length) {
                StringBuilder s = new StringBuilder();
                result.add(s.append(ipAddress[0]).append(DOT)
                        .append(ipAddress[1]).append(DOT)
                        .append(ipAddress[2]).append(DOT)
                        .append(ipAddress[3])
                        .toString());
            }
            return;
        }

        int end = arr.length > (index + 3) ? (index + 3) : arr.length;
        StringBuilder str = new StringBuilder();
        for (int i = index; i < end; i++) {
            str.append(arr[i]);
            ipAddress[counter] = str.toString();
            if (Integer.valueOf(ipAddress[counter]) > 255)
                return;
            traverse(i + 1, counter + 1);
            if (ZERO.equals(ipAddress[counter]))
                i = end;
        }
    }

}

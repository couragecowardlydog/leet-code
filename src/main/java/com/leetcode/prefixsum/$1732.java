package com.leetcode.prefixsum;

public class $1732 {

    public int largestAltitude(int[] gain) {
        int max_altitude = 0;
        int altitude = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            max_altitude = Math.max(max_altitude, altitude);
        }
        return max_altitude;
    }

}

package com.leetcode.backtracking;

import java.util.*;

public class $401 {

    public static Map<Integer, Set<Integer>> hoursMap = new HashMap<>();
    public static Map<Integer, Set<Integer>> minutesMap = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(new $401().readBinaryWatch(2));
    }

    public List<String> readBinaryWatch(int turnedOn) {
        if (turnedOn == 0) {
            return List.of("0:00");
        }

        if(hoursMap.isEmpty()) {
            for (int i = 0; i <= 10; i++) {
//                minutesMap.put(i, fillMinutes(i));
            }
        }
        hoursMap.put(2, fillHours(2));

        hoursMap.put(0, new HashSet<>(Set.of(0)));
        minutesMap.put(0, new HashSet<>(Set.of(0)));

        System.out.println(hoursMap);
//        System.out.println(minutesMap);

        List<String> result = new ArrayList<>();
//        for (int i = 0; i < turnedOn + 1; i++) {
//            getTime(i, turnedOn - i, result);
//        }
        return result;
    }

    private static void getTime(int i, int j, List<String> result) {
        System.out.println("i: " + i + ", j: " + j);
        Set<Integer> hoursSet = hoursMap.get(i);
        Set<Integer> minutesSet = minutesMap.get(j);
        for (Integer hour : hoursSet) {
            for (Integer minute : minutesSet) {
                String hourStr = String.format("%01d", hour);
                String minuteStr = String.format("%02d", minute);
                String time = hourStr + ":" + minuteStr;
                result.add(time);
            }
        }
    }

    private static Set<Integer> fillMinutes(int nBits) {
        return commons(nBits, 6, new HashSet<>(), 60);
    }

    public static Set<Integer> fillHours(int nBits) {
        return commons(nBits, 4, new HashSet<>(), 12);
    }

    public static Set<Integer> commons(int nBits, int bits, Set<Integer> set, int max) {
        for (int i = 0; i < bits; i++) {
            int[] arr = new int[bits];
            System.out.println("arr: " + Arrays.toString(arr));
            arr[i] = 1;
            fillBits(arr, nBits, 0, 1, (int) Math.pow(2, i), max, set);
        }
        return set;
    }


    public static void fillBits(int[] arr, int numBits, int currentIndex, int count, int sum, int max, Set<Integer> set) {
        if (count == numBits) {
            set.add(sum);
        }
        if (currentIndex >= arr.length || count == numBits || sum + Math.pow(2, currentIndex) > max) {
            return;
        }
        if (arr[currentIndex] != 1) {
            arr[currentIndex] = 1;
            sum += Math.pow(2, currentIndex);
            count += 1;
        }
        fillBits(arr, numBits, currentIndex + 1, count, sum, max, set);
        arr[currentIndex] = 0;

    }


}

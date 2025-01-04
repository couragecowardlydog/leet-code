package com.leetcode.heap;

public class SmallestInfiniteSet {


    int[] arr;
    int pointer;

    public SmallestInfiniteSet() {
        arr = new int[1000];
    }

    public int popSmallest() {
        int result = pointer;
        arr[pointer]++;
        for (int i = pointer + 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                pointer = i;
                break;
            }
        }
        return result + 1;
    }

    public void addBack(int num) {
        int index = num - 1;
        if (arr[index] > 0) {
            arr[index] = 0;
            if (pointer > index)
                pointer = index;
        }
    }

    public static void main(String[] args) {
        SmallestInfiniteSet s = new SmallestInfiniteSet();
        System.out.println(s.popSmallest());
        System.out.println(s.popSmallest());
        System.out.println(s.popSmallest());
        System.out.println(s.popSmallest());
        System.out.println(s.popSmallest());
        System.out.println(s.popSmallest());
        System.out.println(s.popSmallest());
        System.out.println(s.popSmallest());
        System.out.println(s.popSmallest());
        s.addBack(8);
        s.addBack(2);
        s.addBack(16);
        System.out.println(s.popSmallest());
    }
}

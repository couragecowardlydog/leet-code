package com.datastructure.bst;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearchTree {

    private int[] arr;

    BinarySearchTree() {
        this.arr = new int[30];
    }

    public void insert(int data) {
        int i = 0;
        while (true) {
            if (arr[i] == 0) {
                arr[i] = data;
                break;
            }
            if (arr[i] > data) {
                i = (2 * i) + 1;
                continue;
            }
            if (arr[i] < data) {
                i = (2 * i) + 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(25);
        bst.insert(75);
        bst.insert(12);
        bst.insert(37);
        bst.insert(62);
        bst.insert(87);
        bst.insert(6);
        bst.insert(18);
        bst.insert(31);
        bst.insert(43);
        bst.insert(56);
        bst.insert(68);
        bst.insert(81);
        bst.insert(93);
        bst.insert(3);
        bst.insert(9);
        bst.insert(15);
        bst.insert(34);
        bst.insert(47);

    }
}

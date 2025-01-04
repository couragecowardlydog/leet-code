package com.datastructure.heap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinHeap {

    private int[] arr;
    int position;

    public MinHeap() {
        this.arr = new int[20];
        this.position = 0;
    }

    private void insert(int data) {
        arr[position] = data;
        bubbleUp(position);
        position++;
        System.out.println(Arrays.toString(arr));
    }

    private void bubbleUp(int current) {
        if (position == 0 || current  == 0) {
            return;
        }
        int parent = (current - 1) / 2;
        System.out.println("Current" + position + "Element" + arr[current]);
        System.out.println("Parent" + parent);

        if (arr[parent] > arr[current]) {
            System.out.println("Returning");
            return;
        }
        int temp = arr[current];
        arr[current] = arr[parent];
        arr[parent] = temp;
        System.out.println("Switch");
        System.out.println(Arrays.toString(arr));
        System.out.println("Bubbling positiion" + parent);
        bubbleUp(parent);
    }



    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(55);
        minHeap.insert(30);
        minHeap.insert(75);
        minHeap.insert(50);
        minHeap.insert(10);
        minHeap.insert(60);
        minHeap.insert(80);
        minHeap.insert(15);
        minHeap.insert(35);
        minHeap.insert(25);
        minHeap.insert(45);
        minHeap.insert(40);
        minHeap.insert(5);
        minHeap.insert(70);
        minHeap.insert(90);
        minHeap.insert(20);
        minHeap.insert(65);
        minHeap.insert(95);
        minHeap.insert(85);
        minHeap.insert(100);
    }


}

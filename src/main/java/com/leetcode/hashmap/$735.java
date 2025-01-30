package com.leetcode.hashmap;

public class $735 {

    public int[] asteroidCollision(int[] asteroids) {
        int[] stackArray = new int[asteroids.length];
        int top = -1;
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] < 0 && top > -1) {
                while (top >= 0) {
                    if (stackArray[top] < 0 && asteroids[i] < 0) {
                        stackArray[++top] = asteroids[i];
                        break;
                    }
                    int y = stackArray[top];
                    if ((asteroids[i] * -1) == y) {
                        top--;
                        break;
                    } else if ((asteroids[i] * -1) > y) {
                        top--;
                        if (top == -1) {
                            stackArray[++top] = asteroids[i];
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                stackArray[++top] = asteroids[i];
            }
        }
        int[] result = new int[top + 1];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stackArray[i];
        }
        return result;
    }
}

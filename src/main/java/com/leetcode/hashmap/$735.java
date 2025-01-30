package com.leetcode.hashmap;

import java.util.Stack;

public class $735 {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] < 0 && !stack.isEmpty()) {
                while (!stack.isEmpty()) {
                    if (stack.peek() < 0 && asteroids[i] < 0) {
                        stack.push(asteroids[i]);
                        break;
                    }
                    int y = stack.peek();
                    if ((asteroids[i] * -1) == y) {
                        stack.pop();
                        break;
                    } else if ((asteroids[i] * -1) > y) {
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push(asteroids[i]);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                stack.push(asteroids[i]);
            }
            System.out.println(stack);

        }
        int[] result = stack.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}

package com.leetcode.stack;

import java.util.Stack;

public class $394 {

    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder buffer = new StringBuilder();
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            stack.push(c);
        }
        int count = 0;
        while (!stack.isEmpty()) {
            char c = stack.pop();
            System.out.println(c);
            if (c == ']') {
                count++;
            } else if (c == '[') {
                count--;
                StringBuilder charCountStr = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() > 47 && stack.peek() < 58) {
                    charCountStr.append(stack.pop());
                }
                int charCount = Integer.parseInt(charCountStr.reverse().toString()) ;
                String x = buffer.toString();
                while (charCount - 1 > 0) {
                    buffer.append(x);
                    charCount--;
                }
                if (count == 0) {
                    sb.append(buffer);
                    buffer.delete(0, buffer.length());
                }
            } else {
                if (count == 0) {
                    sb.append(c);
                } else {
                    buffer.append(c);
                }
            }
        }
        return sb.reverse().toString();
    }
}

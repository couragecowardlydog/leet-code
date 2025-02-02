package com.leetcode.stack;

import java.util.Stack;

public class $394 {


    public String decodeString(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        Stack<Character> temp = new Stack<>();
        StringBuilder charCountStr = new StringBuilder();
        for (char c : chars) {
            if (c == ']') {
                while (stack.peek() != '[') {
                    temp.push(stack.pop());
                }
                stack.pop();
                while (!stack.isEmpty() && stack.peek() > 47 && stack.peek() < 58) {
                    charCountStr.append(stack.pop());
                }
                int charCount = Integer.parseInt(charCountStr.reverse().toString());
                charCountStr.delete(0, charCountStr.length());
                char[] data = new char[temp.size()];
                int counter = 0;
                while (!temp.isEmpty()) {
                    data[counter++] = temp.pop();
                }
                while (charCount > 0) {
                    for (int i = 0; i < data.length; i++) {
                        stack.push(data[i]);
                    }
                    charCount--;
                }

            } else {
                stack.push(c);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }


}

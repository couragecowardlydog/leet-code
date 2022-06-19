package com.leetcode.string;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            switch (current) {
                case ')':
                case '}':
                case ']':
                    if (stack.size() == 0)
                        return false;
                    char top = stack.peek();
                    if (
                            (current == ')' && top == '(') ||
                                    (current == '}' && top == '{') ||
                                    (current == ']' && top == '[')
                    )
                        stack.pop();
                    else
                        return false;
                    break;
                default:
                    stack.push(current);
            }
        }

        return stack.isEmpty();
    }

}

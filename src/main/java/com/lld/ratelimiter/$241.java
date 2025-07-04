package com.lld.ratelimiter;

import java.util.ArrayList;
import java.util.List;

public class $241 {

    List<String> path = new ArrayList<>();
    List<Integer> result = new ArrayList<>();
    String expression;

    public List<Integer> diffWaysToCompute(String expression) {
        this.expression = expression;
        return result;
    }


    private void traverse(int index) {
        if (index >= expression.length()) {
            // add to result;
            return;
        }

        // char at index is operator
        // char at index is operand
        switch (expression.charAt(index)) {
            case '+':
                break;
            case '-':
                break;
            case '*':
                break;
            case '/':
                break;
            default:
                // operand
                break;
        }


    }


}

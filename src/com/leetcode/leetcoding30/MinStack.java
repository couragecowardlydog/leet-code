package com.leetcode.leetcoding30;


public class MinStack {

    class StackObject {
        int value;
        int minValue;

        StackObject(int value, int minValue) {
            this.value = value;
            this.minValue = minValue;

        }

        @Override
        public String toString() {
            return "StackObject{" +
                    "value=" + value +
                    ", minValue=" + minValue +
                    '}';
        }
    }


    StackObject[] stack;
    int top;
    int minValue;

    public MinStack() {
        stack = new StackObject[10000];
        this.top = -1;
        this.minValue = Integer.MAX_VALUE;

    }

    public void push(int x) {
        if(top==-1)
            minValue = Integer.MAX_VALUE;
        minValue = x < minValue ? x : minValue;
        this.stack[++top] = new StackObject(x, minValue);
    }

    public void pop() {
        top--;
        if(top != -1)
        this.minValue = stack[top].minValue;

    }

    public int top() {
        return stack[top].value;
    }


    public int getMin() {
        return stack[top].minValue;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        /*minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.push(2147483647);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.push(-2147483648);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());*/

    //["MinStack","push","push","getMin","getMin","push","getMin","getMin","top","getMin","pop","push","push","getMin","push","pop","top","getMin","pop"]
    //[[],[-10],[14],[],[],[-20],[],[],[],[],[],[10],[-7],[],[-7],[],[],[],[]]


        minStack.push(-10);
        minStack.push(14);
        System.out.println(minStack.getMin());
        System.out.println(minStack.getMin());
        minStack.push(-20);
        System.out.println(minStack.getMin());
        System.out.println(minStack.getMin());
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.push(10);
        minStack.push(-7);
        System.out.println(minStack.getMin());
        minStack.push(-7);
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();

        System.out.println();



    }
}

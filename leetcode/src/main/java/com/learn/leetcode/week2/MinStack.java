package com.learn.leetcode.week2;

/**
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素。
 *  
 */
public class MinStack {
    private static final int DEFAULT_CAPACITY = 10;
    private int top = -1;
    private int capacity = DEFAULT_CAPACITY;
    private int[] stack = new int[DEFAULT_CAPACITY];
    private int minIndex = 0;

    public MinStack() {
    }

    public void push(int x) {
        if(top+1 == capacity){
            capacity *=2;
            int[] newStack = new int[capacity];
            for (int i = 0; i <= top; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
        }
        stack[++top] = x;
        if(x<stack[minIndex]){
            minIndex = top;
        }
    }

    public void pop() {
        --top;
        if(top +1 == minIndex){
            minIndex = findMin();
        }
    }

    public int top() {
        return stack[top];
    }

    public int getMin() {
        return stack[minIndex];
    }

    private int findMin(){
        int minVal = stack[0];
        int minIndex = 0;
        for (int i = 1; i <= top; i++) {
            if(stack[i]<minVal){
                minVal = stack[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class DefaultStack implements Stack {
    private final int MAX_SIZE = 5;
    private final int[] NUM = new int[MAX_SIZE];
    private int index = 0;


    @Override
    public void push(int val) {
        if (index == MAX_SIZE) {
            throw new StackIndexOutOfBoundsException("Stack Index Out Of Bounds Exception");
        }
        NUM[index++] = val;


    }

    @Override
    public int pop() throws EmptyStackException {


        if(index-1 < 0){
            throw new EmptyStackException("Empty Stack Exception");
        }
        int k = NUM[index-1];
        NUM[index-1] = 0;


        return k;
    }

    @Override
    public String toString() {
        return "DefaultStack{" +
                "num=" + Arrays.toString(NUM) +
                '}';
    }


    public static void main(String[] args) {
        DefaultStack stack = new DefaultStack();

        System.out.println(stack.pop());


        System.out.println(stack.toString());
    }
}

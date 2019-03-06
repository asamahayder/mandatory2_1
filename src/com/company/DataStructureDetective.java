package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DataStructureDetective {

    public DataStructureDetective() {
    }

    public String[] getOperations(String[] input){
        String[] operations = new String[input.length];
        for (int i = 0; i <input.length ; i++) {
            String currentInput = input[i];
            String operation = currentInput.substring(0,1);
            operations[i] = operation;
        }
        return operations;
    }

    public int[] getValues(String[] input){
        int[] values = new int[input.length];
        for (int i = 0; i <input.length ; i++) {
            String currentInput = input[i];
            int value = Integer.parseInt(currentInput.substring(2));
            values[i] = value;
        }
        return values;
    }

    public boolean isStack(String[]operations, int[]values){
        boolean isAStack = true;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <operations.length ; i++) {
            if (operations[i].equals("I")){
                stack.push(values[i]);

            }else if (operations[i].equals("E")){
                int expectedValue = values[i];
                int poppedValue = stack.pop();
                if (poppedValue != expectedValue){
                    isAStack=false;
                }
            }
        }
        return isAStack;
    }

    public boolean isQueue(String[] operations, int[]values){
        boolean isAQueue = true;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("I")){
                queue.add(values[i]);
            }else if (operations[i].equals("E")){
                int expectedValue = values[i];
                int actualValue = queue.remove();
                if (expectedValue != actualValue){
                    isAQueue = false;
                }
            }
        }
        return isAQueue;
    }

    public boolean isSmallestFirstQueue(){
        boolean isSmallestFirstQueue = true;
        Queue<Integer>

        return isSmallestFirstQueue;
    }
}

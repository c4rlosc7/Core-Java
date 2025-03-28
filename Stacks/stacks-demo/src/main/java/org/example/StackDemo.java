package org.example;

import java.util.Stack;

public class StackDemo {

    /**
     * Pushing element on the top of the stack
     * @param stack
     */
    public static void stackPush(Stack<Integer> stack) {
        for (int index = 0; index < 5; index++) {
            stack.push(index);
        }
    }

    /**
     * Popping element from the top of the stack
     * @param stack
     */
    public static void stackPop(Stack<Integer> stack) {
        for (int index = 0; index < 5; index++){
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    /**
     * Displaying element on the top of the stack
     * @param stack
     */
    public static void stackPeek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    public static void stackSearch(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);
        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element is found at position: " + pos);
        }
    }

    public static void main(String[] args) {
        // LIFO(last-in-first-out)
        Stack<Integer> stack = new Stack<>();
        stackPush(stack);
        stackPop(stack);

        stackPush(stack);
        stackPeek(stack);
        stackSearch(stack, 2);
        stackSearch(stack, 6);
    }
}
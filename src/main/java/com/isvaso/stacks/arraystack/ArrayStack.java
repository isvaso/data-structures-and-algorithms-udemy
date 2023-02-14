package com.isvaso.stacks.arraystack;

import java.util.EmptyStackException;

/**
 * Array Stack implementation
 * <br><br>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class ArrayStack {

    private Employee[] stack;
    private int top;

    /**
     * Constructor with capacity
     * @param capacity initial stack dimension
     */
    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    /**
     * Method adds new element into stack
     * @param employee {@code Employee} which should be added
     */
    public void push(Employee employee) {
        if (top == stack.length) {
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0,
                    newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = employee;
    }

    /**
     * Method removes top element from stack and return them
     * @return {@code Employee} which has been removed
     */
    public Employee pop() {
        if (isEmpty()) {
            throw  new EmptyStackException();
        }

        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    /**
     * Method returns top element from stack
     * @return {@code Employee}
     */
    public Employee peek() {
        if (isEmpty()) {
            throw  new EmptyStackException();
        }

        return stack[top - 1];
    }

    /**
     * Method shows size of stack
     * @return {@code int}
     */
    public int size() {
        return top;
    }

    /**
     * Method checks stack for empty
     * @return {@code Boolean}
     */
    public boolean isEmpty() {
        return top == 0;
    }

    /**
     * Method prints stack list
     */
    public void printStack() {
        for (int i = top - 1; i  >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    /**
     * Overridden toString method
     * @return {@code String} with stack list
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = top - 1; i  >= 0; i--) {
            sb.append(stack[i] + System.lineSeparator());
        }
        return sb.toString();
    }
}

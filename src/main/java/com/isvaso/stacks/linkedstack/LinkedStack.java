package com.isvaso.stacks.linkedstack;

import java.util.LinkedList;

/**
 * Linked List Stack implementation
 * <br><br>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class LinkedStack {

    private LinkedList<Employee> stack;

    /**
     * Constructor with capacity
     */
    public LinkedStack() {
        stack = new LinkedList<>();
    }

    /**
     * Method adds new element into stack
     * @param employee {@code Employee} which should be added
     */
    public void push(Employee employee) {
        stack.push(employee);
    }

    /**
     * Method removes top element from stack and return them
     * @return {@code Employee} which has been removed
     */
    public Employee pop(){
        return stack.pop();
    }

    /**
     * Method returns top element from stack
     * @return {@code Employee}
     */
    public Employee peek() {
        return stack.peek();
    }

    /**
     * Method checks stack for empty
     * @return {@code Boolean}
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Method prints stack list
     */
    public void printStack() {
        stack.forEach(n -> System.out.println(n));
    }

    /**
     * Overridden toString method
     * @return {@code String} with stack list
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        stack.forEach(n -> sb.append(n + System.lineSeparator()));

        return sb.toString();
    }
}

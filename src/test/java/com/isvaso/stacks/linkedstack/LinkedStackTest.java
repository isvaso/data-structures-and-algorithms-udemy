package com.isvaso.stacks.linkedstack;

import org.junit.jupiter.api.Test;

class LinkedStackTest {

    LinkedStack stack;

    @Test
    void Test() {
        stack = new LinkedStack();

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

        System.out.format("Stack after pushes: \n%s\n", stack);

        System.out.format("Peek: %s\n", stack.peek());
        System.out.format("Stack after peek: \n%s\n", stack);

        System.out.format("Pop: %s\n", stack.pop());
        System.out.format("Stack after pop: \n%s\n", stack);
    }
}
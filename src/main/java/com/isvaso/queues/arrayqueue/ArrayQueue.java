package com.isvaso.queues.arrayqueue;

/**
 * Array Queue implementation
 * <br><br>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
import java.util.NoSuchElementException;

class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    /**
     * Constructor with capacity
     * @param capacity initial stack dimension
     */
    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    /**
     * Method adds new element to the back of queue
     * @param employee {@code Employee} which should be added
     */
    public void add(Employee employee) {
        if (back == queue.length) {
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, 0,
                    newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = employee;
        back++;
    }

    /**
     * Method removes first element from queue and return them
     * @return {@code Employee} which has been removed
     */
    public Employee remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        queue[front] = null;
        front++;

        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return employee;
    }

    /**
     * Method returns first element from queue
     * @return {@code Employee}
     */
    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    /**
     * Method shows size of queue
     * @return {@code int}
     */
    public int size() {
        return back - front;
    }

    /**
     * Method prints stack list
     */
    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
}

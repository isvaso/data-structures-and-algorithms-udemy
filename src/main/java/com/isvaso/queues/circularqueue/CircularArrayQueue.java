package com.isvaso.queues.circularqueue;

/**
 * Array Queue implementation
 * <br><br>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */

import java.util.NoSuchElementException;

class CircularArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    /**
     * Constructor with capacity
     * @param capacity initial stack dimension
     */
    public CircularArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    /**
     * Method adds new element to the back of queue
     * @param employee {@code Employee} which should be added
     */
    public void add(Employee employee) {
        if (size() == queue.length) {
            int numItems = size();
            Employee[] newArray = new Employee[2 * queue.length];

            System.arraycopy(queue, front,
                    newArray, 0, queue.length - front);
            System.arraycopy(queue, 0,
                    newArray, queue.length - front, back);

            queue = newArray;

            front = 0;
            back = numItems;
        }

        queue[back] = employee;

        if (back < queue.length - 1) {
            back++;
        } else {
            back = 0;
        }
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
        } else if (front == queue.length) {
            front = 0;
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
        if (front <= back) {
            return back - front;
        } else {
            return back - front + queue.length;
        }
    }

    /**
     * Method prints stack list
     */
    public void printQueue() {
        if (front <= back) {
            for (int i = front; i < back; i++)
                System.out.println(queue[i]);
        } else {
            for (int i = front; i < queue.length; i++)
                System.out.println(queue[i]);
            for (int i = 0; i < back; i++)
                System.out.println(queue[i]);
        }
    }
}

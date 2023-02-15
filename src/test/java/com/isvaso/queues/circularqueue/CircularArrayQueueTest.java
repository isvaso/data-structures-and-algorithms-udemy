package com.isvaso.queues.circularqueue;

import org.junit.jupiter.api.Test;

class CircularArrayQueueTest {

    @Test
    void Test() {
        Employee emp1 =
                new Employee("Jane", "Jones", 123);
        Employee emp2 =
                new Employee("John", "Doe", 4567);
        Employee emp3 =
                new Employee("Mary", "Smith", 22);
        Employee emp4 =
                new Employee("Mike", "Wilson", 3245);
        Employee emp5 =
                new Employee("Bill", "End", 78);

        CircularArrayQueue arrayQueue = new CircularArrayQueue(10);

        arrayQueue.add(emp1);
        arrayQueue.add(emp2);
        arrayQueue.remove();
        arrayQueue.add(emp3);
        arrayQueue.remove();
        arrayQueue.add(emp4);
        arrayQueue.remove();
        arrayQueue.add(emp5);
        arrayQueue.remove();
        arrayQueue.add(emp1);
        arrayQueue.add(emp4);

        arrayQueue.printQueue();
        System.out.println();

        arrayQueue.add(emp1);
        arrayQueue.add(emp2);
        arrayQueue.add(emp3);
        arrayQueue.add(emp4);
        arrayQueue.add(emp5);

        arrayQueue.printQueue();
        System.out.println();

        System.out.println("Peek: " + arrayQueue.peek());
        System.out.println();

        System.out.println("Remove: " + arrayQueue.remove());
        arrayQueue.printQueue();
    }
}
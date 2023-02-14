package com.isvaso.lists.doublylinkedlist;

import org.junit.jupiter.api.Test;

class EmployeeDoublyLinkedListTest {

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

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(emp1);
        list.addToFront(emp2);
        list.addToFront(emp3);
        list.addToFront(emp4);

        System.out.println(list.getSize());

        Employee emp5 = new Employee("Bill", "End", 78);

        list.addToEnd(emp5);
        list.printList();
        System.out.println();
        System.out.println(list.getSize());
        list.removeFromFront();
        list.printList();
        list.removeFromEnd();
        list.printList();
    }

}
package com.isvaso.lists.singlylinkedlist;

import org.junit.jupiter.api.Test;

class EmployeeLinkedListTest {

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

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(emp1);
        list.addToFront(emp2);
        list.addToFront(emp3);
        list.addToFront(emp4);

        list.printList();
        System.out.println();

        list.removeFromFront();
        System.out.println("Size is: " + list.getSize());
        list.printList();
    }
}
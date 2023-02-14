package com.isvaso.lists.challenge1;

/**
 * Linked Lists - Challenge #1
 * <br>
 * <ul>
 *     <li>Implement the addBefore() method
 *     for the EmployeeDoublyLinkedList class</li>
 *     <li>Use the starter project in resources section</li>
 *     <li>Project contains all the code you need
 *     and en empty addBefore() method</li>
 *     <li>Main method contains code that should work when you're finished</li>
 * </ul>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy
 */
class ChallengeMain {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        list.printList();

        list.addBefore(billEnd, johnDoe);
        list.printList();
		list.addBefore(new Employee("Someone", "Else", 1111), mikeWilson);
        list.printList();
    }
}

package com.isvaso.lists.challenge2;

/**
 * Linked Lists - Challenge #2
 * <br>
 * <ul>
 *     <li>Use the starter project in the resources section</li>
 *     <li>Implement a method int the integerLinkedList class
 *     that inserts a value in sorted order</li>
 *     <li>Lower values should appear first int the list
 *     (be closer to the head)</li>
 *     <li>If we insert 4, 2, 1, 5, list should look like
 *     HEAD->1->2->4->5->null</li>
 *     <li>IntegerLinkedList is a singly-linked list</li>
 *     <li>Project contains all the code you need
 *     and an empty insertSorted() method</li>
 *     <li>Main method contains code that should work when you're finished</li>
 * </ul>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy
 */
public class ChallengeMain {

    public static void main(String[] args) {

        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;

        IntegerLinkedList list = new IntegerLinkedList();
        list.insertSorted(three);
        list.printList();
        list.insertSorted(two);
        list.printList();
        list.insertSorted(one);
        list.printList();
        list.insertSorted(four);
        list.printList();
    }
}

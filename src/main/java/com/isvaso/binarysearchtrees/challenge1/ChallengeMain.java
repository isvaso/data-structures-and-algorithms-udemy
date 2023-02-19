package com.isvaso.binarysearchtrees.challenge1;

/**
 * Binary Search Trees - Challenge #1
 * <br>
 * <ul>
 *     <li>Add preorder traversal to our Tree implementation</li>
 * </ul>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class ChallengeMain {

    public static void main(String[] args) {

        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);

        intTree.traversePreOrder();
    }
}

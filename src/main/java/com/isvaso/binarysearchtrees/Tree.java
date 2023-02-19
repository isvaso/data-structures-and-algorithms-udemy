package com.isvaso.binarysearchtrees;

/**
 * Binary Search Tree implementation
 * <br>
 * <ul>
 *     <li>Every node has 0, 1 or 2 children</li>
 *     <li>Children are referred to as left child and right child</li>
 *     <li>Can perform insertions, deletions,
 *     and retrievals in O(log n) time</li>
 *     <li>The left child always has a smaller value than its parent</li>
 *     <li>The right child always has a larger value than its parent</li>
 *     <li>It means everything to the left of the root is less
 *     than the value og the root, and everything to the right of the root
 *     is greater than the value of the root</li>
 *     <li>Because of that, we can do a binary search</li>
 * </ul>
 * <br>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class Tree {

    private TreeNode root;

    /**
     * Method inserts {@code int} value in three relative to the root of tree
     * @param value {@code Three} for fluent builder
     */
    public Tree insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
        return this;
    }

    /**
     * Method deletes value from the tree
     * @param value {@code int} for deleting
     */
    public void delete(int value) {
        root = delete(root, value);
    }

    /**
     * Recursive submethod with the main logic
     * of removing the value from the tree
     * @param subtreeRoot {@code TreeNode} from which the value is removed
     * @param value {@code int} for remove
     * @return {@code TreeNode} for recursive implementation
     */
    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return null;
        }

        if (value < subtreeRoot.getData()) {
            subtreeRoot.setLeftChild(
                    delete(subtreeRoot.getLeftChild(), value));
        } else if (value > subtreeRoot.getData()) {
            subtreeRoot.setRightChild(
                    delete(subtreeRoot.getRightChild(), value));
        } else {
            // Node to delete has 0 or 1 child
            if (subtreeRoot.getLeftChild() == null) {
                return subtreeRoot.getRightChild();
            } else if (subtreeRoot.getRightChild() == null) {
                return subtreeRoot.getLeftChild();
            }
            // Node to delete has 2 children

            // Replace the value in the subtreeRoot node with
            // the smallest value from the right subtree
            subtreeRoot.setData(subtreeRoot.getRightChild().min());

            // Delete the node that has
            // the smallest value in the right subtree
            subtreeRoot.setRightChild(
                    delete(subtreeRoot.getRightChild(),
                            subtreeRoot.getData()));
        }
        return subtreeRoot;
    }

    /**
     * Method for getting {@code TreeNode} node by value
     * relative to the root of tree
     * @param value {@code int}
     * @return {@code TreeNode} or {@code NULL}
     * if value or root missing from the tree
     */
    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    /**
     * Method getting minimum {@code int} value in the tree
     * relative to the root of tree
     * @return {@code int} minimum value in the tree
     * or {@code Integer.MIN_VALUE} if root of tree is absent
     */
    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.min();
        }
    }

    /**
     * Method getting maximum {@code int} value in the tree
     * relative to the root of tree
     * @return {@code int} maximum value in the tree
     * or {@code Integer.MAX_VALUE} if root of tree is absent
     */
    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }

    /**
     * Method traverses through the tree relative to the root of tree
     * and prints values of nodes
     */
    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }
}

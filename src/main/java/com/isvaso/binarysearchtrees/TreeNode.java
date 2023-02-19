package com.isvaso.binarysearchtrees;

/**
 * Binary Search Tree Node implementation
 * <br><br>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    /**
     * Method inserts {@code int} value in three relative to the current node
     * @param value {@code int}
     */
    public void insert(int value) {
        if (value == data) {
            return;
        }

        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    /**
     * Method for getting {@code TreeNode} node by value
     * @param value {@code int}
     * @return {@code TreeNode} or {@code NULL} if value missing from the tree
     */
    public TreeNode get(int value) {
        if (value == data) {
            return this;
        }

        if (value < data) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        } else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }
        return null;
    }

    /**
     * Method getting minimum {@code int} value in the tree
     * @return {@code int}
     */
    public int min() {
        if (leftChild == null) {
            return data;
        } else {
            return leftChild.min();
        }
    }

    /**
     * Method getting maximum {@code int} value in the tree
     * @return {@code int}
     */
    public int max() {
        if (rightChild == null) {
            return data;
        } else {
            return rightChild.max();
        }
    }

    /**
     * Method traverses through the tree and prints values of nodes
     */
    public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.print(data + " ");
        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    /**
     * Class constructor
     * @param data {@code int} value
     */
    public TreeNode(int data) {
        this.data = data;
    }

    /**
     * Getter for node {@code int} value
     * @return {@code int} value
     */
    public int getData() {
        return data;
    }

    /**
     * Setter for node {@code int} value
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * Method for gets left child {@code TreeNode} of the current node
     * @return left child {@code TreeNode}
     */
    public TreeNode getLeftChild() {
        return leftChild;
    }

    /**
     * Method sets left child {@code TreeNode} of the current node
     * @param leftChild {@code TreeNode}
     */
    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    /**
     * Method for gets right child {@code TreeNode} of the current node
     * @return right child {@code TreeNode}
     */
    public TreeNode getRightChild() {
        return rightChild;
    }

    /**
     * Method sets right child {@code TreeNode} of the current node
     * @param rightChild {@code TreeNode}
     */
    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    /**
     * Overrides toString method
     * @return {@code String} with current node {@code int} data
     */
    @Override
    public String toString() {
        return "" + data;
    }
}

package com.isvaso.lists.doublylinkedlist;

/**
 * Doubly Linked list implementation
 * <br><br>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    /**
     * Method adds new node to front of linked list
     * @param employee new Employee
     */
    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (head == null)
            tail = node;
        else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    /**
     * Method adds new node to end of linked list
     * @param employee new Employee
     */
    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (tail == null)
            head = node;
        else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    /**
     * Method removes front {@code EmployeeNode} from linked list
     * @return new head with {@code EmployeeNode}
     */
    public EmployeeNode removeFromFront() {
        if (isEmpty())
            return null;

        EmployeeNode removedNode = head;

        if (head.getNext() == null)
            tail = null;
        else
            head.getNext().setPrevious(null);

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    /**
     * Method removes last {@code EmployeeNode} from linked list
     * @return new tail with {@code EmployeeNode}
     */
    public EmployeeNode removeFromEnd() {
        if (isEmpty())
            return null;

        EmployeeNode removedNode = tail;

        if (tail.getPrevious() == null)
            head = null;
        else
            tail.getPrevious().setNext(null);

        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    /**
     * Method checks linked list is empty or not
     * @return {@code Boolean}
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Getter for size if linked list
     * @return {@code int}
     */
    public int getSize() {
        return size;
    }

    /**
     * Method prints list of employees
     */
    public void printList() {
        EmployeeNode current = head;
        System.out.println("HEAD -> ");
        while (current != null) {
            System.out.println(current);
            System.out.println(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}

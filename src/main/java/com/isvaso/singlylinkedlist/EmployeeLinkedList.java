package com.isvaso.singlylinkedlist;

/**
 * Singly Linked list implementation
 */
public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    /**
     * Method adds new node to front of linked list
     * @param employee new Employee
     */
    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
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
        head = head.getNext();
        size--;
        removedNode.setNext(null);
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
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}

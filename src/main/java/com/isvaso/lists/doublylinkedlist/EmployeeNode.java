package com.isvaso.lists.doublylinkedlist;

/**
 * Linked list Node implementation
 * <br><br>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;
    private EmployeeNode previous;

    /**
     * EmployeeNode constructor
     * @param employee new {@code Employee}
     */
    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    /**
     * Getter for employee of this node
     * @return {@code Employee}
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Getter for link to next {@code EmployeeNode} in linked list
     * @return {@code EmployeeNode}
     */
    public EmployeeNode getNext() {
        return next;
    }

    /**
     * Setter for link to next {@code EmployeeNode} in linked list
     * @param next {@code EmployeeNode}
     */
    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    /**
     * Getter for link to previous {@code EmployeeNode} in linked list
     * @return {@code EmployeeNode}
     */
    public EmployeeNode getPrevious() {
        return previous;
    }

    /**
     * Setter for link to previous {@code EmployeeNode} in linked list
     * @param previous {@code EmployeeNode}
     */
    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    /**
     * Overridden toString method
     * @return information about employee's state
     */
    @Override
    public String toString() {
        return employee.toString();
    }
}

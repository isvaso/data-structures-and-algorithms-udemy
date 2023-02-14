package com.isvaso.lists.doublylinkedlist;

/**
 * Employee's class <br>
 * Employee have {@code String} fields  firstName, lastName
 * and {@code int} field id number.
 * <br><br>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
class Employee {

    private String firstName;
    private String lastName;
    private int id;

    /**
     * Employee's constructor
     * @param firstName {@code String} first name
     * @param lastName {@code String} last name
     * @param id {@code int} id number
     */
    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    /**
     * Getter for employee's first name
     * @return {@code String} first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for employee's first name
     * @param firstName {@code String} first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for employee's last name
     * @return {@code String} last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for employee's last name
     * @param lastName {@code String} last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for employee's id number
     * @return {@code int} id number
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for employee's id number
     * @param id {@code int} id number
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Overridden toString method
     * @return information about employee's state
     */
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}

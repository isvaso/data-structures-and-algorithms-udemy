package com.isvaso.hashtables.array;

/**
 * Class stores employees with his keys in array hashtable <br>
 */
class StoredEmployee {
    public String key;
    public Employee employee;

    /**
     * Constructor of StoredEmployee class
     * @param key {@code String} key value
     * @param employee {@code Employee} object
     */
    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }
}

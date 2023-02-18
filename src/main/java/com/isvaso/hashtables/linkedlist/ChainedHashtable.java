package com.isvaso.hashtables.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * LinkedLists Array Hashtable implementation with
 * <br><br>
 * LinkedList at each array index resolves collisions
 * <br><br>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class ChainedHashtable {

    private LinkedList<StoredEmployee>[] hashtable;

    /**
     * Constructor of ChainedHashtable class
     */
    public ChainedHashtable() {
        hashtable = new LinkedList[10];

        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<>();
        }
    }

    /**
     * Method puts {@code Employee} into hashtable
     * @param key {@code String} key value
     * @param employee {@code Employee} object
     */
    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    /**
     * Method for get {@code Employee} using {@code String} key
     * @param key {@code String} key value
     * @return  {@code Employee}
     */
    public Employee get(String key) {
        int hashedKey = hashKey(key);

        for (StoredEmployee e : hashtable[hashedKey])
            if (e.key.equals(key))
                return e.employee;

        return null;
    }

    /**
     * Method removes {@code Employee} from hashtable using {@code String} key
     * @param key {@code String} key value
     * @return {@code Employee}
     */
    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        int index = -1;

        StoredEmployee employee = null;

        for (StoredEmployee e : hashtable[hashedKey]) {
            employee = e;
            index++;
            if (e.key.equals(key))
                break;
        }

        if (employee == null || !employee.key.equals(key)) {
            return null;
        } else {
            hashtable[hashedKey].remove(index);
            return employee.employee;
        }
    }

    /**
     * Method generates hash code for {@code String} key
     * @param key {@code String} key value
     * @return {@code int}
     */
    private int hashKey(String key) {
        return Math.abs(key.length() % hashtable.length);
    }

    /**
     * Method prints hashtable
     */
    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i].isEmpty()) {
                System.out.println("Position " + i + ": empty");
            } else {
                System.out.print("Position " + i + ": ");
                Iterator<StoredEmployee> iterator = hashtable[i].iterator();

                while (iterator.hasNext()) {
                    System.out.print(iterator.next().employee);

                    if (iterator.hasNext())
                        System.out.print(" - ");
                }
                System.out.println();
            }
        }
    }
}

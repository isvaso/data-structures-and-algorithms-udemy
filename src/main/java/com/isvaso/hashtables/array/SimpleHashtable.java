package com.isvaso.hashtables.array;

/**
 * Array Hashtable implementation with Linear Probing
 * (in put(), get() methods and additional StoredEmployee class itself presence)
 * <br><br>
 * Linear probing puts items in empty index when collision
 * <br><br>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class SimpleHashtable {

    private StoredEmployee[] hashtable;

    /**
     * Constructor of SimpleHashtable class
     */
    public SimpleHashtable() {
        hashtable = new StoredEmployee[10];
    }

    /**
     * Method puts {@code Employee} into hashtable. Uses Linear Probing when
     * key is occupied
     * @param key {@code String} key value
     * @param employee {@code Employee} object
     */
    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);

        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (occupied(hashedKey)) {
            System.out.println("Sorry, there's already " +
                    "an employee at position " + hashedKey);
        } else hashtable[hashedKey] = new StoredEmployee(key, employee);
    }

    /**
     * Method for get {@code Employee} using {@code String} key
     * @param key {@code String} key value
     * @return  {@code Employee}
     */
    public Employee get(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return  null;
        }

        return hashtable[hashedKey].employee;
    }

    /**
     * Method removes {@code Employee} from hashtable using {@code String} key.
     * Method uses rebuild hashtable because uses Linear Probing in add method
     * @param key {@code String} key value
     * @return {@code Employee}
     */
    public Employee remove(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        }

        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;

        StoredEmployee[] oldHashtable = hashtable;
        hashtable = new StoredEmployee[oldHashtable.length];

        for (int i = 0; i < oldHashtable.length; i++) {
            if (oldHashtable[i] != null)
                put(oldHashtable[i].key, oldHashtable[i].employee);
        }

        return employee;
    }

    /**
     * Method generates hash code for {@code String} key
     * @param key {@code String} key value
     * @return {@code int}
     */
    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    /**
     * Method finds hashcode by {@code String} key
     * @param key {@code String} key value
     * @return {@code int}
     */
    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null
                && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }
        int stopIndex = hashedKey;

        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stopIndex
                && hashtable[hashedKey] != null
                && !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (hashtable[hashedKey] != null
                && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        } else {
            return -1;
        }

    }

    /**
     * Method checks hashtable for occupied hashcode
     * @param index {@code int} hashcode in hashtable
     * @return {@code Boolean} answer
     */
    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    /**
     * Method prints hashtable
     */
    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null)
                System.out.println("empty");
            else
                System.out.println("Position " + i + ": " + hashtable[i].employee);
        }
    }
}

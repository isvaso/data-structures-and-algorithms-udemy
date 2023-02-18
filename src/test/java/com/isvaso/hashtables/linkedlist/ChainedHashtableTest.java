package com.isvaso.hashtables.linkedlist;

import org.junit.jupiter.api.Test;

class ChainedHashtableTest {

    @Test
    void Test() {
        Employee emp1 =
                new Employee("Jane", "Jones", 123);
        Employee emp2 =
                new Employee("John", "Doe", 4567);
        Employee emp3 =
                new Employee("Mary", "Smith", 22);
        Employee emp4 =
                new Employee("Mike", "Wilson", 3245);
        Employee emp5 =
                new Employee("Bill", "End", 78);
        Employee emp6 =
                new Employee("Bill", "Smith", 78);

        ChainedHashtable chainedHashtable = new ChainedHashtable();

        chainedHashtable.put(emp1.getLastName(), emp1);
        chainedHashtable.put(emp2.getLastName(), emp2);
        chainedHashtable.put(emp3.getLastName(), emp3);
        chainedHashtable.put(emp4.getLastName(), emp4);
        chainedHashtable.put(emp5.getLastName(), emp5);
        chainedHashtable.put(emp6.getLastName(), emp6);

        chainedHashtable.remove(emp4.getLastName());

        chainedHashtable.printHashtable();

        System.out.println(chainedHashtable.get(emp6.getLastName()));
    }
}
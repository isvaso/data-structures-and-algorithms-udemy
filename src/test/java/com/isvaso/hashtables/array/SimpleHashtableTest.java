package com.isvaso.hashtables.array;

import org.junit.jupiter.api.Test;

class SimpleHashtableTest {

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

        SimpleHashtable arrayHashtable = new SimpleHashtable();
        arrayHashtable.put(emp1.getLastName(), emp1);
        arrayHashtable.put(emp2.getLastName(), emp2);
        arrayHashtable.put(emp3.getLastName(), emp3);
        arrayHashtable.put(emp4.getLastName(), emp4);
        arrayHashtable.put(emp5.getLastName(), emp5);

        arrayHashtable.printHashtable();

        System.out.println("Retrieve key Wilson: "
                + arrayHashtable.get("Wilson"));
        System.out.println("Retrieve key Smith: "
                + arrayHashtable.get("Smith"));
        System.out.println();

        arrayHashtable.remove(emp3.getLastName());
        arrayHashtable.remove(emp1.getLastName());

        arrayHashtable.printHashtable();

        System.out.println("Retrieve key Wilson: "
                + arrayHashtable.get("Wilson"));
        System.out.println("Retrieve key Smith: "
                + arrayHashtable.get("Smith"));
        System.out.println();
    }

}
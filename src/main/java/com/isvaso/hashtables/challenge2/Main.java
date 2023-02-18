package com.isvaso.hashtables.challenge2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Hashtables - Challenge #2
 * <br>
 * <ul>
 *     <li>Remove duplicate items from a linked list</li>
 *     <li>Your solution must use the JDK's LinkedList class</li>
 *     <li>Your solution must use a HashMap</li>
 * </ul>
 */
public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        System.out.println("Source employees list:");
        employees.forEach(System.out::println);

        Map<Integer, Employee> hashMap = new HashMap<>();
        employees.forEach(e -> hashMap.put(e.getId(), e));
        employees = new LinkedList<>(hashMap.values());

        System.out.println("Solution employees list:");
        employees.forEach(System.out::println);
    }
}

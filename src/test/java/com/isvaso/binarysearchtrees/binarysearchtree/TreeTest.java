package com.isvaso.binarysearchtrees.binarysearchtree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class TreeTest {

    Tree intTree = new Tree();

    @BeforeEach
    @Test
    void insert() {
        intTree.insert(25)
                .insert(20)
                .insert(15)
                .insert(27)
                .insert(30)
                .insert(29)
                .insert(26)
                .insert(22)
                .insert(32);
    }

    @Test
    void get() {
        assertEquals(25, intTree.get(25).getData());
        assertNull(intTree.get(21));
        assertEquals(32, intTree.get(32).getData());
    }

    @Test
    void traverseInOrder() {
        intTree.traverseInOrder();
    }

    @Test
    void min() {
        assertEquals(15, intTree.min());
    }

    @Test
    void max() {
        assertEquals(32, intTree.max());
    }

    @Test
    void delete() {
        intTree.delete(29);
        intTree.delete(27);
        intTree.delete(99);
        assertNull(intTree.get(29));
        assertNull(intTree.get(27));
        intTree.traverseInOrder();
    }
}
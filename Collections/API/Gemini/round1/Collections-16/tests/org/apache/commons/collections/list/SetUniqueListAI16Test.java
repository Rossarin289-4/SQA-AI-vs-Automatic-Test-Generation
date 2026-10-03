package org.apache.commons.collections.list;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class SetUniqueListAI16Test {

    @Test
    public void testDecorateMaintainsOrderAndEliminatesDuplicates() {
        List source = new ArrayList();
        source.add("A");
        source.add("B");
        source.add("A");
        source.add("C");

        SetUniqueList list = SetUniqueList.decorate(source);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
        Assert.assertTrue(list.contains("A"));
        Assert.assertTrue(list.contains("B"));
        Assert.assertTrue(list.contains("C"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDecorateNullListThrowsException() {
        SetUniqueList.decorate(null);
    }

    @Test
    public void testAddAndAddIndex() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        Assert.assertTrue(list.add("A"));
        Assert.assertFalse(list.add("A"));
        Assert.assertEquals(1, list.size());

        list.add(0, "B");
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("B", list.get(0));
        Assert.assertEquals("A", list.get(1));

        // Adding duplicate at index should be ignored
        list.add(1, "A");
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("A", list.get(1));
    }

    @Test
    public void testAddAll() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");

        List toAdd = Arrays.asList(new Object[]{"B", "A", "C", "B"});
        boolean changed = list.addAll(toAdd);

        Assert.assertTrue(changed);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));

        // AddAll when all exist returns false
        Assert.assertFalse(list.addAll(Arrays.asList(new Object[]{"A", "C"})));
        Assert.assertEquals(3, list.size());
    }

    @Test
    public void testAddAllAtIndex() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("D");

        List toAdd = Arrays.asList(new Object[]{"B", "A", "C"});
        boolean changed = list.addAll(1, toAdd);

        Assert.assertTrue(changed);
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
        Assert.assertEquals("D", list.get(3));
    }

    @Test
    public void testSetMethod() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");

        // Normal set with brand new element
        Object old = list.set(1, "D");
        Assert.assertEquals("B", old);
        Assert.assertEquals(3, list.size());
        Assert.assertFalse(list.contains("B"));
        Assert.assertTrue(list.contains("D"));
        Assert.assertEquals("D", list.get(1));

        // Set replacing index with an element that already exists later in list
        // List is [A, D, C], replace index 0 (A) with C
        old = list.set(0, "C");
        Assert.assertEquals("A", old);
        // Duplicate at old position should be removed, leaving [C, D]
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("C", list.get(0));
        Assert.assertEquals("D", list.get(1));
        Assert.assertFalse(list.contains("A"));
    }

    @Test
    public void testRemoveMethods() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        Assert.assertTrue(list.remove("B"));
        Assert.assertFalse(list.contains("B"));
        Assert.assertEquals(3, list.size());

        Object removed = list.remove(1);
        Assert.assertEquals("C", removed);
        Assert.assertFalse(list.contains("C"));
        Assert.assertEquals(2, list.size());

        list.removeAll(Arrays.asList(new Object[]{"A"}));
        Assert.assertEquals(1, list.size());
        Assert.assertTrue(list.contains("D"));

        list.clear();
        Assert.assertEquals(0, list.size());
        Assert.assertFalse(list.contains("D"));
    }

    @Test
    public void testRetainAll() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");

        boolean changed = list.retainAll(Arrays.asList(new Object[]{"B", "C", "Z"}));
        Assert.assertTrue(changed);
        Assert.assertEquals(2, list.size());
        Assert.assertFalse(list.contains("A"));
        Assert.assertTrue(list.contains("B"));
        Assert.assertTrue(list.contains("C"));
    }

    @Test
    public void testIteratorRemove() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator it = list.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("A", it.next());
        it.remove();

        Assert.assertEquals(2, list.size());
        Assert.assertFalse(list.contains("A"));
        Assert.assertEquals("B", list.get(0));
    }

    @Test
    public void testListIteratorAddAndSet() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("C");

        ListIterator lit = list.listIterator();
        Assert.assertEquals("A", lit.next());
        lit.add("B"); // Add unique element
        lit.add("C"); // Duplicate, should not be added

        Assert.assertEquals(3, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));

        try {
            lit.set("X");
            Assert.fail("Expected UnsupportedOperationException on ListIterator.set");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void testSubListAndAsSet() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        List sub = list.subList(1, 3);
        Assert.assertEquals(2, sub.size());
        Assert.assertEquals("B", sub.get(0));
        Assert.assertEquals("C", sub.get(1));
        Assert.assertTrue(sub.contains("B"));
        Assert.assertFalse(sub.contains("A"));

        Set setView = list.asSet();
        Assert.assertEquals(4, setView.size());
        Assert.assertTrue(setView.contains("A"));
        try {
            setView.add("E");
            Assert.fail("Expected UnsupportedOperationException when modifying asSet() view");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }
}

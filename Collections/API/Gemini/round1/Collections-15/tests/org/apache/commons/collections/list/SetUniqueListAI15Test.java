package org.apache.commons.collections.list;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class SetUniqueListAI15Test {

    @Test
    public void testDecorateWithDuplicates() {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("C");

        SetUniqueList uniqueList = SetUniqueList.decorate(list);

        Assert.assertEquals(3, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertEquals("C", uniqueList.get(2));
        Assert.assertTrue(uniqueList.contains("A"));
        Assert.assertTrue(uniqueList.contains("B"));
        Assert.assertTrue(uniqueList.contains("C"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDecorateNullList() {
        SetUniqueList.decorate(null);
    }

    @Test
    public void testAddAndAddAtIndexDuplicates() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        Assert.assertTrue(uniqueList.add("A"));
        Assert.assertFalse(uniqueList.add("A"));
        Assert.assertEquals(1, uniqueList.size());

        uniqueList.add(0, "A");
        Assert.assertEquals(1, uniqueList.size());

        uniqueList.add(0, "B");
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertEquals("B", uniqueList.get(0));
        Assert.assertEquals("A", uniqueList.get(1));
    }

    @Test
    public void testAddAll() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");

        List toAdd = Arrays.asList(new Object[]{"B", "C", "D", "A", "E"});
        boolean changed = uniqueList.addAll(toAdd);

        Assert.assertTrue(changed);
        Assert.assertEquals(5, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertEquals("C", uniqueList.get(2));
        Assert.assertEquals("D", uniqueList.get(3));
        Assert.assertEquals("E", uniqueList.get(4));

        boolean changedAgain = uniqueList.addAll(Arrays.asList(new Object[]{"A", "B"}));
        Assert.assertFalse(changedAgain);
        Assert.assertEquals(5, uniqueList.size());
    }

    @Test
    public void testAddAllAtIndex() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("D");

        List toAdd = Arrays.asList(new Object[]{"B", "A", "C"});
        boolean changed = uniqueList.addAll(1, toAdd);

        Assert.assertTrue(changed);
        Assert.assertEquals(4, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertEquals("C", uniqueList.get(2));
        Assert.assertEquals("D", uniqueList.get(3));
    }

    @Test
    public void testSetMethod() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        // Normal replacement with a new element
        Object old = uniqueList.set(1, "X");
        Assert.assertEquals("B", old);
        Assert.assertEquals(3, uniqueList.size());
        Assert.assertFalse(uniqueList.contains("B"));
        Assert.assertTrue(uniqueList.contains("X"));
        Assert.assertEquals("X", uniqueList.get(1));

        // Replacement where element already exists elsewhere in the list
        // List is [A, X, C], replace at index 0 with "C" -> "C" at index 2 should be removed
        old = uniqueList.set(0, "C");
        Assert.assertEquals("A", old);
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertEquals("C", uniqueList.get(0));
        Assert.assertEquals("X", uniqueList.get(1));
        Assert.assertFalse(uniqueList.contains("A"));
    }

    @Test
    public void testRemoveOperations() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");
        uniqueList.add("D");

        // remove by index
        Object removed = uniqueList.remove(1);
        Assert.assertEquals("B", removed);
        Assert.assertFalse(uniqueList.contains("B"));
        Assert.assertEquals(3, uniqueList.size());

        // remove by object
        boolean removedObj = uniqueList.remove("C");
        Assert.assertTrue(removedObj);
        Assert.assertFalse(uniqueList.contains("C"));
        Assert.assertEquals(2, uniqueList.size());

        // removeAll
        uniqueList.removeAll(Arrays.asList(new Object[]{"A", "Z"}));
        Assert.assertEquals(1, uniqueList.size());
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertTrue(uniqueList.contains("D"));

        // clear
        uniqueList.clear();
        Assert.assertEquals(0, uniqueList.size());
        Assert.assertFalse(uniqueList.contains("D"));
    }

    @Test
    public void testRetainAll() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        boolean changed = uniqueList.retainAll(Arrays.asList(new Object[]{"B", "C", "D"}));
        Assert.assertTrue(changed);
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertTrue(uniqueList.contains("B"));
        Assert.assertTrue(uniqueList.contains("C"));
    }

    @Test
    public void testIteratorRemove() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        Iterator it = uniqueList.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("A", it.next());
        it.remove();

        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertEquals("B", uniqueList.get(0));
    }

    @Test
    public void testListIteratorAddAndRemove() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");

        ListIterator lit = uniqueList.listIterator();
        Assert.assertEquals("A", lit.next());
        lit.add("C"); // list is now [A, C, B]
        Assert.assertTrue(uniqueList.contains("C"));
        Assert.assertEquals(3, uniqueList.size());

        lit.add("B"); // duplicate, should not be added
        Assert.assertEquals(3, uniqueList.size());

        Assert.assertEquals("B", lit.next());
        lit.remove(); // removes "B"
        Assert.assertFalse(uniqueList.contains("B"));
        Assert.assertEquals(2, uniqueList.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIteratorSetThrowsUnsupportedOperationException() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        ListIterator lit = uniqueList.listIterator();
        lit.next();
        lit.set("B");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAsSetIsUnmodifiable() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        Set setView = uniqueList.asSet();
        Assert.assertTrue(setView.contains("A"));
        setView.add("B");
    }
}

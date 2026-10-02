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

public class SetUniqueListAI5Test {

    @Test
    public void testDecorateWithDuplicates() {
        List base = new ArrayList();
        base.add("A");
        base.add("B");
        base.add("A");
        base.add("C");
        base.add("B");

        SetUniqueList uniqueList = SetUniqueList.decorate(base);
        Assert.assertEquals(3, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertEquals("C", uniqueList.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDecorateNullList() {
        SetUniqueList.decorate(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullSet() {
        new SetUniqueList(new ArrayList(), null);
    }

    @Test
    public void testAddAndAddAtIndex() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        Assert.assertTrue(list.add("A"));
        Assert.assertFalse(list.add("A"));
        Assert.assertEquals(1, list.size());

        list.add(0, "B");
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("B", list.get(0));
        Assert.assertEquals("A", list.get(1));

        // Attempt duplicate insert at index
        list.add(0, "B");
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("B", list.get(0));
    }

    @Test
    public void testAddAll() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        List toAdd = Arrays.asList(new Object[]{"B", "C", "A", "D"});
        boolean changed = list.addAll(toAdd);

        Assert.assertTrue(changed);
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
        Assert.assertEquals("D", list.get(3));

        boolean changedAgain = list.addAll(Arrays.asList(new Object[]{"C", "D"}));
        Assert.assertFalse(changedAgain);
        Assert.assertEquals(4, list.size());
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
    public void testSetOperation() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");

        // Normal set with new element
        Object old = list.set(1, "D");
        Assert.assertEquals("B", old);
        Assert.assertEquals(3, list.size());
        Assert.assertFalse(list.contains("B"));
        Assert.assertTrue(list.contains("D"));
        Assert.assertEquals("D", list.get(1));

        // Set with same element at same index
        old = list.set(1, "D");
        Assert.assertEquals("D", old);
        Assert.assertEquals(3, list.size());

        // Set with an element already existing at another index
        // list currently: ["A", "D", "C"]
        // setting index 0 to "C": replaces "A" with "C", then removes original "C" at index 2
        old = list.set(0, "C");
        Assert.assertEquals("A", old);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("C", list.get(0));
        Assert.assertEquals("D", list.get(1));
    }

    @Test
    public void testRemoveOperations() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        // remove by object
        Assert.assertTrue(list.remove("B"));
        Assert.assertFalse(list.remove("B"));
        Assert.assertFalse(list.contains("B"));
        Assert.assertEquals(3, list.size());

        // remove by index
        Object removed = list.remove(1);
        Assert.assertEquals("C", removed);
        Assert.assertFalse(list.contains("C"));
        Assert.assertEquals(2, list.size());

        // removeAll
        list.removeAll(Arrays.asList(new Object[]{"A", "Z"}));
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("D", list.get(0));

        // retainAll
        list.retainAll(Arrays.asList(new Object[]{"X"}));
        Assert.assertEquals(0, list.size());
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testClearAndAsSet() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        Set setView = list.asSet();
        Assert.assertEquals(2, setView.size());
        Assert.assertTrue(setView.contains("A"));
        Assert.assertTrue(setView.contains("B"));

        list.clear();
        Assert.assertEquals(0, list.size());
        Assert.assertEquals(0, setView.size());
        Assert.assertFalse(list.contains("A"));
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

        Assert.assertFalse(list.contains("A"));
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("B", list.get(0));
    }

    @Test
    public void testListIteratorAddAndSet() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("C");

        ListIterator lit = list.listIterator();
        Assert.assertEquals("A", lit.next());
        lit.add("B");
        // Duplicate add via list iterator should be ignored
        lit.add("A");

        Assert.assertEquals(3, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));

        Assert.assertEquals("B", lit.previous());
        lit.remove();
        Assert.assertEquals(2, list.size());
        Assert.assertFalse(list.contains("B"));

        try {
            lit.set("X");
            Assert.fail("ListIterator.set should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testSubListBehavior() {
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
        // subList is a SetUniqueList sharing the set
        Assert.assertTrue(sub instanceof SetUniqueList);
    }
}

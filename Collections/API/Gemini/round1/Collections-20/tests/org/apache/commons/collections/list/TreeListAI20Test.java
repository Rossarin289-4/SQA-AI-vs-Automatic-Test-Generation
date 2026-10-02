package org.apache.commons.collections.list;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class TreeListAI20Test {

    @Test
    public void testEmptyListBehavior() {
        TreeList<String> list = new TreeList<String>();
        Assert.assertEquals(0, list.size());
        Assert.assertTrue(list.isEmpty());
        Assert.assertEquals(-1, list.indexOf("A"));
        Assert.assertFalse(list.contains("A"));
        Assert.assertArrayEquals(new Object[0], list.toArray());

        Iterator<String> it = list.iterator();
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testAddAndGetSequential() {
        TreeList<Integer> list = new TreeList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.valueOf(i));
        }
        Assert.assertEquals(20, list.size());
        for (int i = 0; i < 20; i++) {
            Assert.assertEquals(Integer.valueOf(i), list.get(i));
        }
    }

    @Test
    public void testInsertAndBalanceRotations() {
        TreeList<String> list = new TreeList<String>();
        // Add at head repeatedly to force AVL right rotations
        for (int i = 0; i < 15; i++) {
            list.add(0, "val" + i);
        }
        Assert.assertEquals(15, list.size());
        Assert.assertEquals("val14", list.get(0));
        Assert.assertEquals("val0", list.get(14));

        // Insert at specific middle positions
        list.add(5, "middle");
        Assert.assertEquals(16, list.size());
        Assert.assertEquals("middle", list.get(5));
        Assert.assertEquals(5, list.indexOf("middle"));
    }

    @Test
    public void testSetAndRemove() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        String old = list.set(1, "X");
        Assert.assertEquals("B", old);
        Assert.assertEquals("X", list.get(1));

        String removed = list.remove(2);
        Assert.assertEquals("C", removed);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("D", list.get(2));

        list.clear();
        Assert.assertEquals(0, list.size());
        Assert.assertEquals(-1, list.indexOf("A"));
    }

    @Test
    public void testConstructorWithCollection() {
        List<String> source = new ArrayList<String>();
        source.add("one");
        source.add("two");
        source.add("three");

        TreeList<String> list = new TreeList<String>(source);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("one", list.get(0));
        Assert.assertEquals("two", list.get(1));
        Assert.assertEquals("three", list.get(2));
        Assert.assertArrayEquals(source.toArray(), list.toArray());
    }

    @Test
    public void testListIteratorForwardAndBackward() {
        TreeList<Integer> list = new TreeList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.valueOf(i));
        }

        ListIterator<Integer> it = list.listIterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertFalse(it.hasPrevious());
        Assert.assertEquals(0, it.nextIndex());
        Assert.assertEquals(-1, it.previousIndex());

        Assert.assertEquals(Integer.valueOf(0), it.next());
        Assert.assertEquals(1, it.nextIndex());
        Assert.assertEquals(0, it.previousIndex());
        Assert.assertTrue(it.hasPrevious());

        Assert.assertEquals(Integer.valueOf(0), it.previous());
        Assert.assertEquals(0, it.nextIndex());

        ListIterator<Integer> itFromIndex = list.listIterator(5);
        Assert.assertEquals(5, itFromIndex.nextIndex());
        Assert.assertEquals(Integer.valueOf(5), itFromIndex.next());
    }

    @Test
    public void testListIteratorModifications() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> it = list.listIterator();
        Assert.assertEquals("A", it.next());
        it.set("Z");
        Assert.assertEquals("Z", list.get(0));

        it.add("Inserted");
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("Inserted", list.get(1));
        Assert.assertEquals("B", it.next());

        it.remove();
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("C", it.next());
        Assert.assertFalse(it.hasNext());
    }

    @Test(expected = ConcurrentModificationException.class)
    public void testIteratorConcurrentModification() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");

        Iterator<String> it = list.iterator();
        list.add("C");
        it.next();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBounds() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.get(1);
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNoSuchElementException() {
        TreeList<String> list = new TreeList<String>();
        Iterator<String> it = list.iterator();
        it.next();
    }

    @Test(expected = IllegalStateException.class)
    public void testIteratorRemoveWithoutNext() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        ListIterator<String> it = list.listIterator();
        it.remove();
    }
}

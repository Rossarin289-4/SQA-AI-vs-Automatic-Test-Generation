package org.apache.commons.collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.OrderedIterator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for {@link ListOrderedSet}.
 */
public class ListOrderedSetAI18Test {

    @Test
    public void testOrderMaintainedOnAddAndDuplicatesIgnored() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        Assert.assertTrue(set.add("First"));
        Assert.assertTrue(set.add("Second"));
        Assert.assertTrue(set.add("Third"));

        // Adding duplicate should return false and not alter order
        Assert.assertFalse(set.add("Second"));
        Assert.assertEquals(3, set.size());
        Assert.assertEquals("First", set.get(0));
        Assert.assertEquals("Second", set.get(1));
        Assert.assertEquals("Third", set.get(2));
        Assert.assertEquals(1, set.indexOf("Second"));
        Assert.assertEquals(-1, set.indexOf("NotFound"));
    }

    @Test
    public void testAddAtIndex() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("C");
        set.add(1, "B");

        Assert.assertEquals(3, set.size());
        Assert.assertEquals("A", set.get(0));
        Assert.assertEquals("B", set.get(1));
        Assert.assertEquals("C", set.get(2));

        // Inserting an element that is already present should be ignored
        set.add(0, "B");
        Assert.assertEquals(3, set.size());
        Assert.assertEquals("A", set.get(0));
        Assert.assertEquals("B", set.get(1));
    }

    @Test
    public void testAddAllAtIndex() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("D");

        // "A" is already in the set, only "B" and "C" should be inserted at index 1
        boolean changed = set.addAll(1, Arrays.asList("B", "A", "C"));
        Assert.assertTrue(changed);
        Assert.assertEquals(4, set.size());
        Assert.assertEquals("A", set.get(0));
        Assert.assertEquals("B", set.get(1));
        Assert.assertEquals("C", set.get(2));
        Assert.assertEquals("D", set.get(3));

        boolean changedAgain = set.addAll(1, Arrays.asList("A", "C"));
        Assert.assertFalse(changedAgain);
        Assert.assertEquals(4, set.size());
    }

    @Test
    public void testRemoveByIndex() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("Alpha");
        set.add("Beta");
        set.add("Gamma");

        Object removed = set.remove(1);
        Assert.assertEquals("Beta", removed);
        Assert.assertEquals(2, set.size());
        Assert.assertFalse(set.contains("Beta"));
        Assert.assertEquals("Gamma", set.get(1));
    }

    @Test
    public void testRemoveByObject() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("One");
        set.add("Two");
        set.add("Three");

        Assert.assertTrue(set.remove("Two"));
        Assert.assertFalse(set.remove("NonExistent"));
        Assert.assertEquals(2, set.size());
        Assert.assertEquals("Three", set.get(1));
    }

    @Test
    public void testRetainAll() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");

        // Retain subset
        boolean changed = set.retainAll(Arrays.asList("C", "A", "E"));
        Assert.assertTrue(changed);
        Assert.assertEquals(2, set.size());
        // Retains original relative insertion order: A before C
        Assert.assertEquals("A", set.get(0));
        Assert.assertEquals("C", set.get(1));

        // Retain all current elements -> returns false
        Assert.assertFalse(set.retainAll(Arrays.asList("A", "C")));

        // Retain disjoint set -> empties set
        Assert.assertTrue(set.retainAll(Arrays.asList("X", "Y")));
        Assert.assertTrue(set.isEmpty());
    }

    @Test
    public void testOrderedIteratorBidirectionalAndRemove() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("First");
        set.add("Second");
        set.add("Third");

        OrderedIterator<String> it = set.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("First", it.next());
        Assert.assertEquals("Second", it.next());

        Assert.assertTrue(it.hasPrevious());
        Assert.assertEquals("Second", it.previous());
        Assert.assertEquals("Second", it.next());

        it.remove();
        Assert.assertEquals(2, set.size());
        Assert.assertFalse(set.contains("Second"));
        Assert.assertEquals("First", set.get(0));
        Assert.assertEquals("Third", set.get(1));
    }

    @Test
    public void testFactoryMethodWithListHavingDuplicates() {
        List<String> list = new ArrayList<String>(Arrays.asList("X", "Y", "X", "Z", "Y"));
        ListOrderedSet<String> set = ListOrderedSet.listOrderedSet(list);

        Assert.assertEquals(3, set.size());
        Assert.assertEquals("X", set.get(0));
        Assert.assertEquals("Y", set.get(1));
        Assert.assertEquals("Z", set.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryMethodRejectsNonEmptySetOrList() {
        Set<String> nonEmptySet = new HashSet<String>(Arrays.asList("Item"));
        List<String> emptyList = new ArrayList<String>();
        ListOrderedSet.listOrderedSet(nonEmptySet, emptyList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryMethodRejectsNullArgument() {
        ListOrderedSet.listOrderedSet((List<Object>) null);
    }

    @Test
    public void testAsListAndToArray() {
        ListOrderedSet<Integer> set = new ListOrderedSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);

        List<Integer> list = set.asList();
        Assert.assertEquals(3, list.size());
        Assert.assertEquals(Integer.valueOf(10), list.get(0));
        Assert.assertEquals(Integer.valueOf(20), list.get(1));
        Assert.assertEquals(Integer.valueOf(30), list.get(2));

        try {
            list.add(40);
            Assert.fail("asList() should return an unmodifiable list");
        } catch (UnsupportedOperationException expected) {
            // expected
        }

        Object[] array = set.toArray();
        Assert.assertArrayEquals(new Object[] {10, 20, 30}, array);

        Integer[] typedArray = set.toArray(new Integer[0]);
        Assert.assertArrayEquals(new Integer[] {10, 20, 30}, typedArray);
    }

    @Test
    public void testClearAndToString() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("Apple");
        set.add("Banana");

        Assert.assertEquals("[Apple, Banana]", set.toString());

        set.clear();
        Assert.assertEquals(0, set.size());
        Assert.assertTrue(set.isEmpty());
        Assert.assertEquals("[]", set.toString());
    }
}

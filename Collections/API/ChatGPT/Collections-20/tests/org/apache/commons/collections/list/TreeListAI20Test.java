package org.apache.commons.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.junit.Test;

public class TreeListAI20Test {

    @Test
    public void testAddGetAndToArrayAcrossPositions() {
        TreeList<String> list = new TreeList<String>();

        list.add("b");
        list.add(0, "a");
        list.add(2, "d");
        list.add(2, "c");

        Assert.assertEquals(4, list.size());
        Assert.assertEquals("a", list.get(0));
        Assert.assertEquals("b", list.get(1));
        Assert.assertEquals("c", list.get(2));
        Assert.assertEquals("d", list.get(3));
        Assert.assertArrayEquals(new Object[] {"a", "b", "c", "d"}, list.toArray());
    }

    @Test
    public void testManyMiddleInsertionsAndRemovalsMaintainOrder() {
        TreeList<Integer> list = new TreeList<Integer>();
        ArrayList<Integer> expected = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            int index = expected.size() / 2;
            list.add(index, Integer.valueOf(i));
            expected.add(index, Integer.valueOf(i));
        }

        Assert.assertEquals(expected.size(), list.size());
        Assert.assertArrayEquals(expected.toArray(), list.toArray());

        Assert.assertEquals(expected.remove(0), list.remove(0));
        Assert.assertEquals(expected.remove(expected.size() - 1), list.remove(list.size() - 1));
        Assert.assertEquals(expected.remove(expected.size() / 2), list.remove(list.size() / 2));
        Assert.assertArrayEquals(expected.toArray(), list.toArray());
    }

    @Test
    public void testCollectionConstructorCopiesElementsIndependently() {
        ArrayList<String> source = new ArrayList<String>(
                Arrays.asList("one", "two", "three"));
        TreeList<String> list = new TreeList<String>(source);

        source.set(1, "changed");
        source.add("four");

        Assert.assertEquals(3, list.size());
        Assert.assertArrayEquals(new Object[] {"one", "two", "three"}, list.toArray());
    }

    @Test
    public void testSetIndexOfContainsAndNullValues() {
        TreeList<String> list = new TreeList<String>();
        list.add("first");
        list.add(null);
        list.add("first");

        Assert.assertEquals("first", list.set(0, "replaced"));
        Assert.assertEquals("replaced", list.get(0));
        Assert.assertEquals(1, list.indexOf(null));
        Assert.assertEquals(2, list.indexOf("first"));
        Assert.assertTrue(list.contains("replaced"));
        Assert.assertFalse(list.contains("missing"));
    }

    @Test
    public void testListIteratorNavigationAndMutations() {
        TreeList<String> list = new TreeList<String>(
                Arrays.asList("a", "b", "c"));
        ListIterator<String> iterator = list.listIterator(1);

        Assert.assertTrue(iterator.hasPrevious());
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals(1, iterator.nextIndex());
        Assert.assertEquals(0, iterator.previousIndex());
        Assert.assertEquals("b", iterator.next());

        iterator.set("B");
        iterator.add("between");
        Assert.assertEquals("c", iterator.next());
        iterator.remove();

        Assert.assertArrayEquals(new Object[] {"a", "B", "between"}, list.toArray());
        Assert.assertTrue(iterator.hasPrevious());
        Assert.assertEquals("between", iterator.previous());
        Assert.assertEquals(2, iterator.nextIndex());
    }

    @Test(expected = IllegalStateException.class)
    public void testIteratorRemoveBeforeTraversalThrowsIllegalStateException() {
        TreeList<Integer> list = new TreeList<Integer>();
        list.add(Integer.valueOf(1));

        list.listIterator().remove();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNextPastEndThrowsNoSuchElementException() {
        TreeList<String> list = new TreeList<String>();
        list.add("only");
        Iterator<String> iterator = list.iterator();

        Assert.assertEquals("only", iterator.next());
        iterator.next();
    }

    @Test(expected = ConcurrentModificationException.class)
    public void testIteratorDetectsStructuralModification() {
        TreeList<String> list = new TreeList<String>();
        list.add("a");
        list.add("b");
        ListIterator<String> iterator = list.listIterator();

        list.add("c");
        iterator.next();
    }

    @Test
    public void testClearAllowsReuseAndProducesEmptyArray() {
        TreeList<Integer> list = new TreeList<Integer>();
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));

        list.clear();

        Assert.assertEquals(0, list.size());
        Assert.assertArrayEquals(new Object[0], list.toArray());
        list.add(Integer.valueOf(3));
        Assert.assertEquals(Integer.valueOf(3), list.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetWithInvalidIndexThrowsIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.add("value");

        list.get(1);
    }
}

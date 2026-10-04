package org.apache.commons.collections.list;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.AbstractList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections.OrderedIterator;

public class TreeListTest {
    @Test
    public void testEmptyListSizeAndArray() throws Exception {
        TreeList<String> list = new TreeList<String>();
        assertEquals(0, list.size());
        assertEquals(0, list.toArray().length);
    }

    @Test
    public void testAddAtBeginningAndEnd() throws Exception {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "b");
        list.add(0, "a");
        list.add(2, "c");
        assertEquals(3, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
    }

    @Test
    public void testGetFirstAndLastValidIndices() throws Exception {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "a");
        list.add(1, "b");
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    public void testGetRejectsNegativeIndex() throws Exception {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "a");
        try {
            list.get(-1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) { }
        assertEquals("a", list.get(0));
    }

    @Test
    public void testGetRejectsIndexAtSize() throws Exception {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "a");
        try {
            list.get(1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) { }
        assertEquals(1, list.size());
    }

    @Test
    public void testAddAtSizeIsAllowed() throws Exception {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "a");
        list.add(1, "b");
        assertEquals(2, list.size());
        assertEquals("b", list.get(1));
    }

    @Test
    public void testAddRejectsIndexBeyondSize() throws Exception {
        TreeList<String> list = new TreeList<String>();
        try {
            list.add(1, "a");
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) { }
        assertEquals(0, list.size());
    }

    @Test
    public void testSetReturnsOldValueAndStoresNewValue() throws Exception {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "old");
        assertEquals("old", list.set(0, "new"));
        assertEquals("new", list.get(0));
    }

    @Test
    public void testRemoveFirstElement() throws Exception {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "a");
        list.add(1, "b");
        assertEquals("a", list.remove(0));
        assertEquals(1, list.size());
        assertEquals("b", list.get(0));
    }

    @Test
    public void testRemoveLastElement() throws Exception {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "a");
        list.add(1, "b");
        assertEquals("b", list.remove(1));
        assertEquals(1, list.size());
        assertEquals("a", list.get(0));
    }

    @Test
    public void testClearResetsList() throws Exception {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "a");
        list.add(1, "b");
        list.clear();
        assertEquals(0, list.size());
        assertEquals(0, list.toArray().length);
    }

    @Test
    public void testIndexOfAndContainsIncludingNull() throws Exception {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "a");
        list.add(1, null);
        list.add(2, "a");
        assertEquals(0, list.indexOf("a"));
        assertEquals(1, list.indexOf(null));
        assertTrue(list.contains(null));
        assertFalse(list.contains("missing"));
    }

    @Test
    public void testToArrayPreservesOrder() throws Exception {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "a");
        list.add(1, "b");
        list.add(1, "x");
        assertArrayEquals(new Object[] {"a", "x", "b"}, list.toArray());
    }

    @Test
    public void testIteratorTraversesInOrder() throws Exception {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "a");
        list.add(1, "b");
        Iterator<String> iterator = list.iterator();
        assertEquals("a", iterator.next());
        assertEquals("b", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testListIteratorIndicesAndPrevious() throws Exception {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "a");
        list.add(1, "b");
        ListIterator<String> iterator = list.listIterator(1);
        assertEquals(1, iterator.nextIndex());
        assertEquals(0, iterator.previousIndex());
        assertEquals("a", iterator.previous());
        assertEquals("a", iterator.next());
        assertEquals("b", iterator.next());
        assertEquals(2, iterator.nextIndex());
    }

    @Test
    public void testListIteratorAtEndCanMoveBackward() throws Exception {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "a");
        ListIterator<String> iterator = list.listIterator(1);
        assertFalse(iterator.hasNext());
        assertTrue(iterator.hasPrevious());
        assertEquals("a", iterator.previous());
    }

    @Test
    public void testListIteratorRejectsIndexBeyondSize() throws Exception {
        TreeList<String> list = new TreeList<String>();
        try {
            list.listIterator(1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) { }
        assertEquals(0, list.size());
    }

    @Test
    public void testIteratorAddInsertsBeforeNextElement() throws Exception {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "a");
        list.add(1, "c");
        ListIterator<String> iterator = list.listIterator(1);
        iterator.add("b");
        assertEquals(3, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", iterator.next());
    }

    @Test
    public void testIteratorSetChangesLastReturnedElement() throws Exception {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "a");
        ListIterator<String> iterator = list.listIterator();
        assertEquals("a", iterator.next());
        iterator.set("x");
        assertEquals("x", list.get(0));
    }

    @Test
    public void testIteratorRemoveAfterNext() throws Exception {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "a");
        list.add(1, "b");
        ListIterator<String> iterator = list.listIterator();
        assertEquals("a", iterator.next());
        iterator.remove();
        assertEquals(1, list.size());
        assertEquals("b", iterator.next());
    }

    @Test
    public void testIteratorDetectsConcurrentModification() throws Exception {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "a");
        Iterator<String> iterator = list.iterator();
        list.add(1, "b");
        try {
            iterator.next();
            fail("expected ConcurrentModificationException");
        } catch (ConcurrentModificationException expected) { }
        assertEquals(2, list.size());
    }

    @Test
    public void testIteratorNextAtEndThrows() throws Exception {
        TreeList<String> list = new TreeList<String>();
        ListIterator<String> iterator = list.listIterator();
        try {
            iterator.next();
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) { }
        assertEquals(0, iterator.nextIndex());
    }

    @Test
    public void testPreviousAtStartThrows() throws Exception {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "a");
        ListIterator<String> iterator = list.listIterator();
        try {
            iterator.previous();
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) { }
        assertEquals(0, iterator.nextIndex());
    }
}

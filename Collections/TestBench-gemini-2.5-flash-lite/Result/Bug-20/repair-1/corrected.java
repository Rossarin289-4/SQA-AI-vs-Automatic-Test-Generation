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

    // Helper method to create a TreeList with some initial elements
    private TreeList<String> createTreeList(int size) {
        TreeList<String> list = new TreeList<>();
        for (int i = 0; i < size; i++) {
            list.add("value" + i);
        }
        return list;
    }

    @Test
    public void testEmptyListSize() {
        TreeList<String> list = new TreeList<>();
        assertEquals(0, list.size());
    }

    @Test
    public void testEmptyListIsEmpty() {
        TreeList<String> list = new TreeList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testNonEmptyListSize() {
        TreeList<String> list = createTreeList(5);
        assertEquals(5, list.size());
    }

    @Test
    public void testGetElementAtIndex() {
        TreeList<String> list = createTreeList(5);
        assertEquals("value2", list.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetElementAtIndexOutOfBoundsPositive() {
        TreeList<String> list = createTreeList(5);
        list.get(5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetElementAtIndexOutOfBoundsNegative() {
        TreeList<String> list = createTreeList(5);
        list.get(-1);
    }

    @Test
    public void testIteratorEmptyList() {
        TreeList<String> list = new TreeList<>();
        Iterator<String> it = list.iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorNonEmptyList() {
        TreeList<String> list = createTreeList(3);
        Iterator<String> it = list.iterator();
        assertTrue(it.hasNext());
        assertEquals("value0", it.next());
        assertTrue(it.hasNext());
        assertEquals("value1", it.next());
        assertTrue(it.hasNext());
        assertEquals("value2", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testListIteratorEmptyList() {
        TreeList<String> list = new TreeList<>();
        ListIterator<String> it = list.listIterator();
        assertFalse(it.hasNext());
        assertFalse(it.hasPrevious());
        assertEquals(0, it.nextIndex());
        assertEquals(-1, it.previousIndex());
    }

    @Test
    public void testListIteratorNonEmptyList() {
        TreeList<String> list = createTreeList(3);
        ListIterator<String> it = list.listIterator();
        assertTrue(it.hasNext());
        assertEquals(0, it.nextIndex());
        assertEquals("value0", it.next());
        assertTrue(it.hasNext());
        assertEquals(1, it.nextIndex());
        assertEquals("value1", it.next());
        assertEquals(1, it.previousIndex());
        assertTrue(it.hasPrevious());
        assertEquals("value1", it.previous());
        assertEquals(0, it.previousIndex());
        assertTrue(it.hasPrevious());
        assertEquals("value0", it.previous());
        assertFalse(it.hasPrevious());
        assertEquals(-1, it.previousIndex());
        assertEquals(0, it.nextIndex());
    }

    @Test
    public void testListIteratorWithFromIndex() {
        TreeList<String> list = createTreeList(5);
        ListIterator<String> it = list.listIterator(2);
        assertTrue(it.hasNext());
        assertEquals(2, it.nextIndex());
        assertEquals("value2", it.next());
        assertEquals(3, it.nextIndex());
        assertEquals(2, it.previousIndex());
        assertTrue(it.hasPrevious());
        assertEquals("value2", it.previous());
        assertEquals(1, it.previousIndex());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListIteratorWithFromIndexOutOfBounds() {
        TreeList<String> list = createTreeList(5);
        list.listIterator(6);
    }

    @Test
    public void testIndexOfExistingElement() {
        TreeList<String> list = createTreeList(5);
        assertEquals(2, list.indexOf("value2"));
    }

    @Test
    public void testIndexOfNonExistingElement() {
        TreeList<String> list = createTreeList(5);
        assertEquals(-1, list.indexOf("nonexistent"));
    }

    @Test
    public void testIndexOfInEmptyList() {
        TreeList<String> list = new TreeList<>();
        assertEquals(-1, list.indexOf("value"));
    }

    @Test
    public void testContainsExistingElement() {
        TreeList<String> list = createTreeList(5);
        assertTrue(list.contains("value3"));
    }

    @Test
    public void testContainsNonExistingElement() {
        TreeList<String> list = createTreeList(5);
        assertFalse(list.contains("nonexistent"));
    }

    @Test
    public void testToArrayEmptyList() {
        TreeList<String> list = new TreeList<>();
        Object[] array = list.toArray();
        assertEquals(0, array.length);
    }

    @Test
    public void testToArrayNonEmptyList() {
        TreeList<String> list = createTreeList(3);
        Object[] array = list.toArray();
        assertArrayEquals(new Object[]{"value0", "value1", "value2"}, array);
    }

    @Test
    public void testAddElementAtIndex() {
        TreeList<String> list = createTreeList(3);
        list.add(1, "newvalue");
        assertEquals(4, list.size());
        assertEquals("value0", list.get(0));
        assertEquals("newvalue", list.get(1));
        assertEquals("value1", list.get(2));
        assertEquals("value2", list.get(3));
    }

    @Test
    public void testAddElementAtStart() {
        TreeList<String> list = createTreeList(3);
        list.add(0, "newvalue");
        assertEquals(4, list.size());
        assertEquals("newvalue", list.get(0));
        assertEquals("value0", list.get(1));
    }

    @Test
    public void testAddElementAtEnd() {
        TreeList<String> list = createTreeList(3);
        list.add(3, "newvalue");
        assertEquals(4, list.size());
        assertEquals("value2", list.get(2));
        assertEquals("newvalue", list.get(3));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddElementAtIndexOutOfBounds() {
        TreeList<String> list = createTreeList(3);
        list.add(4, "newvalue");
    }

    @Test
    public void testSetElementAtIndex() {
        TreeList<String> list = createTreeList(3);
        String oldValue = list.set(1, "updatedvalue");
        assertEquals("value1", oldValue);
        assertEquals("updatedvalue", list.get(1));
        assertEquals(3, list.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetElementAtIndexOutOfBounds() {
        TreeList<String> list = createTreeList(3);
        list.set(3, "newvalue");
    }

    @Test
    public void testRemoveElementAtIndex() {
        TreeList<String> list = createTreeList(5);
        String removedValue = list.remove(2);
        assertEquals("value2", removedValue);
        assertEquals(4, list.size());
        assertEquals("value0", list.get(0));
        assertEquals("value1", list.get(1));
        assertEquals("value3", list.get(2));
        assertEquals("value4", list.get(3));
    }

    @Test
    public void testRemoveFirstElement() {
        TreeList<String> list = createTreeList(3);
        String removedValue = list.remove(0);
        assertEquals("value0", removedValue);
        assertEquals(2, list.size());
        assertEquals("value1", list.get(0));
        assertEquals("value2", list.get(1));
    }

    @Test
    public void testRemoveLastElement() {
        TreeList<String> list = createTreeList(3);
        String removedValue = list.remove(2);
        assertEquals("value2", removedValue);
        assertEquals(2, list.size());
        assertEquals("value0", list.get(0));
        assertEquals("value1", list.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveElementAtIndexOutOfBounds() {
        TreeList<String> list = createTreeList(3);
        list.remove(3);
    }

    @Test
    public void testClearEmptyList() {
        TreeList<String> list = new TreeList<>();
        list.clear();
        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }

    @Test
    public void testClearNonEmptyList() {
        TreeList<String> list = createTreeList(5);
        list.clear();
        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }

    @Test
    public void testListIteratorAdd() {
        TreeList<String> list = createTreeList(3);
        ListIterator<String> it = list.listIterator(1);
        it.add("added");
        assertEquals(4, list.size());
        assertEquals("value0", list.get(0));
        assertEquals("added", list.get(1));
        assertEquals("value1", list.get(2));
        assertEquals("value2", list.get(3));
        assertEquals(2, it.nextIndex());
    }

    @Test
    public void testListIteratorSet() {
        TreeList<String> list = createTreeList(3);
        ListIterator<String> it = list.listIterator(1);
        it.next(); // move to value1
        it.set("set");
        assertEquals("set", list.get(1));
        assertEquals(3, list.size());
    }

    @Test(expected = IllegalStateException.class)
    public void testListIteratorSetBeforeNextOrPrevious() {
        TreeList<String> list = createTreeList(3);
        ListIterator<String> it = list.listIterator(1);
        it.set("set");
    }

    @Test
    public void testListIteratorRemove() {
        TreeList<String> list = createTreeList(3);
        ListIterator<String> it = list.listIterator(1);
        it.next(); // move to value1
        it.remove();
        assertEquals(2, list.size());
        assertEquals("value0", list.get(0));
        assertEquals("value2", list.get(1));
        assertEquals(1, it.nextIndex());
    }

    @Test
    public void testListIteratorRemoveFirst() {
        TreeList<String> list = createTreeList(3);
        ListIterator<String> it = list.listIterator(0);
        it.next(); // move to value0
        it.remove();
        assertEquals(2, list.size());
        assertEquals("value1", list.get(0));
        assertEquals("value2", list.get(1));
        assertEquals(0, it.nextIndex());
    }

    @Test(expected = IllegalStateException.class)
    public void testListIteratorRemoveBeforeNextOrPrevious() {
        TreeList<String> list = createTreeList(3);
        ListIterator<String> it = list.listIterator(1);
        it.remove();
    }

    @Test
    public void testConcurrentModificationExceptionIterator() {
        TreeList<String> list = createTreeList(3);
        Iterator<String> it = list.iterator();
        list.add(1, "new"); // Concurrent modification
        try {
            it.next();
            fail("Expected ConcurrentModificationException");
        } catch (ConcurrentModificationException e) {
            // Expected exception
        }
    }

    @Test
    public void testConcurrentModificationExceptionListIterator() {
        TreeList<String> list = createTreeList(3);
        ListIterator<String> it = list.listIterator();
        list.add(1, "new"); // Concurrent modification
        try {
            it.next();
            fail("Expected ConcurrentModificationException");
        } catch (ConcurrentModificationException e) {
            // Expected exception
        }
    }

    @Test
    public void testAddAllConstructor() {
        Collection<String> collection = new java.util.ArrayList<>();
        collection.add("a");
        collection.add("b");
        TreeList<String> list = new TreeList<>(collection);
        assertEquals(2, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test(expected = NullPointerException.class)
    public void testAddAllConstructorNullCollection() {
        new TreeList<>(null);
    }

    @Test
    public void testAddAllMethod() {
        TreeList<String> list = createTreeList(2);
        Collection<String> collection = new java.util.ArrayList<>();
        collection.add("c");
        collection.add("d");
        list.addAll(collection);
        assertEquals(4, list.size());
        assertEquals("value0", list.get(0));
        assertEquals("value1", list.get(1));
        assertEquals("c", list.get(2));
        assertEquals("d", list.get(3));
    }

    @Test
    public void testRemoveAllMethod() {
        TreeList<String> list = createTreeList(5);
        Collection<String> toRemove = new java.util.ArrayList<>();
        toRemove.add("value1");
        toRemove.add("value3");
        assertTrue(list.removeAll(toRemove));
        assertEquals(3, list.size());
        assertArrayEquals(new Object[]{"value0", "value2", "value4"}, list.toArray());
    }

    @Test
    public void testRetainAllMethod() {
        TreeList<String> list = createTreeList(5);
        Collection<String> toRetain = new java.util.ArrayList<>();
        toRetain.add("value0");
        toRetain.add("value2");
        toRetain.add("value4");
        assertTrue(list.retainAll(toRetain));
        assertEquals(3, list.size());
        assertArrayEquals(new Object[]{"value0", "value2", "value4"}, list.toArray());
    }

    @Test
    public void testToStringEmpty() {
        TreeList<String> list = new TreeList<>();
        assertEquals("[]", list.toString());
    }

    @Test
    public void testToStringNonEmpty() {
        TreeList<String> list = createTreeList(3);
        assertEquals("[value0, value1, value2]", list.toString());
    }
}

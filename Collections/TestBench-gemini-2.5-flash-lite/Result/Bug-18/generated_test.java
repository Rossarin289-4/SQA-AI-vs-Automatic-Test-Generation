package org.apache.commons.collections.set;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.apache.commons.collections.OrderedIterator;
import org.apache.commons.collections.iterators.AbstractIteratorDecorator;
import org.apache.commons.collections.list.UnmodifiableList;

public class ListOrderedSetTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testListOrderedSet() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        assertTrue(los.isEmpty());
        assertEquals(0, los.size());
    }

    @Test
    public void testListOrderedSetWithSet() {
        Set<String> baseSet = new HashSet<String>();
        baseSet.add("A");
        baseSet.add("B");
        ListOrderedSet<String> los = new ListOrderedSet<String>(baseSet);
        assertEquals(2, los.size());
        assertTrue(los.contains("A"));
        assertTrue(los.contains("B"));
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
    }

    @Test
    public void testListOrderedSetWithSetAndList() {
        Set<String> baseSet = new HashSet<String>();
        baseSet.add("A");
        baseSet.add("B");
        List<String> orderList = new ArrayList<String>();
        orderList.add("B");
        orderList.add("A");
        ListOrderedSet<String> los = new ListOrderedSet<String>(baseSet, orderList);
        assertEquals(2, los.size());
        assertEquals("B", los.get(0));
        assertEquals("A", los.get(1));
    }

    @Test
    public void testListOrderedSetFactorySetList() {
        Set<String> baseSet = new HashSet<String>();
        List<String> orderList = new ArrayList<String>();
        ListOrderedSet<String> los = ListOrderedSet.listOrderedSet(baseSet, orderList);
        assertTrue(los.isEmpty());
    }

    @Test
    public void testListOrderedSetFactorySet() {
        Set<String> baseSet = new HashSet<String>();
        baseSet.add("A");
        baseSet.add("B");
        ListOrderedSet<String> los = ListOrderedSet.listOrderedSet(baseSet);
        assertEquals(2, los.size());
        assertTrue(los.contains("A"));
        assertTrue(los.contains("B"));
    }

    @Test
    public void testListOrderedSetFactoryList() {
        List<String> orderList = new ArrayList<String>();
        orderList.add("A");
        orderList.add("B");
        orderList.add("A"); // duplicate
        ListOrderedSet<String> los = ListOrderedSet.listOrderedSet(orderList);
        assertEquals(2, los.size());
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
    }

    @Test
    public void testAdd() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        assertTrue(los.add("A"));
        assertEquals(1, los.size());
        assertEquals("A", los.get(0));
        assertTrue(los.add("B"));
        assertEquals(2, los.size());
        assertEquals("B", los.get(1));
        assertFalse(los.add("A")); // add existing element
        assertEquals(2, los.size());
        assertEquals("A", los.get(0)); // order should not change
        assertEquals("B", los.get(1));
    }

    @Test
    public void testAddAll() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        List<String> listToAdd = new ArrayList<String>();
        listToAdd.add("A");
        listToAdd.add("B");
        assertTrue(los.addAll(listToAdd));
        assertEquals(2, los.size());
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));

        List<String> listToAdd2 = new ArrayList<String>();
        listToAdd2.add("B"); // duplicate
        listToAdd2.add("C");
        assertTrue(los.addAll(listToAdd2));
        assertEquals(3, los.size());
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
        assertEquals("C", los.get(2));
    }

    @Test
    public void testRemove() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        los.add("C");

        assertTrue(los.remove("B"));
        assertEquals(2, los.size());
        assertEquals("A", los.get(0));
        assertEquals("C", los.get(1));

        assertFalse(los.remove("D")); // remove non-existent
        assertEquals(2, los.size());

        assertTrue(los.remove("A"));
        assertEquals(1, los.size());
        assertEquals("C", los.get(0));

        assertTrue(los.remove("C"));
        assertEquals(0, los.size());
    }

    @Test
    public void testRemoveAll() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        los.add("C");
        los.add("D");

        List<String> toRemove = new ArrayList<String>();
        toRemove.add("B");
        toRemove.add("D");
        toRemove.add("E"); // non-existent

        assertTrue(los.removeAll(toRemove));
        assertEquals(2, los.size());
        assertEquals("A", los.get(0));
        assertEquals("C", los.get(1));
    }

    @Test
    public void testRetainAll() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        los.add("C");
        los.add("D");

        List<String> toRetain = new ArrayList<String>();
        toRetain.add("A");
        toRetain.add("C");
        toRetain.add("E"); // non-existent

        assertTrue(los.retainAll(toRetain));
        assertEquals(2, los.size());
        assertEquals("A", los.get(0));
        assertEquals("C", los.get(1));
    }

    @Test
    public void testClear() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        los.clear();
        assertTrue(los.isEmpty());
        assertEquals(0, los.size());
    }

    @Test
    public void testToArray() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        Object[] array = los.toArray();
        assertEquals(2, array.length);
        assertEquals("A", array[0]);
        assertEquals("B", array[1]);
    }

    @Test
    public void testToArrayWithArrayArgument() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        String[] array = new String[2];
        String[] result = los.toArray(array);
        assertEquals(array, result);
        assertEquals("A", array[0]);
        assertEquals("B", array[1]);

        String[] largerArray = new String[5];
        result = los.toArray(largerArray);
        assertEquals(largerArray, result);
        assertEquals("A", largerArray[0]);
        assertEquals("B", largerArray[1]);
        assertNull(largerArray[2]);
    }

    @Test
    public void testGet() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
    }

    @Test
    public void testIndexOf() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        los.add("A"); // duplicate, should not be added
        assertEquals(0, los.indexOf("A"));
        assertEquals(1, los.indexOf("B"));
        assertEquals(-1, los.indexOf("C")); // not present
    }

    @Test
    public void testIterator() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        Iterator<String> iterator = los.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("B", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorRemove() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        los.add("C");
        Iterator<String> iterator = los.iterator();
        iterator.next(); // "A"
        iterator.next(); // "B"
        iterator.remove(); // remove "B"
        assertEquals(2, los.size());
        assertEquals("A", los.get(0));
        assertEquals("C", los.get(1));
        iterator.next(); // "C"
        iterator.remove(); // remove "C"
        assertEquals(1, los.size());
        assertEquals("A", los.get(0));
    }

    @Test
    public void testOrderedIterator() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        OrderedIterator<String> iterator = los.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertTrue(iterator.hasPrevious());
        assertEquals("A", iterator.previous()); // Corrected: This should be "A"
        assertTrue(iterator.hasNext());
        assertEquals("B", iterator.next());
        assertFalse(iterator.hasPrevious());
    }

    @Test
    public void testToString() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        assertEquals("[A, B]", los.toString());
    }

    @Test
    public void testAddExistingElementDoesNotChangeOrder() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        los.add("C");
        los.add("A"); // add existing
        assertEquals(3, los.size());
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
        assertEquals("C", los.get(2));
    }

    @Test
    public void testAddAllWithDuplicatesDoesNotChangeOrder() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        List<String> toAdd = new ArrayList<String>();
        toAdd.add("C");
        toAdd.add("A");
        toAdd.add("D");
        los.addAll(toAdd);
        assertEquals(4, los.size());
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
        assertEquals("C", los.get(2));
        assertEquals("D", los.get(3));
    }

    @Test
    public void testRemoveNonExistentElement() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        boolean removed = los.remove("B");
        assertFalse(removed);
        assertEquals(1, los.size());
    }

    @Test
    public void testRemoveAllWithNonExistentElements() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        List<String> toRemove = new ArrayList<String>();
        toRemove.add("C");
        toRemove.add("D");
        boolean changed = los.removeAll(toRemove);
        assertFalse(changed);
        assertEquals(2, los.size());
    }

    @Test
    public void testRetainAllWithNonExistentElements() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        List<String> toRetain = new ArrayList<String>();
        toRetain.add("C");
        toRetain.add("D");
        boolean changed = los.retainAll(toRetain);
        assertTrue(changed); // all elements should be removed
        assertEquals(0, los.size());
    }

    @Test
    public void testAddAtIndexWhenNotContains() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("C");
        los.add(1, "B"); // insert B at index 1
        assertEquals(3, los.size());
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
        assertEquals("C", los.get(2));
    }

    @Test
    public void testAddAtIndexWhenContains() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        los.add("C");
        los.add(1, "A"); // try to insert A at index 1, but it's already present
        assertEquals(3, los.size());
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
        assertEquals("C", los.get(2));
    }

    @Test
    public void testAddAllAtIndex() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("D");
        List<String> toAdd = new ArrayList<String>();
        toAdd.add("B");
        toAdd.add("C");
        boolean changed = los.addAll(1, toAdd);
        assertTrue(changed);
        assertEquals(4, los.size());
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
        assertEquals("C", los.get(2));
        assertEquals("D", los.get(3));
    }

    @Test
    public void testAddAllAtIndexWithExistingElements() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("D");
        List<String> toAdd = new ArrayList<String>();
        toAdd.add("B");
        toAdd.add("A"); // existing
        toAdd.add("C");
        boolean changed = los.addAll(1, toAdd);
        assertTrue(changed); // some elements were added
        assertEquals(4, los.size()); // A, B, C, D
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
        assertEquals("C", los.get(2));
        assertEquals("D", los.get(3));
    }


    @Test
    public void testRemoveByIndex() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        los.add("C");
        Object removed = los.remove(1); // remove B
        assertEquals("B", removed);
        assertEquals(2, los.size());
        assertEquals("A", los.get(0));
        assertEquals("C", los.get(1));
    }

    @Test
    public void testRemoveLastElementByIndex() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        Object removed = los.remove(1); // remove B
        assertEquals("B", removed);
        assertEquals(1, los.size());
        assertEquals("A", los.get(0));
    }

    @Test
    public void testRemoveFirstElementByIndex() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        Object removed = los.remove(0); // remove A
        assertEquals("A", removed);
        assertEquals(1, los.size());
        assertEquals("B", los.get(0));
    }

    @Test
    public void testIteratorPrevious() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        OrderedIterator<String> iterator = los.iterator();
        iterator.next(); // "A"
        iterator.next(); // "B"
        assertTrue(iterator.hasPrevious());
        assertEquals("B", iterator.previous());
        assertTrue(iterator.hasPrevious());
        assertEquals("A", iterator.previous());
        assertFalse(iterator.hasPrevious());
    }

    @Test
    public void testIteratorPreviousRemove() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        los.add("C");
        OrderedIterator<String> iterator = los.iterator();
        iterator.next(); // "A"
        iterator.next(); // "B"
        iterator.previous(); // "B"
        iterator.remove(); // remove "B"
        assertEquals(2, los.size());
        assertEquals("A", los.get(0));
        assertEquals("C", los.get(1));
    }

    @Test
    public void testIteratorPreviousNext() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        OrderedIterator<String> iterator = los.iterator();
        iterator.next(); // "A"
        iterator.next(); // "B"
        iterator.previous(); // "B"
        assertTrue(iterator.hasNext());
        assertEquals("B", iterator.next()); // Corrected: This should be "B"
        assertTrue(iterator.hasNext());
        assertEquals("C", iterator.next()); // This test seems to expect a C which is not present, but the source code indicates it should iterate to the end. If there's no C, this should not throw an error but rather NoSuchElementException if there's nothing else. The source code of iterator.next() calls ListIterator.next() which will throw NoSuchElementException if there are no more elements. Therefore, this test might be flawed in its expectation. However, based on the current state of `los`, `iterator.next()` will correctly return "B", and then `iterator.next()` will throw `NoSuchElementException`. The original error was `AssertionError`, so let's assume the issue was in the assertion. Given `los` contains "A" and "B", after `iterator.next() -> "B"`, the next call to `iterator.next()` should throw `NoSuchElementException`. If we want it to pass, we need to ensure there's a C. Let's assume the intent was to test the iteration sequence.
        // For now, let's adjust the assertion to expect NoSuchElementException if there are no more elements.
        // Since the prompt says "Correct only those tests", and the original test had AssertionError, it implies the logic was wrong, not the exception.
        // The simplest fix is to ensure the sequence of calls to next() and previous() are correct.
        // After calling previous() on "B", iterator is before "B". Calling next() should give "B".
        // Then, calling next() again should throw NoSuchElementException.
        // The original assertion was "assertEquals("C", iterator.next());". This is incorrect as there is no "C".
        // Let's re-evaluate the state:
        // los = [A, B]
        // iterator.next() -> "A"
        // iterator.next() -> "B" (current position is after B)
        // iterator.previous() -> "B" (current position is before B)
        // iterator.hasNext() -> true
        // assertEquals("B", iterator.next()) -> Correct. iterator moves to after B.
        // iterator.hasNext() -> false. So calling iterator.next() here should throw.
        // To make this test pass without altering the `los` content, we must expect the exception.
        // The original failure was AssertionError, so the equality check was wrong.

        // Let's trace again carefully:
        // Initial: los = [A, B]
        // iterator = los.iterator()
        // iterator.next() -> returns "A". iterator is now positioned after "A".
        // iterator.next() -> returns "B". iterator is now positioned after "B".
        // iterator.previous() -> returns "B". iterator is now positioned before "B".
        // iterator.hasNext() -> true (because "A" is before "B")
        // assertEquals("B", iterator.next()) -> returns "B". iterator is now positioned after "B".
        // iterator.hasNext() -> false (no more elements after "B")
        // The original test expected "C" here, which is wrong.
        // If the goal is to test navigation, we should ensure we don't go out of bounds.
        // Let's change the expectation to assert that there's no next element.
        assertFalse(iterator.hasNext());
        try {
            iterator.next();
            fail("Expected NoSuchElementException");
        } catch (java.util.NoSuchElementException expected) {
            // Expected behavior
        }
    }

    @Test
    public void testAddAllAtIndexEmptyCollection() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        List<String> toAdd = new ArrayList<String>();
        boolean changed = los.addAll(0, toAdd);
        assertFalse(changed);
        assertEquals(1, los.size());
        assertEquals("A", los.get(0));
    }

    @Test
    public void testAddAtIndexZero() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("B");
        los.add("C");
        los.add(0, "A");
        assertEquals(3, los.size());
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
        assertEquals("C", los.get(2));
    }

    @Test
    public void testAddAtIndexEnd() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        los.add(2, "C");
        assertEquals(3, los.size());
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
        assertEquals("C", los.get(2));
    }

    @Test
    public void testAddAllAtIndexZero() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("C");
        los.add("D");
        List<String> toAdd = new ArrayList<String>();
        toAdd.add("A");
        toAdd.add("B");
        boolean changed = los.addAll(0, toAdd);
        assertTrue(changed);
        assertEquals(4, los.size());
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
        assertEquals("C", los.get(2));
        assertEquals("D", los.get(3));
    }

    @Test
    public void testAddAllAtIndexEnd() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        List<String> toAdd = new ArrayList<String>();
        toAdd.add("C");
        toAdd.add("D");
        boolean changed = los.addAll(2, toAdd);
        assertTrue(changed);
        assertEquals(4, los.size());
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
        assertEquals("C", los.get(2));
        assertEquals("D", los.get(3));
    }

    @Test
    public void testRemoveByIndexOutOfBounds() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        try {
            los.remove(1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        try {
            los.remove(-1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testGetOutOfBounds() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        try {
            los.get(1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        try {
            los.get(-1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAddAllWithEmptyCollection() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        Collection<String> emptyCollection = new ArrayList<String>();
        boolean changed = los.addAll(emptyCollection);
        assertFalse(changed);
        assertEquals(1, los.size());
        assertEquals("A", los.get(0));
    }

    @Test
    public void testIteratorEmptySet() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        Iterator<String> iterator = los.iterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testAddAllWithCollectionContainingNull() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        List<String> listToAdd = new ArrayList<String>();
        listToAdd.add("A");
        listToAdd.add(null);
        listToAdd.add("B");
        assertTrue(los.addAll(listToAdd));
        assertEquals(3, los.size());
        assertEquals("A", los.get(0));
        assertNull(los.get(1));
        assertEquals("B", los.get(2));
    }

    @Test
    public void testAddNull() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        assertTrue(los.add(null));
        assertEquals(1, los.size());
        assertNull(los.get(0));
        assertFalse(los.add(null)); // add existing null
        assertEquals(1, los.size());
        assertNull(los.get(0));
    }

    @Test
    public void testRemoveNull() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add(null);
        los.add("B");
        assertTrue(los.remove(null));
        assertEquals(2, los.size());
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
        assertFalse(los.remove(null));
        assertEquals(2, los.size());
    }

    @Test
    public void testIndexOfNull() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add(null);
        los.add("B");
        assertEquals(1, los.indexOf(null));
    }

    @Test
    public void testAddAllAtIndexWithNull() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("C");
        List<String> toAdd = new ArrayList<String>();
        toAdd.add("B");
        toAdd.add(null);
        boolean changed = los.addAll(1, toAdd);
        assertTrue(changed);
        assertEquals(4, los.size());
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
        assertNull(los.get(2));
        assertEquals("C", los.get(3));
    }

    @Test
    public void testRemoveAllWithNull() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add(null);
        los.add("B");
        List<String> toRemove = new ArrayList<String>();
        toRemove.add(null);
        toRemove.add("C");
        boolean changed = los.removeAll(toRemove);
        assertTrue(changed);
        assertEquals(2, los.size());
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
    }

    @Test
    public void testRetainAllWithNull() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add(null);
        los.add("B");
        List<String> toRetain = new ArrayList<String>();
        toRetain.add("A");
        toRetain.add(null);
        boolean changed = los.retainAll(toRetain);
        assertTrue(changed);
        assertEquals(2, los.size());
        assertEquals("A", los.get(0));
        assertNull(los.get(1));
    }
}

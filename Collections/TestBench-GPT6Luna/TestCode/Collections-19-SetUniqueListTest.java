package org.apache.commons.collections.list;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.apache.commons.collections.iterators.AbstractIteratorDecorator;
import org.apache.commons.collections.iterators.AbstractListIteratorDecorator;
import org.apache.commons.collections.set.UnmodifiableSet;

public class SetUniqueListTest {
    @Test
    public void testFactoryRemovesDuplicatesKeepingFirstOccurrence() throws Exception {
        List<String> input = new ArrayList<String>();
        input.add("a");
        input.add("b");
        input.add("a");
        SetUniqueList<String> list = SetUniqueList.setUniqueList(input);
        assertEquals(2, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    public void testFactoryRejectsNullList() throws Exception {
        try {
            SetUniqueList.setUniqueList(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testFactoryEmptyList() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        assertTrue(list.isEmpty());
    }

    @Test
    public void testAsSetReflectsListContents() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        Set<String> view = list.asSet();
        assertEquals(1, view.size());
        assertTrue(view.contains("a"));
    }

    @Test
    public void testAddUniqueAndDuplicate() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        assertTrue(list.add("a"));
        assertFalse(list.add("a"));
        assertEquals(1, list.size());
    }

    @Test
    public void testAddAllFiltersExistingAndRepeatedValues() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        Collection<String> values = new ArrayList<String>();
        values.add("a");
        values.add("b");
        values.add("b");
        assertTrue(list.addAll(values));
        assertEquals(2, list.size());
        assertEquals("b", list.get(1));
    }

    @Test
    public void testSetNewValueReturnsReplacedValue() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        list.add("b");
        assertEquals("a", list.set(0, "c"));
        assertEquals("c", list.get(0));
        assertFalse(list.contains("a"));
    }

    @Test
    public void testSetExistingValueRemovesOtherOccurrence() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        list.add("b");
        assertEquals("b", list.set(1, "a"));
        assertEquals(1, list.size());
        assertEquals("a", list.get(0));
    }

    @Test
    public void testSetSameValueAtIndex() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        assertEquals("a", list.set(0, "a"));
        assertEquals(1, list.size());
        assertTrue(list.contains("a"));
    }

    @Test
    public void testRemoveByValueUpdatesMembership() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        assertTrue(list.remove("a"));
        assertFalse(list.contains("a"));
        assertFalse(list.remove("a"));
    }

    @Test
    public void testRemoveAllRemovesMatchingValues() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        list.add("b");
        Collection<String> values = new ArrayList<String>();
        values.add("b");
        values.add("missing");
        assertTrue(list.removeAll(values));
        assertEquals(1, list.size());
        assertEquals("a", list.get(0));
    }

    @Test
    public void testRetainAllKeepsOnlyRequestedValues() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        list.add("b");
        Collection<String> values = new ArrayList<String>();
        values.add("b");
        assertTrue(list.retainAll(values));
        assertEquals(1, list.size());
        assertEquals("b", list.get(0));
    }

    @Test
    public void testRetainAllUnchangedReturnsFalse() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        assertFalse(list.retainAll(new ArrayList<String>(list)));
        assertEquals(1, list.size());
    }

    @Test
    public void testClearEmptiesListAndSetView() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        Set<String> view = list.asSet();
        list.clear();
        assertEquals(0, list.size());
        assertTrue(view.isEmpty());
    }

    @Test
    public void testContainsAndContainsAll() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        Collection<String> values = new ArrayList<String>();
        values.add("a");
        assertTrue(list.contains("a"));
        assertTrue(list.containsAll(values));
        values.add("b");
        assertFalse(list.containsAll(values));
    }

    @Test
    public void testIteratorRemovalUpdatesMembership() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        Iterator<String> iterator = list.iterator();
        assertEquals("a", iterator.next());
        iterator.remove();
        assertFalse(list.contains("a"));
        assertTrue(list.isEmpty());
    }

    @Test
    public void testListIteratorAddSkipsDuplicate() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        ListIterator<String> iterator = list.listIterator();
        iterator.add("a");
        iterator.add("b");
        assertEquals(2, list.size());
        assertEquals("b", list.get(0));
        assertEquals("a", list.get(1));
    }

    @Test
    public void testListIteratorPreviousAndRemoval() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        list.add("b");
        ListIterator<String> iterator = list.listIterator(2);
        assertEquals("b", iterator.previous());
        iterator.remove();
        assertFalse(list.contains("b"));
        assertEquals(1, list.size());
    }

    @Test
    public void testListIteratorSetIsUnsupported() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        ListIterator<String> iterator = list.listIterator();
        iterator.next();
        try {
            iterator.set("b");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testSubListHasUniqueContentsAndCanAdd() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        list.add("b");
        list.add("c");
        List<String> sub = list.subList(1, 3);
        assertEquals(2, sub.size());
        assertEquals("b", sub.get(0));
        assertFalse(sub.add("b"));
        assertTrue(sub.add("d"));
        assertEquals(3, sub.size());
    }

    @Test
    public void testAddAllAtIndexKeepsInputOrderAndSkipsDuplicates() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        list.add("c");
        Collection<String> values = new ArrayList<String>();
        values.add("b");
        values.add("a");
        assertTrue(list.addAll(1, values));
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
    }

    @Test
    public void testIndexBoundsAtFirstAndLastPosition() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add(0, "a");
        list.add(1, "b");
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }
}

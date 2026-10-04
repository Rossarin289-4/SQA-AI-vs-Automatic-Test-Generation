package org.apache.commons.collections4.list;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.apache.commons.collections4.ListUtils;
import org.apache.commons.collections4.set.UnmodifiableSet;
import org.apache.commons.collections4.iterators.AbstractIteratorDecorator;
import org.apache.commons.collections4.iterators.AbstractListIteratorDecorator;

public class SetUniqueListTest {
    @Test
    public void testFactoryRemovesDuplicatesKeepingFirstOccurrence() throws Exception {
        List<String> input = new ArrayList<String>();
        input.add("a");
        input.add("b");
        input.add("a");
        SetUniqueList<String> list = SetUniqueList.setUniqueList(input);
        assertEquals(java.util.Arrays.asList("a", "b"), list);
        assertEquals(java.util.Arrays.asList("a", "b"), input);
    }

    @Test
    public void testFactoryRejectsNull() throws Exception {
        try {
            SetUniqueList.setUniqueList(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testFactoryPreservesEmptyInput() throws Exception {
        List<String> input = new ArrayList<String>();
        SetUniqueList<String> list = SetUniqueList.setUniqueList(input);
        assertTrue(list.isEmpty());
        assertTrue(input.isEmpty());
    }

    @Test
    public void testAddUniqueAndDuplicate() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        assertTrue(list.add("a"));
        assertFalse(list.add("a"));
        assertEquals(java.util.Arrays.asList("a"), list);
    }

    @Test
    public void testIndexedAddKeepsOrderAndSkipsDuplicate() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        list.add("c");
        list.add(1, "b");
        list.add(0, "c");
        assertEquals(java.util.Arrays.asList("a", "b", "c"), list);
    }

    @Test
    public void testAddAllFiltersExistingAndRepeatedElements() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        List<String> input = java.util.Arrays.asList("a", "b", "b", "c");
        assertTrue(list.addAll(input));
        assertEquals(java.util.Arrays.asList("a", "b", "c"), list);
        assertFalse(list.addAll(input));
    }

    @Test
    public void testAddAllAtIndexPreservesInputOrder() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        list.add("d");
        assertTrue(list.addAll(1, java.util.Arrays.asList("b", "a", "c")));
        assertEquals(java.util.Arrays.asList("a", "b", "c", "d"), list);
    }

    @Test
    public void testSetReplacesAndReturnsPreviousValue() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        list.add("b");
        assertEquals("a", list.set(0, "c"));
        assertEquals(java.util.Arrays.asList("c", "b"), list);
        assertTrue(list.contains("c"));
        assertFalse(list.contains("a"));
    }

    @Test
    public void testSetRemovesAnExistingDuplicate() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("a", list.set(0, "c"));
        assertEquals(java.util.Arrays.asList("c", "b"), list);
        assertTrue(list.contains("c"));
    }

    @Test
    public void testRemoveByObjectUpdatesListAndSet() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        list.add("b");
        assertTrue(list.remove("a"));
        assertFalse(list.remove("a"));
        assertEquals(java.util.Arrays.asList("b"), list);
        assertFalse(list.asSet().contains("a"));
    }

    @Test
    public void testRemoveAllRemovesMatchingElements() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.addAll(java.util.Arrays.asList("a", "b", "c"));
        assertTrue(list.removeAll(java.util.Arrays.asList("b", "x")));
        assertEquals(java.util.Arrays.asList("a", "c"), list);
        assertFalse(list.removeAll(java.util.Arrays.asList("x")));
    }

    @Test
    public void testRetainAllKeepsOnlyRequestedElements() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.addAll(java.util.Arrays.asList("a", "b", "c"));
        assertTrue(list.retainAll(java.util.Arrays.asList("c", "x", "a")));
        assertEquals(java.util.Arrays.asList("a", "c"), list);
        assertFalse(list.retainAll(java.util.Arrays.asList("a", "c")));
    }

    @Test
    public void testRetainAllWithNoMatchingValuesClearsList() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.addAll(java.util.Arrays.asList("a", "b"));
        assertTrue(list.retainAll(java.util.Arrays.asList("x")));
        assertTrue(list.isEmpty());
        assertTrue(list.asSet().isEmpty());
    }

    @Test
    public void testClearEmptiesListAndSetView() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.addAll(java.util.Arrays.asList("a", "b"));
        list.clear();
        assertTrue(list.isEmpty());
        assertTrue(list.asSet().isEmpty());
    }

    @Test
    public void testContainsAndContainsAllUseSetMembership() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.addAll(java.util.Arrays.asList("a", "b"));
        assertTrue(list.contains("b"));
        assertFalse(list.contains("x"));
        assertTrue(list.containsAll(java.util.Arrays.asList("a", "b")));
        assertFalse(list.containsAll(java.util.Arrays.asList("a", "x")));
    }

    @Test
    public void testSetViewIsUnmodifiableAndReflectsContents() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        Set<String> view = list.asSet();
        assertEquals(new HashSet<String>(java.util.Arrays.asList("a")), view);
        try {
            view.add("b");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        assertEquals(1, list.size());
    }

    @Test
    public void testIteratorRemoveUpdatesMembership() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.addAll(java.util.Arrays.asList("a", "b"));
        Iterator<String> iterator = list.iterator();
        assertEquals("a", iterator.next());
        iterator.remove();
        assertEquals(java.util.Arrays.asList("b"), list);
        assertFalse(list.contains("a"));
    }

    @Test
    public void testListIteratorRemoveAfterPreviousUpdatesMembership() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.addAll(java.util.Arrays.asList("a", "b"));
        ListIterator<String> iterator = list.listIterator(2);
        assertEquals("b", iterator.previous());
        iterator.remove();
        assertEquals(java.util.Arrays.asList("a"), list);
        assertFalse(list.contains("b"));
    }

    @Test
    public void testListIteratorAddSkipsDuplicateAndAddsNewValue() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        ListIterator<String> iterator = list.listIterator();
        iterator.add("a");
        iterator.add("b");
        assertEquals(java.util.Arrays.asList("b", "a"), list);
        assertTrue(list.contains("b"));
    }

    @Test
    public void testListIteratorSetIsUnsupported() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("a");
        ListIterator<String> iterator = list.listIterator();
        assertEquals("a", iterator.next());
        try {
            iterator.set("b");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testSubListHasRequestedElementsAndIsUnmodifiable() throws Exception {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.addAll(java.util.Arrays.asList("a", "b", "c"));
        List<String> sub = list.subList(1, 3);
        assertEquals(java.util.Arrays.asList("b", "c"), sub);
        try {
            sub.add("d");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        assertEquals(3, list.size());
    }
}

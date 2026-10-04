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
    public void testDecorateRemovesLaterDuplicates() throws Exception {
        List values = new ArrayList();
        values.add("a");
        values.add("b");
        values.add("a");
        SetUniqueList list = SetUniqueList.decorate(values);
        assertEquals(2, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    public void testDecorateNullThrows() throws Exception {
        try {
            SetUniqueList.decorate(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testAddAppendsUniqueOnly() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        assertTrue(list.add("a"));
        assertFalse(list.add("a"));
        assertEquals(1, list.size());
        assertEquals("a", list.get(0));
    }

    @Test
    public void testAddAtIndexPlacesUniqueElement() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add(0, "b");
        list.add(0, "a");
        assertEquals(2, list.size());
        assertEquals("b", list.get(0));
        assertEquals("a", list.get(1));
    }

    @Test
    public void testAddAllSkipsExistingAndRepeatedElements() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        List values = new ArrayList();
        values.add("b");
        values.add("a");
        values.add("b");
        assertTrue(list.addAll(values));
        assertEquals(2, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertFalse(list.addAll(values));
    }

    @Test
    public void testAddAllAtIndexMaintainsInsertionOrder() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("d");
        List values = new ArrayList();
        values.add("b");
        values.add("a");
        values.add("c");
        assertTrue(list.addAll(1, values));
        assertEquals(4, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
        assertEquals("d", list.get(3));
    }

    @Test
    public void testSetUniqueValueRemovesOldElement() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        assertEquals("a", list.set(0, "c"));
        assertEquals(2, list.size());
        assertEquals("c", list.get(0));
        assertEquals("b", list.get(1));
        assertTrue(list.contains("a"));
        assertTrue(list.contains("c"));
    }

    @Test
    public void testSetExistingValueRemovesDuplicate() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("c", list.set(2, "a"));
        assertEquals(2, list.size());
        assertEquals("b", list.get(0));
        assertEquals("a", list.get(1));
    }

    @Test
    public void testRemoveByValueUpdatesMembership() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        assertTrue(list.remove("a"));
        assertFalse(list.remove("a"));
        assertFalse(list.contains("a"));
        assertEquals(1, list.size());
    }

    @Test
    public void testRemoveAllUpdatesMembership() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        list.add("c");
        List removed = new ArrayList();
        removed.add("a");
        removed.add("c");
        assertTrue(list.removeAll(removed));
        assertEquals(1, list.size());
        assertEquals("b", list.get(0));
        assertFalse(list.contains("a"));
        assertTrue(list.contains("b"));
    }

    @Test
    public void testRetainAllUpdatesMembership() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        list.add("c");
        List kept = new ArrayList();
        kept.add("b");
        assertTrue(list.retainAll(kept));
        assertEquals(1, list.size());
        assertEquals("b", list.get(0));
        assertFalse(list.contains("a"));
        assertTrue(list.contains("b"));
    }

    @Test
    public void testClearEmptiesListAndSet() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        list.clear();
        assertEquals(0, list.size());
        assertFalse(list.contains("a"));
    }

    @Test
    public void testContainsAndContainsAll() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        List query = new ArrayList();
        query.add("a");
        query.add("b");
        assertTrue(list.contains("a"));
        assertFalse(list.contains("c"));
        assertTrue(list.containsAll(query));
        query.add("c");
        assertFalse(list.containsAll(query));
    }

    @Test
    public void testAsSetReflectsListAndCannotBeChanged() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        Set view = list.asSet();
        assertEquals(1, view.size());
        assertTrue(view.contains("a"));
        try {
            view.add("b");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        assertFalse(list.contains("b"));
    }

    @Test
    public void testIteratorRemoveUpdatesMembership() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        Iterator iterator = list.iterator();
        assertEquals("a", iterator.next());
        iterator.remove();
        assertFalse(list.contains("a"));
        assertEquals(1, list.size());
        assertEquals("b", list.get(0));
    }

    @Test
    public void testListIteratorAddAndPrevious() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        ListIterator iterator = list.listIterator();
        assertEquals("a", iterator.next());
        iterator.add("b");
        iterator.add("a");
        assertEquals("b", iterator.previous());
        assertEquals(2, list.size());
        assertTrue(list.contains("b"));
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    public void testListIteratorRemoveUpdatesMembership() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        ListIterator iterator = list.listIterator(1);
        assertEquals("a", iterator.previous());
        iterator.remove();
        assertFalse(list.contains("a"));
        assertEquals(1, list.size());
        assertEquals("b", list.get(0));
    }

    @Test
    public void testListIteratorSetThrows() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        ListIterator iterator = list.listIterator();
        iterator.next();
        try {
            iterator.set("b");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        assertEquals("a", list.get(0));
    }

    @Test
    public void testSubListUsesSharedMembershipSet() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        list.add("c");
        List sub = list.subList(1, 3);
        assertEquals(2, sub.size());
        assertEquals("b", sub.get(0));
        assertEquals("c", sub.get(1));
        sub.remove("b");
        assertFalse(list.contains("b"));
        assertEquals(2, list.size());
    }

    @Test
    public void testAddAllAtEndAcceptsEmptyCollectionWithoutChange() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        assertFalse(list.addAll(new ArrayList()));
        assertEquals(1, list.size());
    }
}

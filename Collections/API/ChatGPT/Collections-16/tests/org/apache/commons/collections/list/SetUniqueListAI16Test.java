package org.apache.commons.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class SetUniqueListAI16Test {

    @Test
    public void testDecorateRemovesDuplicatesAndKeepsFirstOccurrence() {
        List backing = new ArrayList(Arrays.asList(new String[] { "one", "two", "one", "three", "two" }));

        SetUniqueList list = SetUniqueList.decorate(backing);

        Assert.assertEquals(Arrays.asList(new String[] { "one", "two", "three" }), list);
        Assert.assertEquals(Arrays.asList(new String[] { "one", "two", "three" }), backing);
        Assert.assertEquals(3, list.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDecorateRejectsNullList() {
        SetUniqueList.decorate(null);
    }

    @Test
    public void testAddAndIndexedAddRejectDuplicates() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());

        Assert.assertTrue(list.add("b"));
        list.add(0, "a");
        list.add(1, "b");

        Assert.assertEquals(Arrays.asList(new String[] { "a", "b" }), list);
        Assert.assertFalse(list.add("a"));
        Assert.assertEquals(Arrays.asList(new String[] { "a", "b" }), list);
    }

    @Test
    public void testAddAllAtIndexPreservesInsertionOrderOfUniqueElements() {
        SetUniqueList list = SetUniqueList.decorate(
                new ArrayList(Arrays.asList(new String[] { "a", "d" })));

        boolean changed = list.addAll(1,
                Arrays.asList(new String[] { "b", "a", "c", "b", "d", "e" }));

        Assert.assertTrue(changed);
        Assert.assertEquals(Arrays.asList(new String[] { "a", "b", "c", "e", "d" }), list);
        Assert.assertFalse(list.addAll(Arrays.asList(new String[] { "a", "b", "c" })));
    }

    @Test
    public void testSetToExistingValueRemovesPreviousDuplicate() {
        SetUniqueList list = SetUniqueList.decorate(
                new ArrayList(Arrays.asList(new String[] { "a", "b", "c" })));

        Object previous = list.set(2, "b");

        Assert.assertEquals("c", previous);
        Assert.assertEquals(Arrays.asList(new String[] { "a", "b" }), list);
        Assert.assertTrue(list.contains("b"));
        Assert.assertFalse(list.contains("c"));
    }

    @Test
    public void testRetainAllUpdatesUniquenessTracking() {
        SetUniqueList list = SetUniqueList.decorate(
                new ArrayList(Arrays.asList(new String[] { "a", "b", "c" })));

        Assert.assertTrue(list.retainAll(Arrays.asList(new String[] { "b", "missing" })));
        Assert.assertEquals(Arrays.asList(new String[] { "b" }), list);
        Assert.assertFalse(list.contains("a"));
        Assert.assertTrue(list.add("a"));
        Assert.assertEquals(Arrays.asList(new String[] { "b", "a" }), list);
    }

    @Test
    public void testAsSetReflectsLaterListChanges() {
        SetUniqueList list = SetUniqueList.decorate(
                new ArrayList(Arrays.asList(new String[] { "first" })));
        Set setView = list.asSet();

        list.add("second");

        Assert.assertTrue(setView.contains("first"));
        Assert.assertTrue(setView.contains("second"));
        Assert.assertEquals(2, setView.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAsSetIsUnmodifiable() {
        SetUniqueList list = SetUniqueList.decorate(
                new ArrayList(Arrays.asList(new String[] { "value" })));

        list.asSet().add("other");
    }

    @Test
    public void testIteratorRemoveUpdatesSetAndAllowsReaddition() {
        SetUniqueList list = SetUniqueList.decorate(
                new ArrayList(Arrays.asList(new String[] { "a", "b" })));
        Iterator iterator = list.iterator();

        Assert.assertEquals("a", iterator.next());
        iterator.remove();

        Assert.assertFalse(list.contains("a"));
        Assert.assertTrue(list.add("a"));
        Assert.assertEquals(Arrays.asList(new String[] { "b", "a" }), list);
    }

    @Test
    public void testListIteratorAddRejectsDuplicateAndAddsUniqueValue() {
        SetUniqueList list = SetUniqueList.decorate(
                new ArrayList(Arrays.asList(new String[] { "a", "b", "c" })));
        ListIterator iterator = list.listIterator();

        Assert.assertEquals("a", iterator.next());
        iterator.add("b");
        iterator.add("x");

        Assert.assertEquals(Arrays.asList(new String[] { "a", "x", "b", "c" }), list);
        Assert.assertTrue(list.contains("x"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIteratorDoesNotSupportSet() {
        SetUniqueList list = SetUniqueList.decorate(
                new ArrayList(Arrays.asList(new String[] { "a", "b" })));
        ListIterator iterator = list.listIterator();

        iterator.next();
        iterator.set("z");
    }
}

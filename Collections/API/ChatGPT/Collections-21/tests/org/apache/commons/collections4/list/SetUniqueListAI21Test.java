package org.apache.commons.collections4.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class SetUniqueListAI21Test {

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryRejectsNullList() {
        SetUniqueList.setUniqueList(null);
    }

    @Test
    public void testFactoryRemovesDuplicatesAndWrapsBackingList() {
        List<String> backing = new ArrayList<String>(
                Arrays.asList("first", "second", "first", "third", "second"));

        SetUniqueList<String> values = SetUniqueList.setUniqueList(backing);

        Assert.assertEquals(Arrays.asList("first", "second", "third"), values);
        Assert.assertEquals(Arrays.asList("first", "second", "third"), backing);

        values.add("fourth");
        Assert.assertEquals(Arrays.asList("first", "second", "third", "fourth"), backing);
    }

    @Test
    public void testAddRejectsDuplicatesIncludingNull() {
        SetUniqueList<String> values = SetUniqueList.setUniqueList(new ArrayList<String>());

        Assert.assertTrue(values.add("one"));
        Assert.assertFalse(values.add("one"));
        Assert.assertTrue(values.add(null));
        Assert.assertFalse(values.add(null));

        Assert.assertEquals(Arrays.asList("one", null), values);
        Assert.assertTrue(values.contains(null));
    }

    @Test
    public void testAddAllAtIndexPreservesCollectionOrderAndSkipsDuplicates() {
        SetUniqueList<String> values = SetUniqueList.setUniqueList(
                new ArrayList<String>(Arrays.asList("a", "c")));

        boolean changed = values.addAll(1,
                Arrays.asList("b", "a", "b", "d", "c", "e"));

        Assert.assertTrue(changed);
        Assert.assertEquals(Arrays.asList("a", "b", "d", "e", "c"), values);
        Assert.assertFalse(values.addAll(Arrays.asList("a", "b", "c")));
    }

    @Test
    public void testSetWithExistingValueRemovesPreviousOccurrence() {
        SetUniqueList<String> values = SetUniqueList.setUniqueList(
                new ArrayList<String>(Arrays.asList("a", "b", "c")));

        String previous = values.set(2, "a");

        Assert.assertEquals("c", previous);
        Assert.assertEquals(Arrays.asList("b", "a"), values);
        Assert.assertFalse(values.contains("c"));
        Assert.assertEquals(2, values.asSet().size());
    }

    @Test
    public void testRemoveAllAndRetainAllKeepSetAndListConsistent() {
        SetUniqueList<String> values = SetUniqueList.setUniqueList(
                new ArrayList<String>(Arrays.asList("a", "b", "c")));

        Assert.assertFalse(values.retainAll(Arrays.asList("a", "b", "c")));
        Assert.assertTrue(values.retainAll(Arrays.asList("b", "c", "other")));
        Assert.assertEquals(Arrays.asList("b", "c"), values);

        Assert.assertTrue(values.removeAll(Arrays.asList("b", "missing")));
        Assert.assertEquals(Arrays.asList("c"), values);
        Assert.assertFalse(values.removeAll(Arrays.asList("missing")));
        Assert.assertTrue(values.asSet().contains("c"));
    }

    @Test
    public void testIteratorRemoveUpdatesUniquenessTracking() {
        SetUniqueList<String> values = SetUniqueList.setUniqueList(
                new ArrayList<String>(Arrays.asList("x", "y")));
        Iterator<String> iterator = values.iterator();

        Assert.assertEquals("x", iterator.next());
        iterator.remove();

        Assert.assertEquals(Arrays.asList("y"), values);
        Assert.assertFalse(values.contains("x"));
        Assert.assertTrue(values.add("x"));
        Assert.assertEquals(Arrays.asList("y", "x"), values);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIteratorAddsOnlyUniqueValuesAndDoesNotSupportSet() {
        SetUniqueList<String> values = SetUniqueList.setUniqueList(
                new ArrayList<String>(Arrays.asList("first", "last")));
        ListIterator<String> iterator = values.listIterator(1);

        iterator.add("middle");
        iterator.add("first");

        Assert.assertEquals(Arrays.asList("first", "middle", "last"), values);
        iterator.set("replacement");
    }

    @Test
    public void testAsSetIsLiveAndUnmodifiable() {
        SetUniqueList<String> values = SetUniqueList.setUniqueList(
                new ArrayList<String>(Arrays.asList("one")));
        Set<String> setView = values.asSet();

        values.add("two");

        Assert.assertTrue(setView.contains("two"));
        Assert.assertEquals(2, setView.size());
        try {
            setView.add("three");
            Assert.fail("asSet should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            Assert.assertEquals(Arrays.asList("one", "two"), values);
        }
    }

    @Test
    public void testSubListIsUnmodifiableAndHasRequestedContents() {
        SetUniqueList<String> values = SetUniqueList.setUniqueList(
                new ArrayList<String>(Arrays.asList("zero", "one", "two", "three")));

        List<String> subList = values.subList(1, 3);

        Assert.assertEquals(Arrays.asList("one", "two"), subList);
        try {
            subList.remove("one");
            Assert.fail("subList should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            Assert.assertEquals(Arrays.asList("zero", "one", "two", "three"), values);
        }
    }
}

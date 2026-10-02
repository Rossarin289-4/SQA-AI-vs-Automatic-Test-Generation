package org.apache.commons.collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.OrderedIterator;
import org.junit.Assert;
import org.junit.Test;

public class ListOrderedSetAI18Test {

    private void assertOrder(ListOrderedSet<String> set, String... values) {
        Assert.assertEquals(Arrays.asList(values), Arrays.asList(set.toArray()));
    }

    @Test
    public void testAddRetainsInsertionOrderAndRejectsDuplicates() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();

        Assert.assertTrue(set.add("first"));
        Assert.assertTrue(set.add("second"));
        Assert.assertFalse(set.add("first"));

        Assert.assertEquals(2, set.size());
        assertOrder(set, "first", "second");
        Assert.assertEquals("first", set.get(0));
        Assert.assertEquals("second", set.get(1));
        Assert.assertEquals(0, set.indexOf("first"));
        Assert.assertEquals(-1, set.indexOf("missing"));
    }

    @Test
    public void testIndexedAddAndIndexedAddAllInsertOnlyNewElements() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("a");
        set.add("d");

        set.add(1, "b");
        set.add(2, "c");
        set.add(0, "a");
        Assert.assertTrue(set.addAll(3, Arrays.asList("x", "c", "y", "x")));

        assertOrder(set, "a", "b", "c", "x", "y", "d");
        Assert.assertEquals(6, set.size());
        Assert.assertFalse(set.addAll(1, Arrays.asList("a", "b", "c")));
        assertOrder(set, "a", "b", "c", "x", "y", "d");
    }

    @Test
    public void testAddAllAppendsNewValuesInCollectionOrder() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("one");

        Assert.assertTrue(set.addAll(Arrays.asList("two", "one", "three", "two")));
        assertOrder(set, "one", "two", "three");

        Assert.assertFalse(set.addAll(Arrays.asList("three", "one")));
        assertOrder(set, "one", "two", "three");
    }

    @Test
    public void testRemoveByObjectAndIndexKeepsBothViewsConsistent() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.addAll(Arrays.asList("a", "b", "c"));

        Assert.assertFalse(set.remove("missing"));
        Assert.assertTrue(set.remove("b"));
        Assert.assertEquals("c", set.remove(1));

        assertOrder(set, "a");
        Assert.assertTrue(set.contains("a"));
        Assert.assertFalse(set.contains("b"));
        Assert.assertFalse(set.contains("c"));
    }

    @Test
    public void testRetainAllPreservesRelativeOrderAndReportsChanges() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.addAll(Arrays.asList("a", "b", "c", "d"));

        Assert.assertTrue(set.retainAll(Arrays.asList("d", "b", "missing")));
        assertOrder(set, "b", "d");

        Assert.assertFalse(set.retainAll(Arrays.asList("b", "d", "other")));
        assertOrder(set, "b", "d");

        Assert.assertTrue(set.retainAll(Arrays.asList("not-present")));
        Assert.assertTrue(set.isEmpty());
        Assert.assertEquals("[]", set.toString());
    }

    @Test
    public void testOrderedIteratorSupportsPreviousAndRemoval() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.addAll(Arrays.asList("a", "b", "c"));

        OrderedIterator<String> iterator = set.iterator();
        Assert.assertFalse(iterator.hasPrevious());
        Assert.assertEquals("a", iterator.next());
        Assert.assertEquals("b", iterator.next());
        Assert.assertTrue(iterator.hasPrevious());
        Assert.assertEquals("b", iterator.previous());

        iterator.remove();

        assertOrder(set, "a", "c");
        Assert.assertEquals("c", iterator.next());
    }

    @Test
    public void testTypedToArrayUsesProvidedArrayAndNullTerminatesIt() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.addAll(Arrays.asList("red", "blue"));
        String[] target = new String[] { "x", "x", "x", "unchanged" };

        String[] result = set.toArray(target);

        Assert.assertSame(target, result);
        Assert.assertEquals("red", result[0]);
        Assert.assertEquals("blue", result[1]);
        Assert.assertNull(result[2]);
        Assert.assertEquals("unchanged", result[3]);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAsListIsUnmodifiable() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("value");

        set.asList().add("another");
    }

    @Test
    public void testFactoryWithEmptySetAndListUsesBothProvidedCollections() {
        Set<String> backingSet = new HashSet<String>();
        List<String> backingList = new ArrayList<String>();

        ListOrderedSet<String> set = ListOrderedSet.listOrderedSet(backingSet, backingList);
        Assert.assertTrue(set.add("first"));
        Assert.assertTrue(set.add("second"));

        Assert.assertTrue(backingSet.contains("first"));
        Assert.assertTrue(backingSet.contains("second"));
        Assert.assertEquals(Arrays.asList("first", "second"), backingList);
        assertOrder(set, "first", "second");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryRejectsNullSet() {
        ListOrderedSet.listOrderedSet((Set<String>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryRejectsNonEmptySetOrList() {
        Set<String> set = new HashSet<String>();
        set.add("present");

        ListOrderedSet.listOrderedSet(set, new ArrayList<String>());
    }
}

package org.apache.commons.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class SetUniqueListAI15Test {

    @Test(expected = IllegalArgumentException.class)
    public void decorateRejectsNullList() {
        SetUniqueList.decorate(null);
    }

    @Test
    public void decorateRemovesDuplicatesAndPreservesFirstOccurrenceOrder() {
        List backing = new ArrayList(Arrays.asList("one", "two", "one", "three", "two"));

        SetUniqueList list = SetUniqueList.decorate(backing);

        Assert.assertEquals(Arrays.asList("one", "two", "three"), list);
        Assert.assertEquals(Arrays.asList("one", "two", "three"), backing);
        Assert.assertEquals(3, list.size());
    }

    @Test
    public void addRejectsDuplicateAndAllowsNullOnlyOnce() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());

        Assert.assertTrue(list.add("alpha"));
        Assert.assertFalse(list.add("alpha"));
        Assert.assertTrue(list.add(null));
        Assert.assertFalse(list.add(null));

        Assert.assertEquals(Arrays.asList("alpha", null), list);
        Assert.assertTrue(list.contains(null));
    }

    @Test
    public void indexedAddDoesNotInsertExistingElement() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList(Arrays.asList("a", "c")));

        list.add(1, "b");
        list.add(0, "c");

        Assert.assertEquals(Arrays.asList("a", "b", "c"), list);
        Assert.assertEquals(3, list.size());
    }

    @Test
    public void addAllAtIndexMaintainsInputOrderForNewElements() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList(Arrays.asList("a", "d")));

        boolean changed = list.addAll(1, Arrays.asList("b", "a", "c", "b", "d"));

        Assert.assertTrue(changed);
        Assert.assertEquals(Arrays.asList("a", "b", "c", "d"), list);
        Assert.assertFalse(list.addAll(Arrays.asList("a", "b", "c", "d")));
    }

    @Test
    public void setToExistingValueRemovesOtherOccurrenceAndReturnsOldValue() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList(Arrays.asList("a", "b", "c")));

        Object old = list.set(0, "c");

        Assert.assertEquals("a", old);
        Assert.assertEquals(Arrays.asList("c", "b"), list);
        Assert.assertTrue(list.contains("c"));
        Assert.assertFalse(list.contains("a"));
    }

    @Test
    public void removalsKeepSetMembershipInSync() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList(Arrays.asList("a", "b", "c", "d")));

        Assert.assertTrue(list.remove("b"));
        Assert.assertEquals("c", list.remove(1));
        Assert.assertTrue(list.retainAll(Arrays.asList("a", "d")));

        Assert.assertEquals(Arrays.asList("a", "d"), list);
        Assert.assertFalse(list.contains("b"));
        Assert.assertFalse(list.contains("c"));
        Assert.assertTrue(list.add("b"));
        Assert.assertEquals(Arrays.asList("a", "d", "b"), list);
    }

    @Test
    public void iteratorRemoveMakesElementAvailableForAdditionAgain() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList(Arrays.asList("a", "b", "c")));
        Iterator iterator = list.iterator();

        Assert.assertEquals("a", iterator.next());
        iterator.remove();

        Assert.assertFalse(list.contains("a"));
        Assert.assertTrue(list.add("a"));
        Assert.assertEquals(Arrays.asList("b", "c", "a"), list);
    }

    @Test
    public void listIteratorAddsOnlyUniqueValuesAndDoesNotSupportSet() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList(Arrays.asList("a", "c")));
        ListIterator iterator = list.listIterator(1);

        iterator.add("b");
        iterator.add("a");

        Assert.assertEquals(Arrays.asList("a", "b", "c"), list);
        try {
            iterator.set("x");
            Assert.fail("List iterator set should not be supported");
        } catch (UnsupportedOperationException expected) {
            Assert.assertEquals(Arrays.asList("a", "b", "c"), list);
        }
    }

    @Test
    public void subListRemovalUpdatesParentAndSharedUniquenessSet() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList(Arrays.asList("a", "b", "c", "d")));
        List subList = list.subList(1, 3);

        Assert.assertEquals("b", subList.remove(0));
        Assert.assertTrue(list.add("b"));

        Assert.assertEquals(Arrays.asList("a", "c", "d", "b"), list);
        Assert.assertTrue(list.contains("b"));
    }

    @Test
    public void asSetIsUnmodifiableAndReflectsListContents() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList(Arrays.asList("a", "b")));
        Set set = list.asSet();

        Assert.assertTrue(set.contains("a"));
        Assert.assertEquals(2, set.size());

        try {
            set.add("c");
            Assert.fail("Set view should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            Assert.assertEquals(Arrays.asList("a", "b"), list);
        }
    }
}

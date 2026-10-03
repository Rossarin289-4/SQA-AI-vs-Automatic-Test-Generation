package org.apache.commons.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class SetUniqueListAI5Test {

    @Test(expected = IllegalArgumentException.class)
    public void testDecorateRejectsNullList() {
        SetUniqueList.decorate(null);
    }

    @Test
    public void testDecorateRemovesDuplicatesAndWrapsOriginalList() {
        List backing = new ArrayList(Arrays.asList("one", "two", "one", "three", "two"));

        SetUniqueList list = SetUniqueList.decorate(backing);

        Assert.assertEquals(Arrays.asList("one", "two", "three"), list);
        Assert.assertEquals(Arrays.asList("one", "two", "three"), backing);

        list.add("four");
        Assert.assertEquals(Arrays.asList("one", "two", "three", "four"), backing);
    }

    @Test
    public void testAddAndIndexedAddOnlyInsertUniqueElements() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());

        Assert.assertTrue(list.add("a"));
        Assert.assertFalse(list.add("a"));
        list.add(0, "b");
        list.add(1, "a");

        Assert.assertEquals(Arrays.asList("b", "a"), list);
        Assert.assertTrue(list.contains("a"));
        Assert.assertTrue(list.contains("b"));
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void testAddAllAtIndexPreservesOrderOfNewElements() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList(Arrays.asList("a", "d")));

        boolean changed = list.addAll(1, Arrays.asList("b", "a", "c", "b", "d"));

        Assert.assertTrue(changed);
        Assert.assertEquals(Arrays.asList("a", "b", "c", "d"), list);
        Assert.assertFalse(list.addAll(Arrays.asList("a", "b", "c", "d")));
    }

    @Test
    public void testSetToExistingElementRemovesPriorOccurrence() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList(Arrays.asList("a", "b", "c")));

        Object previous = list.set(2, "a");

        Assert.assertEquals("c", previous);
        Assert.assertEquals(Arrays.asList("b", "a"), list);
        Assert.assertFalse(list.contains("c"));
        Assert.assertTrue(list.contains("a"));
        Assert.assertTrue(list.contains("b"));
    }

    @Test
    public void testRemoveAllAndRetainAllKeepUniquenessTrackingInSync() {
        SetUniqueList list = SetUniqueList.decorate(
                new ArrayList(Arrays.asList("a", "b", "c", "d")));

        Assert.assertTrue(list.removeAll(Arrays.asList("a", "c", "missing")));
        Assert.assertEquals(Arrays.asList("b", "d"), list);
        Assert.assertTrue(list.add("a"));

        Assert.assertTrue(list.retainAll(Arrays.asList("a", "d")));
        Assert.assertEquals(Arrays.asList("d", "a"), list);
        Assert.assertTrue(list.add("b"));
        Assert.assertEquals(Arrays.asList("d", "a", "b"), list);
    }

    @Test
    public void testIteratorRemoveAllowsElementToBeAddedAgain() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList(Arrays.asList("a", "b", "c")));

        Iterator iterator = list.iterator();
        Assert.assertEquals("a", iterator.next());
        iterator.remove();

        Assert.assertEquals(Arrays.asList("b", "c"), list);
        Assert.assertFalse(list.contains("a"));
        Assert.assertTrue(list.add("a"));
        Assert.assertEquals(Arrays.asList("b", "c", "a"), list);
    }

    @Test
    public void testListIteratorAddRejectsDuplicatesAndAddsNewValue() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList(Arrays.asList("a", "b")));

        ListIterator iterator = list.listIterator(1);
        iterator.add("a");
        iterator.add("c");

        Assert.assertEquals(Arrays.asList("a", "c", "b"), list);
        Assert.assertTrue(list.contains("c"));
        Assert.assertEquals(3, list.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIteratorSetIsUnsupported() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList(Arrays.asList("a", "b")));

        ListIterator iterator = list.listIterator();
        iterator.next();
        iterator.set("c");
    }

    @Test
    public void testSubListRemovalUpdatesParentUniquenessSet() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList(Arrays.asList("a", "b", "c")));

        List subList = list.subList(1, 3);
        Assert.assertTrue(subList.remove("b"));

        Assert.assertEquals(Arrays.asList("a", "c"), list);
        Assert.assertFalse(list.contains("b"));
        Assert.assertTrue(list.add("b"));
        Assert.assertEquals(Arrays.asList("a", "c", "b"), list);
    }

    @Test
    public void testAsSetReflectsContentsAndIsUnmodifiable() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList(Arrays.asList("a", "b")));
        Set setView = list.asSet();

        Assert.assertEquals(new HashSet(Arrays.asList("a", "b")), setView);

        list.add("c");
        Assert.assertTrue(setView.contains("c"));

        try {
            setView.add("d");
            Assert.fail("Set view should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            Assert.assertEquals(Arrays.asList("a", "b", "c"), list);
        }
    }
}

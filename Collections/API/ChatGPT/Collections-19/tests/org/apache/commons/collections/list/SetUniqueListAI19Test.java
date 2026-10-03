package org.apache.commons.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class SetUniqueListAI19Test {

    @Test(expected = IllegalArgumentException.class)
    public void setUniqueListRejectsNullList() {
        SetUniqueList.setUniqueList(null);
    }

    @Test
    public void factoryRemovesDuplicatesAndKeepsFirstOccurrenceOrder() {
        List<String> backing = new ArrayList<String>(
                Arrays.asList("one", "two", "one", "three", "two"));

        SetUniqueList<String> list = SetUniqueList.setUniqueList(backing);

        Assert.assertEquals(Arrays.asList("one", "two", "three"), list);
        Assert.assertSame(backing, list.decorated());
        Assert.assertEquals(Arrays.asList("one", "two", "three"), backing);
        Assert.assertEquals(3, list.asSet().size());
    }

    @Test
    public void addRejectsDuplicateAndAllowsNullOnlyOnce() {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(
                new ArrayList<String>());

        Assert.assertTrue(list.add("value"));
        Assert.assertFalse(list.add("value"));
        Assert.assertTrue(list.add(null));
        Assert.assertFalse(list.add(null));

        Assert.assertEquals(Arrays.asList("value", null), list);
        Assert.assertTrue(list.contains(null));
    }

    @Test
    public void addAllAtIndexFiltersExistingAndRepeatedValues() {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(
                new ArrayList<String>(Arrays.asList("a", "d")));

        boolean changed = list.addAll(1,
                Arrays.asList("d", "b", "b", "c", "a"));

        Assert.assertTrue(changed);
        Assert.assertEquals(Arrays.asList("a", "b", "c", "d"), list);
        Assert.assertFalse(list.addAll(Arrays.asList("a", "b", "c", "d")));
    }

    @Test
    public void setToExistingValueRemovesOldOccurrenceAndDeletedValue() {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(
                new ArrayList<String>(Arrays.asList("a", "b", "c")));

        String previous = list.set(2, "a");

        Assert.assertEquals("c", previous);
        Assert.assertEquals(Arrays.asList("b", "a"), list);
        Assert.assertFalse(list.contains("c"));
        Assert.assertTrue(list.contains("a"));
        Assert.assertEquals(2, list.asSet().size());
    }

    @Test
    public void removeOperationsKeepSetAndListConsistent() {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(
                new ArrayList<String>(Arrays.asList("a", "b", "c", "d")));

        Assert.assertTrue(list.remove("b"));
        Assert.assertFalse(list.remove("missing"));
        Assert.assertEquals("c", list.remove(1));
        Assert.assertTrue(list.removeAll(Arrays.asList("a", "not-present")));

        Assert.assertEquals(Arrays.asList("d"), list);
        Assert.assertEquals(1, list.asSet().size());
        Assert.assertTrue(list.asSet().contains("d"));
    }

    @Test
    public void retainAllRemovesValuesNotRequestedAndReportsChanges() {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(
                new ArrayList<String>(Arrays.asList("a", "b", "c")));

        Assert.assertTrue(list.retainAll(Arrays.asList("b", "c", "other")));
        Assert.assertEquals(Arrays.asList("b", "c"), list);
        Assert.assertFalse(list.retainAll(Arrays.asList("b", "c")));
        Assert.assertTrue(list.retainAll(Arrays.asList("not-present")));
        Assert.assertTrue(list.isEmpty());
        Assert.assertTrue(list.asSet().isEmpty());
    }

    @Test
    public void iteratorRemoveUpdatesMembershipSet() {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(
                new ArrayList<String>(Arrays.asList("a", "b", "c")));

        Iterator<String> iterator = list.iterator();
        Assert.assertEquals("a", iterator.next());
        iterator.remove();

        Assert.assertEquals(Arrays.asList("b", "c"), list);
        Assert.assertFalse(list.contains("a"));
        Assert.assertTrue(list.add("a"));
        Assert.assertEquals(Arrays.asList("b", "c", "a"), list);
    }

    @Test
    public void listIteratorAddsOnlyUniqueElements() {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(
                new ArrayList<String>(Arrays.asList("a", "b")));

        ListIterator<String> iterator = list.listIterator();
        iterator.add("a");
        iterator.add("new");

        Assert.assertEquals(Arrays.asList("new", "a", "b"), list);
        Assert.assertEquals(3, list.asSet().size());
        Assert.assertTrue(list.contains("new"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void listIteratorDoesNotSupportSet() {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(
                new ArrayList<String>(Arrays.asList("a", "b")));

        list.listIterator().set("replacement");
    }

    @Test
    public void asSetIsLiveButUnmodifiable() {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(
                new ArrayList<String>(Arrays.asList("a")));
        Set<String> view = list.asSet();

        list.add("b");

        Assert.assertTrue(view.contains("a"));
        Assert.assertTrue(view.contains("b"));
        try {
            view.remove("a");
            Assert.fail("Set view should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            Assert.assertEquals(Arrays.asList("a", "b"), list);
        }
    }
}

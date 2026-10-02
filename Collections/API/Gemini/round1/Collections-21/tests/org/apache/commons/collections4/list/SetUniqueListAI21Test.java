package org.apache.commons.collections4.list;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class SetUniqueListAI21Test {

    @Test
    public void testFactoryMethodWithDuplicates() {
        final List<String> list = new ArrayList<String>(Arrays.asList("A", "B", "A", "C", "B"));
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);

        Assert.assertEquals(3, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertEquals("C", uniqueList.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryMethodNullList() {
        SetUniqueList.setUniqueList(null);
    }

    @Test
    public void testAddAndAddIndex() {
        final List<Integer> backing = new ArrayList<Integer>();
        final SetUniqueList<Integer> list = SetUniqueList.setUniqueList(backing);

        Assert.assertTrue(list.add(1));
        Assert.assertTrue(list.add(2));
        Assert.assertFalse(list.add(1));
        Assert.assertEquals(2, list.size());

        list.add(0, 3);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals(Integer.valueOf(3), list.get(0));

        // Adding already existing element at index should do nothing
        list.add(1, 2);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals(Integer.valueOf(3), list.get(0));
        Assert.assertEquals(Integer.valueOf(1), list.get(1));
        Assert.assertEquals(Integer.valueOf(2), list.get(2));
    }

    @Test
    public void testAddAll() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");

        final boolean changed = list.addAll(Arrays.asList("B", "C", "A", "D"));
        Assert.assertTrue(changed);
        Assert.assertEquals(4, list.size());
        Assert.assertEquals(Arrays.asList("A", "B", "C", "D"), list);

        final boolean changedAgain = list.addAll(1, Arrays.asList("C", "D", "B"));
        Assert.assertFalse(changedAgain);
        Assert.assertEquals(4, list.size());

        final boolean inserted = list.addAll(1, Arrays.asList("E", "F"));
        Assert.assertTrue(inserted);
        Assert.assertEquals(Arrays.asList("A", "E", "F", "B", "C", "D"), list);
    }

    @Test
    public void testSetMethod() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        list.add("B");
        list.add("C");

        // Set to a brand new element
        final String old = list.set(1, "X");
        Assert.assertEquals("B", old);
        Assert.assertEquals(Arrays.asList("A", "X", "C"), list);
        Assert.assertTrue(list.contains("X"));
        Assert.assertFalse(list.contains("B"));

        // Set to an element already present earlier in the list
        // List: ["A", "X", "C"], set at index 2 to "A".
        // Duplicate "A" at index 0 should be removed, result becomes ["X", "A"]
        final String old2 = list.set(2, "A");
        Assert.assertEquals("C", old2);
        Assert.assertEquals(Arrays.asList("X", "A"), list);
        Assert.assertEquals(2, list.size());

        // Set same element at same index
        final String old3 = list.set(0, "X");
        Assert.assertEquals("X", old3);
        Assert.assertEquals(Arrays.asList("X", "A"), list);
    }

    @Test
    public void testRemoveOperations() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.addAll(Arrays.asList("A", "B", "C", "D"));

        Assert.assertTrue(list.remove("B"));
        Assert.assertFalse(list.remove("Z"));
        Assert.assertEquals(Arrays.asList("A", "C", "D"), list);
        Assert.assertFalse(list.asSet().contains("B"));

        final String removedIndex = list.remove(1);
        Assert.assertEquals("C", removedIndex);
        Assert.assertEquals(Arrays.asList("A", "D"), list);
        Assert.assertFalse(list.contains("C"));

        final boolean batchRemoved = list.removeAll(Arrays.asList("A", "NonExistent"));
        Assert.assertTrue(batchRemoved);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("D", list.get(0));

        list.clear();
        Assert.assertTrue(list.isEmpty());
        Assert.assertEquals(0, list.asSet().size());
    }

    @Test
    public void testRetainAll() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.addAll(Arrays.asList("A", "B", "C", "D"));

        // Retain elements partially matching
        final boolean changed = list.retainAll(Arrays.asList("B", "D", "E"));
        Assert.assertTrue(changed);
        Assert.assertEquals(Arrays.asList("B", "D"), list);
        Assert.assertTrue(list.contains("B"));
        Assert.assertTrue(list.contains("D"));
        Assert.assertFalse(list.contains("A"));

        // Retain all identical elements - no change
        final boolean unchanged = list.retainAll(Arrays.asList("B", "D"));
        Assert.assertFalse(unchanged);

        // Retain none
        final boolean cleared = list.retainAll(Collections.singletonList("Z"));
        Assert.assertTrue(cleared);
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testIteratorAndRemove() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.addAll(Arrays.asList("A", "B", "C"));

        final Iterator<String> it = list.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("A", it.next());
        Assert.assertEquals("B", it.next());
        it.remove();

        Assert.assertEquals(2, list.size());
        Assert.assertFalse(list.contains("B"));
        Assert.assertEquals(Arrays.asList("A", "C"), list);
        Assert.assertEquals("C", it.next());
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testListIteratorAddAndSet() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.addAll(Arrays.asList("A", "B"));

        final ListIterator<String> it = list.listIterator();
        Assert.assertEquals("A", it.next());
        it.add("C"); // add "C"
        Assert.assertTrue(list.contains("C"));

        // Adding already existing element via listIterator
        it.add("B");
        Assert.assertEquals(Arrays.asList("A", "C", "B"), list);

        // Traverse backwards
        Assert.assertEquals("B", it.next());
        Assert.assertEquals("B", it.previous());
        it.remove();
        Assert.assertFalse(list.contains("B"));
        Assert.assertEquals(Arrays.asList("A", "C"), list);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIteratorSetUnsupported() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");
        final ListIterator<String> it = list.listIterator();
        it.next();
        it.set("B");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSubListIsUnmodifiable() {
        final SetUniqueList<Integer> list = SetUniqueList.setUniqueList(new ArrayList<Integer>());
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));

        final List<Integer> sub = list.subList(1, 4);
        Assert.assertEquals(Arrays.asList(2, 3, 4), sub);
        sub.add(10);
    }

    @Test
    public void testConstructorAndAsSet() {
        final List<String> list = new ArrayList<String>(Arrays.asList("X", "Y"));
        final Set<String> set = new HashSet<String>(list);
        final SetUniqueList<String> uniqueList = new SetUniqueList<String>(list, set);

        final Set<String> view = uniqueList.asSet();
        Assert.assertEquals(2, view.size());
        Assert.assertTrue(view.contains("X"));
        Assert.assertTrue(view.contains("Y"));

        try {
            view.add("Z");
            Assert.fail("asSet() should return an unmodifiable set");
        } catch (final UnsupportedOperationException expected) {
            // expected
        }
    }
}

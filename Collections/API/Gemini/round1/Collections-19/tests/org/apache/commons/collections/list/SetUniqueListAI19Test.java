package org.apache.commons.collections.list;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class SetUniqueListAI19Test {

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryWithNullListThrowsException() {
        SetUniqueList.setUniqueList(null);
    }

    @Test
    public void testFactoryRemovesDuplicatesAndMaintainsOrder() {
        List<String> list = new ArrayList<String>(Arrays.asList("A", "B", "A", "C", "B"));
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);

        Assert.assertEquals(3, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertEquals("C", uniqueList.get(2));
    }

    @Test
    public void testAddAndAddAtIndex() {
        List<Integer> base = new ArrayList<Integer>();
        SetUniqueList<Integer> list = SetUniqueList.setUniqueList(base);

        Assert.assertTrue(list.add(1));
        Assert.assertFalse(list.add(1));
        Assert.assertEquals(1, list.size());

        list.add(0, 2);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals(Integer.valueOf(2), list.get(0));
        Assert.assertEquals(Integer.valueOf(1), list.get(1));

        // Adding existing element at index should do nothing
        list.add(0, 1);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals(Integer.valueOf(2), list.get(0));
    }

    @Test
    public void testAddAll() {
        SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        list.add("A");

        boolean changed = list.addAll(Arrays.asList("B", "A", "C"));
        Assert.assertTrue(changed);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals(Arrays.asList("A", "B", "C"), list);

        boolean changed2 = list.addAll(Arrays.asList("A", "B"));
        Assert.assertFalse(changed2);
        Assert.assertEquals(3, list.size());

        // addAll at index
        boolean changed3 = list.addAll(1, Arrays.asList("D", "B", "E"));
        Assert.assertTrue(changed3);
        Assert.assertEquals(5, list.size());
        Assert.assertEquals(Arrays.asList("A", "D", "E", "B", "C"), list);
    }

    @Test
    public void testSetMethod() {
        List<String> base = new ArrayList<String>(Arrays.asList("A", "B", "C"));
        SetUniqueList<String> list = SetUniqueList.setUniqueList(base);

        // Replace with new element
        String old = list.set(1, "D");
        Assert.assertEquals("B", old);
        Assert.assertEquals(Arrays.asList("A", "D", "C"), list);
        Assert.assertTrue(list.contains("D"));
        Assert.assertFalse(list.contains("B"));

        // Replace with element already present at another index
        // When setting index 0 to "C", "C" is already at index 2.
        // It sets index 0 to "C" and removes previous duplicate "C".
        old = list.set(0, "C");
        Assert.assertEquals("A", old);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("C", list.get(0));
        Assert.assertEquals("D", list.get(1));
        Assert.assertFalse(list.contains("A"));

        // Replace element with itself
        old = list.set(1, "D");
        Assert.assertEquals("D", old);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("D", list.get(1));
    }

    @Test
    public void testRemoveOperations() {
        List<String> base = new ArrayList<String>(Arrays.asList("A", "B", "C", "D"));
        SetUniqueList<String> list = SetUniqueList.setUniqueList(base);

        // remove by object
        Assert.assertTrue(list.remove("B"));
        Assert.assertFalse(list.remove("NonExistent"));
        Assert.assertEquals(Arrays.asList("A", "C", "D"), list);
        Assert.assertFalse(list.contains("B"));

        // remove by index
        String removed = list.remove(1);
        Assert.assertEquals("C", removed);
        Assert.assertEquals(Arrays.asList("A", "D"), list);
        Assert.assertFalse(list.contains("C"));

        // removeAll
        boolean changed = list.removeAll(Arrays.asList("A", "Z"));
        Assert.assertTrue(changed);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("D", list.get(0));
        Assert.assertFalse(list.contains("A"));

        // clear
        list.clear();
        Assert.assertEquals(0, list.size());
        Assert.assertFalse(list.contains("D"));
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testRetainAll() {
        List<String> base = new ArrayList<String>(Arrays.asList("A", "B", "C", "D"));
        SetUniqueList<String> list = SetUniqueList.setUniqueList(base);

        // retain all existing: no change
        Assert.assertFalse(list.retainAll(Arrays.asList("A", "B", "C", "D", "E")));

        // retain subset
        Assert.assertTrue(list.retainAll(Arrays.asList("A", "C", "X")));
        Assert.assertEquals(2, list.size());
        Assert.assertEquals(Arrays.asList("A", "C"), list);
        Assert.assertTrue(list.contains("A"));
        Assert.assertTrue(list.contains("C"));
        Assert.assertFalse(list.contains("B"));

        // retain nothing in list clears it
        Assert.assertTrue(list.retainAll(Arrays.asList("Z")));
        Assert.assertTrue(list.isEmpty());
        Assert.assertFalse(list.contains("A"));
    }

    @Test
    public void testIteratorRemove() {
        List<String> base = new ArrayList<String>(Arrays.asList("A", "B", "C"));
        SetUniqueList<String> list = SetUniqueList.setUniqueList(base);

        Iterator<String> it = list.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("A", it.next());
        it.remove();

        Assert.assertEquals(2, list.size());
        Assert.assertFalse(list.contains("A"));
        Assert.assertEquals("B", list.get(0));
    }

    @Test
    public void testListIteratorAddAndPrevious() {
        List<String> base = new ArrayList<String>(Arrays.asList("A", "B"));
        SetUniqueList<String> list = SetUniqueList.setUniqueList(base);

        ListIterator<String> lit = list.listIterator();
        Assert.assertTrue(lit.hasNext());
        Assert.assertEquals("A", lit.next());

        // add duplicate should be ignored
        lit.add("A");
        Assert.assertEquals(2, list.size());

        // add new element
        lit.add("C");
        Assert.assertEquals(3, list.size());
        Assert.assertTrue(list.contains("C"));

        // previous check
        Assert.assertEquals("C", lit.previous());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIteratorSetThrowsException() {
        List<String> base = new ArrayList<String>(Arrays.asList("A", "B"));
        SetUniqueList<String> list = SetUniqueList.setUniqueList(base);
        ListIterator<String> lit = list.listIterator();
        lit.next();
        lit.set("C");
    }

    @Test
    public void testAsSetAndSubList() {
        List<String> base = new ArrayList<String>(Arrays.asList("A", "B", "C", "D"));
        SetUniqueList<String> list = SetUniqueList.setUniqueList(base);

        Set<String> setView = list.asSet();
        Assert.assertEquals(4, setView.size());
        Assert.assertTrue(setView.contains("A"));

        List<String> sub = list.subList(1, 3);
        Assert.assertEquals(2, sub.size());
        Assert.assertEquals(Arrays.asList("B", "C"), sub);
        Assert.assertTrue(sub.contains("B"));
        Assert.assertFalse(sub.contains("A"));
    }
}

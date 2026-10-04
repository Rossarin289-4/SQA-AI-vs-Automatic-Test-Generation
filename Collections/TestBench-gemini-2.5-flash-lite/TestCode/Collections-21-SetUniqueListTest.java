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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testSetUniqueListFactoryEmpty() {
        List<String> list = new ArrayList<>();
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        assertNotNull(uniqueList);
        assertTrue(uniqueList.isEmpty());
    }

    @Test
    public void testSetUniqueListFactoryWithDuplicates() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("c");
        list.add("b");

        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        assertEquals(3, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("b", uniqueList.get(1));
        assertEquals("c", uniqueList.get(2));
    }

    @Test
    public void testSetUniqueListConstructor() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Set<String> set = new HashSet<>(list);
        SetUniqueList<String> uniqueList = new SetUniqueList<>(list, set);
        assertNotNull(uniqueList);
        assertEquals(2, uniqueList.size());
    }

    @Test
    public void testAsSet() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        Set<String> setView = uniqueList.asSet();
        assertEquals(2, setView.size());
        assertTrue(setView.contains("a"));
        assertTrue(setView.contains("b"));
        // The return type of asSet() is Set<E>, no need to check for instanceof java.util.Set here, it's guaranteed.
    }

    @Test
    public void testAddUniqueElement() {
        List<String> list = new ArrayList<>();
        list.add("a");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        boolean added = uniqueList.add("b");
        assertTrue(added);
        assertEquals(2, uniqueList.size());
        assertTrue(uniqueList.contains("b"));
    }

    @Test
    public void testAddDuplicateElement() {
        List<String> list = new ArrayList<>();
        list.add("a");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        boolean added = uniqueList.add("a");
        assertFalse(added);
        assertEquals(1, uniqueList.size());
        assertTrue(uniqueList.contains("a"));
    }

    @Test
    public void testAddAtIndexUniqueElement() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        uniqueList.add(1, "b");
        assertEquals(3, uniqueList.size());
        assertEquals("b", uniqueList.get(1));
        assertEquals("a", uniqueList.get(0));
        assertEquals("c", uniqueList.get(2));
    }

    @Test
    public void testAddAtIndexDuplicateElement() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        uniqueList.add(1, "a"); // Attempt to add duplicate at index 1
        assertEquals(2, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("c", uniqueList.get(1));
    }

    @Test
    public void testAddAllUniqueElements() {
        List<String> list = new ArrayList<>();
        list.add("a");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        Collection<String> newElements = new ArrayList<>();
        newElements.add("b");
        newElements.add("c");
        boolean changed = uniqueList.addAll(newElements);
        assertTrue(changed);
        assertEquals(3, uniqueList.size());
        assertTrue(uniqueList.contains("b"));
        assertTrue(uniqueList.contains("c"));
    }

    @Test
    public void testAddAllWithDuplicates() {
        List<String> list = new ArrayList<>();
        list.add("a");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        Collection<String> newElements = new ArrayList<>();
        newElements.add("b");
        newElements.add("a"); // Duplicate
        newElements.add("c");
        newElements.add("b"); // Duplicate
        boolean changed = uniqueList.addAll(newElements);
        assertTrue(changed);
        assertEquals(3, uniqueList.size());
        assertTrue(uniqueList.contains("b"));
        assertTrue(uniqueList.contains("c"));
    }

    @Test
    public void testAddAllAtIndex() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("d");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        Collection<String> newElements = new ArrayList<>();
        newElements.add("b");
        newElements.add("c");
        boolean changed = uniqueList.addAll(1, newElements);
        assertTrue(changed);
        assertEquals(4, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("b", uniqueList.get(1));
        assertEquals("c", uniqueList.get(2));
        assertEquals("d", uniqueList.get(3));
    }

    @Test
    public void testSetElementUnique() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        String previous = uniqueList.set(1, "d"); // Replace "b" with "d"
        assertEquals("b", previous);
        assertEquals(3, uniqueList.size());
        assertTrue(uniqueList.contains("d"));
        assertFalse(uniqueList.contains("b"));
    }

    @Test
    public void testSetElementDuplicateIntoNewPosition() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        String previous = uniqueList.set(2, "a"); // Replace "c" with "a" (which is already at index 0)
        assertEquals("c", previous);
        assertEquals(2, uniqueList.size());
        assertTrue(uniqueList.contains("a"));
        assertFalse(uniqueList.contains("c"));
        assertEquals("a", uniqueList.get(0)); // "a" should remain at index 0
    }

    @Test
    public void testSetElementDuplicateIntoSamePosition() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        String previous = uniqueList.set(1, "b"); // Replace "b" with "b"
        assertEquals("b", previous);
        assertEquals(2, uniqueList.size());
        assertTrue(uniqueList.contains("b"));
    }

    @Test
    public void testRemoveExistingElementByObject() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        boolean removed = uniqueList.remove("b");
        assertTrue(removed);
        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("b"));
    }

    @Test
    public void testRemoveNonExistingElementByObject() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        boolean removed = uniqueList.remove("c");
        assertFalse(removed);
        assertEquals(2, uniqueList.size());
    }

    @Test
    public void testRemoveExistingElementByIndex() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        String removed = uniqueList.remove(1); // Remove "b"
        assertEquals("b", removed);
        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("b"));
    }

    @Test
    public void testRemoveAllElements() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        Collection<String> elementsToRemove = new ArrayList<>();
        elementsToRemove.add("b");
        elementsToRemove.add("d");
        boolean changed = uniqueList.removeAll(elementsToRemove);
        assertTrue(changed);
        assertEquals(2, uniqueList.size());
        assertTrue(uniqueList.contains("a"));
        assertTrue(uniqueList.contains("c"));
        assertFalse(uniqueList.contains("b"));
        assertFalse(uniqueList.contains("d"));
    }

    @Test
    public void testRemoveAllWithNonExistingElements() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        Collection<String> elementsToRemove = new ArrayList<>();
        elementsToRemove.add("c");
        elementsToRemove.add("d");
        boolean changed = uniqueList.removeAll(elementsToRemove);
        assertFalse(changed);
        assertEquals(2, uniqueList.size());
    }

    @Test
    public void testRetainAllElements() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        Collection<String> elementsToRetain = new ArrayList<>();
        elementsToRetain.add("a");
        elementsToRetain.add("c");
        boolean changed = uniqueList.retainAll(elementsToRetain);
        assertTrue(changed);
        assertEquals(2, uniqueList.size());
        assertTrue(uniqueList.contains("a"));
        assertTrue(uniqueList.contains("c"));
        assertFalse(uniqueList.contains("b"));
        assertFalse(uniqueList.contains("d"));
    }

    @Test
    public void testRetainAllWithNoElementsToRetain() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        Collection<String> elementsToRetain = new ArrayList<>();
        boolean changed = uniqueList.retainAll(elementsToRetain);
        assertTrue(changed);
        assertTrue(uniqueList.isEmpty());
    }
    
    @Test
    public void testRetainAllWhenAllElementsAreRetained() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        Collection<String> elementsToRetain = new ArrayList<>();
        elementsToRetain.add("a");
        elementsToRetain.add("b");
        boolean changed = uniqueList.retainAll(elementsToRetain);
        assertFalse(changed);
        assertEquals(2, uniqueList.size());
    }


    @Test
    public void testClear() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        uniqueList.clear();
        assertTrue(uniqueList.isEmpty());
        assertTrue(uniqueList.asSet().isEmpty());
    }

    @Test
    public void testContainsExistingElement() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        assertTrue(uniqueList.contains("a"));
    }

    @Test
    public void testContainsNonExistingElement() {
        List<String> list = new ArrayList<>();
        list.add("a");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        assertFalse(uniqueList.contains("b"));
    }

    @Test
    public void testContainsAllExistingElements() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        Collection<String> elements = new ArrayList<>();
        elements.add("a");
        elements.add("c");
        assertTrue(uniqueList.containsAll(elements));
    }

    @Test
    public void testContainsAllWithSomeNonExistingElements() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        Collection<String> elements = new ArrayList<>();
        elements.add("a");
        elements.add("c"); // "c" is not in the list
        assertFalse(uniqueList.containsAll(elements));
    }

    @Test
    public void testIterator() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        Iterator<String> it = uniqueList.iterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorRemove() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        Iterator<String> it = uniqueList.iterator();
        it.next(); // "a"
        it.next(); // "b"
        it.remove();
        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("b"));
        assertEquals("c", uniqueList.get(1));
    }

    @Test
    public void testListIterator() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        ListIterator<String> it = uniqueList.listIterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasPrevious());
        assertEquals("a", it.previous());
        assertTrue(it.hasNext()); // After previous(), cursor is before "a". Next moves it past "a".
        assertEquals("b", it.next());
        assertTrue(it.hasPrevious()); // After next(), cursor is after "b". Previous moves it before "b".
        assertEquals("b", it.previous());
        assertFalse(it.hasNext()); // Cursor is before "a" again, after previous().
    }

    @Test
    public void testListIteratorAdd() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        ListIterator<String> it = uniqueList.listIterator(1); // Start at index 1
        it.add("b");
        assertEquals(3, uniqueList.size());
        assertEquals("b", uniqueList.get(1));
        assertEquals("a", uniqueList.get(0));
        assertEquals("c", uniqueList.get(2));
    }
    
    @Test
    public void testListIteratorAddDuplicate() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        ListIterator<String> it = uniqueList.listIterator(1); // Start at index 1
        it.add("a"); // Add duplicate
        assertEquals(2, uniqueList.size()); // Size should not change
        assertEquals("a", uniqueList.get(0));
        assertEquals("c", uniqueList.get(1));
    }


    @Test(expected = UnsupportedOperationException.class)
    public void testListIteratorSetUnsupported() {
        List<String> list = new ArrayList<>();
        list.add("a");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        ListIterator<String> it = uniqueList.listIterator();
        it.next();
        it.set("b"); // This should throw UnsupportedOperationException
    }

    @Test
    public void testSubList() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        List<String> sub = uniqueList.subList(1, 3); // elements "b", "c"
        assertEquals(2, sub.size());
        assertEquals("b", sub.get(0));
        assertEquals("c", sub.get(1));
        // The subList returns an unmodifiable list wrapping a SetUniqueList.
        // Direct instanceof SetUniqueList will fail.
        // We can check its behavior indirectly.
        assertFalse(sub instanceof SetUniqueList); // It's wrapped in UnmodifiableList
        // Let's check if the elements are correct
        List<String> checkList = new ArrayList<>();
        checkList.add("b");
        checkList.add("c");
        assertEquals(checkList, sub);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testSubListModificationAdd() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        List<String> sub = uniqueList.subList(1, 3); // elements "b", "c"
        sub.add("e"); // Modify the sublist - should throw UnsupportedOperationException
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSubListAddDuplicate() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        List<String> sub = uniqueList.subList(1, 3); // elements "b", "c"
        sub.add("b"); // Try to add a duplicate - should throw UnsupportedOperationException
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSubListRemove() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        List<String> sub = uniqueList.subList(1, 3); // elements "b", "c"
        sub.remove("b"); // Modify the sublist - should throw UnsupportedOperationException
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testSubListSetUnique() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        List<String> sub = uniqueList.subList(1, 3); // elements "b", "c"
        sub.set(1, "e"); // Replace "c" with "e" - should throw UnsupportedOperationException
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSubListSetDuplicate() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        List<String> sub = uniqueList.subList(1, 3); // elements "b", "c"
        sub.set(1, "b"); // Replace "c" with "b" - should throw UnsupportedOperationException
    }
    
    @Test
    public void testGetWithIndex() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        assertEquals("a", uniqueList.get(0));
        assertEquals("b", uniqueList.get(1));
    }

    @Test
    public void testIndexOfExistingElement() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a"); // Duplicate added to initial list
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        // The setUniqueList factory method removes duplicates, keeping the first occurrence.
        // So the internal list will be ["a", "b"].
        assertEquals(0, uniqueList.indexOf("a"));
    }

    @Test
    public void testIndexOfNonExistingElement() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        assertEquals(-1, uniqueList.indexOf("c"));
    }

    @Test
    public void testLastIndexOfNonExistingElement() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        assertEquals(-1, uniqueList.lastIndexOf("c"));
    }

    @Test
    public void testLastIndexOfExistingElement() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a"); // Duplicate added to initial list
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        // The setUniqueList factory method removes duplicates, keeping the first occurrence.
        // So the internal list will be ["a", "b"].
        assertEquals(0, uniqueList.lastIndexOf("a"));
    }

}

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
    public void testDecorate_nullList() throws Exception {
        try {
            SetUniqueList.decorate(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testDecorate_emptyList() throws Exception {
        List<Object> list = new ArrayList<>();
        SetUniqueList uniqueList = SetUniqueList.decorate(list);
        assertNotNull(uniqueList);
        assertEquals(0, uniqueList.size());
        assertTrue(uniqueList.set.isEmpty());
    }

    @Test
    public void testDecorate_nonEmptyList() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a"); // duplicate
        
        // The decorate method clears the original list and then adds elements.
        // So, the original list passed to decorate should be empty after the call.
        SetUniqueList uniqueList = SetUniqueList.decorate(list);
        assertNotNull(uniqueList);
        assertEquals(2, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("b", uniqueList.get(1));
        assertTrue(uniqueList.set.contains("a"));
        assertTrue(uniqueList.set.contains("b"));
        // The list passed to decorate is modified to become the underlying list of SetUniqueList.
        // After decorate, the original list is empty.
        assertTrue(list.isEmpty());
    }
    
    @Test
    public void testConstructor_nullListAndSet() throws Exception {
        try {
            new SetUniqueList(null, new HashSet());
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        try {
            new SetUniqueList(new ArrayList<>(), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testAsSet() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        // The SetUniqueList constructor takes the list and the set. The set should be initialized with the list's elements.
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        Set setView = uniqueList.asSet();
        assertNotNull(setView);
        assertEquals(2, setView.size());
        assertTrue(setView.contains("a"));
        assertTrue(setView.contains("b"));
        try {
            setView.add("c");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testAdd_uniqueElement() throws Exception {
        List<Object> list = new ArrayList<>();
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>());
        assertTrue(uniqueList.add("a"));
        assertEquals(1, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertTrue(uniqueList.set.contains("a"));
    }

    @Test
    public void testAdd_duplicateElement() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        assertFalse(uniqueList.add("a"));
        assertEquals(1, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertTrue(uniqueList.set.contains("a"));
    }

    @Test
    public void testAdd_nullElement() throws Exception {
        List<Object> list = new ArrayList<>();
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>());
        assertTrue(uniqueList.add(null));
        assertEquals(1, uniqueList.size());
        assertNull(uniqueList.get(0));
        assertTrue(uniqueList.set.contains(null));
    }
    
    @Test
    public void testAdd_duplicateNullElement() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add(null);
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        assertFalse(uniqueList.add(null));
        assertEquals(1, uniqueList.size());
        assertNull(uniqueList.get(0));
        assertTrue(uniqueList.set.contains(null));
    }

    @Test
    public void testAdd_atIndex_uniqueElement() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("b");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        uniqueList.add(0, "a");
        assertEquals(2, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("b", uniqueList.get(1));
        assertTrue(uniqueList.set.contains("a"));
        assertTrue(uniqueList.set.contains("b"));
    }

    @Test
    public void testAdd_atIndex_duplicateElement() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        uniqueList.add(1, "a"); // try to add duplicate at index 1
        assertEquals(2, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("b", uniqueList.get(1));
        assertTrue(uniqueList.set.contains("a"));
        assertTrue(uniqueList.set.contains("b"));
    }
    
    @Test
    public void testAdd_atIndex_duplicateElementAtEnd() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        uniqueList.add(2, "a"); // try to add duplicate at index 2
        assertEquals(2, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("b", uniqueList.get(1));
        assertTrue(uniqueList.set.contains("a"));
        assertTrue(uniqueList.set.contains("b"));
    }

    @Test
    public void testAddAll_collection_uniqueElements() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        Collection<Object> coll = new ArrayList<>();
        coll.add("b");
        coll.add("c");
        assertTrue(uniqueList.addAll(coll));
        assertEquals(3, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("b", uniqueList.get(1));
        assertEquals("c", uniqueList.get(2));
        assertTrue(uniqueList.set.contains("a"));
        assertTrue(uniqueList.set.contains("b"));
        assertTrue(uniqueList.set.contains("c"));
    }

    @Test
    public void testAddAll_collection_withDuplicates() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        Collection<Object> coll = new ArrayList<>();
        coll.add("b");
        coll.add("a"); // duplicate from list
        coll.add("c");
        coll.add("b"); // duplicate from coll
        assertTrue(uniqueList.addAll(coll));
        // The addAll method iterates and calls add(index, object) for each element.
        // The add(index, object) method adds only if not already present.
        // So, "a" and "b" from the collection will not be added again.
        // The expected size is 3 (original "a" + "b" + "c").
        assertEquals(3, uniqueList.size()); 
        assertEquals("a", uniqueList.get(0));
        assertEquals("b", uniqueList.get(1));
        assertEquals("c", uniqueList.get(2));
        assertTrue(uniqueList.set.contains("a"));
        assertTrue(uniqueList.set.contains("b"));
        assertTrue(uniqueList.set.contains("c"));
    }

    @Test
    public void testAddAll_atIndex_collection_uniqueElements() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("c");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        Collection<Object> coll = new ArrayList<>();
        coll.add("a");
        coll.add("b");
        assertTrue(uniqueList.addAll(0, coll));
        assertEquals(3, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("b", uniqueList.get(1));
        assertEquals("c", uniqueList.get(2));
        assertTrue(uniqueList.set.contains("a"));
        assertTrue(uniqueList.set.contains("b"));
        assertTrue(uniqueList.set.contains("c"));
    }
    
    @Test
    public void testAddAll_atIndex_collection_withDuplicates() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("d");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        Collection<Object> coll = new ArrayList<>();
        coll.add("a");
        coll.add("b");
        coll.add("a"); // duplicate from coll
        coll.add("c");
        assertTrue(uniqueList.addAll(0, coll));
        // Only unique elements from the collection are added at the specified index.
        // "a" is added once, then "b", then "c". The duplicate "a" is ignored.
        // The original "d" remains at the end.
        assertEquals(4, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("b", uniqueList.get(1));
        assertEquals("c", uniqueList.get(2));
        assertEquals("d", uniqueList.get(3));
        assertTrue(uniqueList.set.contains("a"));
        assertTrue(uniqueList.set.contains("b"));
        assertTrue(uniqueList.set.contains("c"));
        assertTrue(uniqueList.set.contains("d"));
    }

    @Test
    public void testSet_replaceWithUnique() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        Object old = uniqueList.set(1, "c");
        assertEquals("b", old);
        assertEquals(2, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("c", uniqueList.get(1));
        assertTrue(uniqueList.set.contains("a"));
        assertTrue(uniqueList.set.contains("c"));
        assertFalse(uniqueList.set.contains("b"));
    }

    @Test
    public void testSet_replaceWithDuplicateAlreadyPresent() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        Object old = uniqueList.set(1, "a"); // replace "b" with "a"
        // The original "b" at index 1 is replaced by "a".
        // Since "a" was already present at index 0, the element at index 0 ("a") remains.
        // The duplicate "b" is removed from the list.
        assertEquals("b", old);
        assertEquals(2, uniqueList.size()); // "b" should be removed, list becomes ["a", "c"]
        assertEquals("a", uniqueList.get(0));
        assertEquals("c", uniqueList.get(1));
        assertTrue(uniqueList.set.contains("a"));
        assertTrue(uniqueList.set.contains("c"));
        assertFalse(uniqueList.set.contains("b"));
    }

    @Test
    public void testSet_replaceWithDuplicateAtSameIndex() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        Object old = uniqueList.set(0, "a"); // replace "a" with "a"
        // The element at index 0 is replaced by itself. No change in list or set.
        assertEquals("a", old);
        assertEquals(2, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("b", uniqueList.get(1));
        assertTrue(uniqueList.set.contains("a"));
        assertTrue(uniqueList.set.contains("b"));
    }
    
    @Test
    public void testSet_replaceWithNull() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        Object old = uniqueList.set(1, null); // replace "b" with null
        // "b" is removed from the list and the set. null is added to the list and the set.
        assertNull(old); // The object at index 1 was "b", which is returned.
        assertEquals(2, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertNull(uniqueList.get(1));
        assertTrue(uniqueList.set.contains("a"));
        assertTrue(uniqueList.set.contains(null));
        assertFalse(uniqueList.set.contains("b"));
    }

    @Test
    public void testRemove_object_present() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        assertTrue(uniqueList.remove("a"));
        assertEquals(1, uniqueList.size());
        assertEquals("b", uniqueList.get(0));
        assertFalse(uniqueList.set.contains("a"));
        assertTrue(uniqueList.set.contains("b"));
    }

    @Test
    public void testRemove_object_notPresent() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        assertFalse(uniqueList.remove("b"));
        assertEquals(1, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertTrue(uniqueList.set.contains("a"));
    }

    @Test
    public void testRemove_object_null_present() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add(null);
        list.add("a");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        assertTrue(uniqueList.remove(null));
        assertEquals(1, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertFalse(uniqueList.set.contains(null));
        assertTrue(uniqueList.set.contains("a"));
    }

    @Test
    public void testRemove_atIndex() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        Object removed = uniqueList.remove(1); // remove "b"
        assertEquals("b", removed);
        assertEquals(2, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("c", uniqueList.get(1));
        assertFalse(uniqueList.set.contains("b"));
        assertTrue(uniqueList.set.contains("a"));
        assertTrue(uniqueList.set.contains("c"));
    }

    @Test
    public void testRemove_atIndex_null() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add(null);
        list.add("a");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        Object removed = uniqueList.remove(0); // remove null
        assertNull(removed);
        assertEquals(1, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertFalse(uniqueList.set.contains(null));
        assertTrue(uniqueList.set.contains("a"));
    }

    @Test
    public void testRemoveAll_collection_present() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        Collection<Object> coll = new ArrayList<>();
        coll.add("b");
        coll.add("d");
        coll.add("e"); // not present
        assertTrue(uniqueList.removeAll(coll));
        assertEquals(2, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("c", uniqueList.get(1));
        assertTrue(uniqueList.set.contains("a"));
        assertTrue(uniqueList.set.contains("c"));
        assertFalse(uniqueList.set.contains("b"));
        assertFalse(uniqueList.set.contains("d"));
    }

    @Test
    public void testRemoveAll_emptyCollection() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        Collection<Object> coll = new ArrayList<>();
        assertFalse(uniqueList.removeAll(coll));
        assertEquals(2, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("b", uniqueList.get(1));
        assertTrue(uniqueList.set.contains("a"));
        assertTrue(uniqueList.set.contains("b"));
    }

    @Test
    public void testRetainAll_collection_present() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        Collection<Object> coll = new ArrayList<>();
        coll.add("b");
        coll.add("d");
        coll.add("e"); // not present
        assertTrue(uniqueList.retainAll(coll));
        assertEquals(2, uniqueList.size());
        assertEquals("b", uniqueList.get(0));
        assertEquals("d", uniqueList.get(1));
        assertTrue(uniqueList.set.contains("b"));
        assertTrue(uniqueList.set.contains("d"));
        assertFalse(uniqueList.set.contains("a"));
        assertFalse(uniqueList.set.contains("c"));
    }
    
    @Test
    public void testRetainAll_emptyCollection() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        Collection<Object> coll = new ArrayList<>();
        assertTrue(uniqueList.retainAll(coll));
        assertEquals(0, uniqueList.size());
        assertTrue(uniqueList.set.isEmpty());
    }

    @Test
    public void testClear() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        uniqueList.clear();
        assertEquals(0, uniqueList.size());
        assertTrue(uniqueList.set.isEmpty());
    }

    @Test
    public void testContains_present() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        assertTrue(uniqueList.contains("a"));
    }

    @Test
    public void testContains_notPresent() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        assertFalse(uniqueList.contains("b"));
    }
    
    @Test
    public void testContains_nullPresent() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add(null);
        list.add("a");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        assertTrue(uniqueList.contains(null));
    }

    @Test
    public void testContainsAll_present() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        Collection<Object> coll = new ArrayList<>();
        coll.add("a");
        coll.add("c");
        assertTrue(uniqueList.containsAll(coll));
    }

    @Test
    public void testContainsAll_notPresent() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        Collection<Object> coll = new ArrayList<>();
        coll.add("a");
        coll.add("c"); // not present
        assertFalse(uniqueList.containsAll(coll));
    }

    @Test
    public void testIterator_remove() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        Iterator it = uniqueList.iterator();
        it.next(); // "a"
        it.next(); // "b"
        it.remove(); // remove "b"
        assertEquals(2, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("c", uniqueList.get(1));
        assertFalse(uniqueList.set.contains("b"));
    }

    @Test
    public void testListIterator_remove() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        ListIterator it = uniqueList.listIterator();
        it.next(); // "a"
        it.next(); // "b"
        it.remove(); // remove "b"
        assertEquals(2, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("c", uniqueList.get(1));
        assertFalse(uniqueList.set.contains("b"));
    }

    @Test
    public void testListIterator_add_unique() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        ListIterator it = uniqueList.listIterator();
        it.next(); // "a"
        it.add("b"); // add "b" after "a"
        assertEquals(3, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("b", uniqueList.get(1));
        assertEquals("c", uniqueList.get(2));
        assertTrue(uniqueList.set.contains("b"));
    }

    @Test
    public void testListIterator_add_duplicate() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        ListIterator it = uniqueList.listIterator();
        it.next(); // "a"
        it.add("a"); // try to add duplicate "a"
        assertEquals(2, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("c", uniqueList.get(1));
        assertTrue(uniqueList.set.contains("a"));
        assertTrue(uniqueList.set.contains("c"));
    }

    @Test
    public void testListIterator_set_unsupported() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        ListIterator it = uniqueList.listIterator();
        try {
            it.set("b");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testSubList() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        List sub = uniqueList.subList(1, 3); // ["b", "c"]
        assertNotNull(sub);
        assertEquals(2, sub.size());
        assertEquals("b", sub.get(0));
        assertEquals("c", sub.get(1));

        // Test set on sublist - should affect the main list and set
        // sub.set(0, "d") replaces "b" with "d" in the sublist.
        // "b" is removed from the set. "d" is added to the set.
        // The underlying list is modified, so uniqueList changes.
        Object removed = sub.set(0, "d"); // replace "b" with "d"
        assertEquals("b", removed);
        assertEquals(2, uniqueList.size()); // "b" removed, "d" added, size remains 2. List is ["a", "d"]
        assertEquals("a", uniqueList.get(0));
        assertEquals("d", uniqueList.get(1));
        assertTrue(uniqueList.set.contains("d"));
        assertFalse(uniqueList.set.contains("b"));

        // Test remove on sublist
        // sub.remove(1) removes "c" from the sublist. "c" is removed from the set.
        // The underlying list is modified, so uniqueList changes.
        Object removedFromSub = sub.remove(1); // remove "c" (which is at index 1 of subList)
        assertEquals("c", removedFromSub);
        assertEquals(1, uniqueList.size()); // "c" removed. List is ["a"]
        assertEquals("a", uniqueList.get(0));
        assertFalse(uniqueList.set.contains("c"));
    }

    @Test
    public void testSubList_decorateWithSetUniqueList() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a"); // duplicate
        SetUniqueList uniqueList = SetUniqueList.decorate(list);
        
        // Get a sublist. The sublist is a view on the original list.
        // It should use the same underlying set.
        List subListRaw = uniqueList.subList(0, 2); // ["a", "b"]
        
        // When creating a new SetUniqueList from the sublist, it should reuse the original set.
        SetUniqueList subListUnique = new SetUniqueList((List) subListRaw, uniqueList.set);

        assertNotNull(subListUnique);
        assertEquals(2, subListUnique.size());
        assertEquals("a", subListUnique.get(0));
        assertEquals("b", subListUnique.get(1));
        
        // adding duplicate to sublist should not change the main list or the set
        subListUnique.add("a");
        assertEquals(2, uniqueList.size());
        assertEquals(2, subListUnique.size());
        assertTrue(uniqueList.set.contains("a"));
        assertTrue(uniqueList.set.contains("b"));
        
        // adding unique to sublist should change the main list and the set
        subListUnique.add("c");
        assertEquals(3, uniqueList.size());
        assertEquals("a", uniqueList.get(0));
        assertEquals("b", uniqueList.get(1));
        assertEquals("c", uniqueList.get(2));
        assertEquals(3, subListUnique.size());
        assertEquals("a", subListUnique.get(0));
        assertEquals("b", subListUnique.get(1));
        assertEquals("c", subListUnique.get(2));
        assertTrue(uniqueList.set.contains("c"));
    }

    @Test
    public void testNext_iterator() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        Iterator it = uniqueList.iterator();
        assertEquals("a", it.next());
        assertEquals("b", it.next());
    }
    
    @Test
    public void testPrevious_listIterator() throws Exception {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        SetUniqueList uniqueList = new SetUniqueList(list, new HashSet<>(list));
        ListIterator it = uniqueList.listIterator();
        it.next(); // a
        it.next(); // b
        assertEquals("b", it.previous());
        assertEquals("a", it.previous());
    }
}

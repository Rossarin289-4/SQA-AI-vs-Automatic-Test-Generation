package org.apache.commons.collections4.collection;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.BoundedCollection;
import org.apache.commons.collections4.queue.CircularFifoQueue;
import org.junit.Test;

public class UnmodifiableBoundedCollectionAI24Test {

    @Test
    public void testFactoryReturnsSameWhenAlreadyUnmodifiable() {
        BoundedCollection<String> original = new CircularFifoQueue<String>(3);
        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(original);

        assertNotNull(unmodifiable);
        BoundedCollection<String> secondWrap = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(unmodifiable);
        assertSame(unmodifiable, secondWrap);
    }

    @Test
    public void testFactoryUnwrapsNestedDecorators() {
        BoundedCollection<String> queue = new CircularFifoQueue<String>(5);
        queue.add("alpha");
        queue.add("beta");

        // Nest through SynchronizedCollection and then UnmodifiableCollection (AbstractCollectionDecorator)
        Collection<String> synchronizedColl = SynchronizedCollection.synchronizedCollection(queue);
        Collection<String> decoratedColl = UnmodifiableCollection.unmodifiableCollection(synchronizedColl);

        BoundedCollection<String> result = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(decoratedColl);
        assertNotNull(result);
        assertEquals(5, result.maxSize());
        assertEquals(2, result.size());
        assertTrue(result.contains("alpha"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryThrowsOnNullCollection() {
        Collection<String> nullColl = null;
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection(nullColl);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryThrowsOnNonBoundedCollection() {
        List<String> list = new ArrayList<String>();
        list.add("test");
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection(list);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddThrowsUnsupportedOperationException() {
        BoundedCollection<String> queue = new CircularFifoQueue<String>(2);
        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(queue);
        unmodifiable.add("newElement");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddAllThrowsUnsupportedOperationException() {
        BoundedCollection<String> queue = new CircularFifoQueue<String>(3);
        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(queue);
        unmodifiable.addAll(Arrays.asList("one", "two"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveThrowsUnsupportedOperationException() {
        BoundedCollection<String> queue = new CircularFifoQueue<String>(2);
        queue.add("element");
        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(queue);
        unmodifiable.remove("element");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveAllThrowsUnsupportedOperationException() {
        BoundedCollection<String> queue = new CircularFifoQueue<String>(2);
        queue.add("element");
        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(queue);
        unmodifiable.removeAll(Collections.singletonList("element"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRetainAllThrowsUnsupportedOperationException() {
        BoundedCollection<String> queue = new CircularFifoQueue<String>(2);
        queue.add("element");
        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(queue);
        unmodifiable.retainAll(Collections.singletonList("element"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClearThrowsUnsupportedOperationException() {
        BoundedCollection<String> queue = new CircularFifoQueue<String>(2);
        queue.add("element");
        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(queue);
        unmodifiable.clear();
    }

    @Test
    public void testIteratorIsUnmodifiable() {
        BoundedCollection<String> queue = new CircularFifoQueue<String>(2);
        queue.add("item1");
        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(queue);

        Iterator<String> it = unmodifiable.iterator();
        assertTrue(it.hasNext());
        assertEquals("item1", it.next());
        assertFalse(it.hasNext());

        try {
            it.remove();
            org.junit.Assert.fail("Iterator remove should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testReadMethodsDelegateCorrectly() {
        BoundedCollection<String> queue = new CircularFifoQueue<String>(3);
        queue.add("A");
        queue.add("B");

        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(queue);

        assertEquals(queue.maxSize(), unmodifiable.maxSize());
        assertEquals(queue.isFull(), unmodifiable.isFull());
        assertEquals(2, unmodifiable.size());
        assertFalse(unmodifiable.isEmpty());
        assertTrue(unmodifiable.contains("A"));
        assertFalse(unmodifiable.contains("Z"));
        assertTrue(unmodifiable.containsAll(Arrays.asList("A", "B")));
        assertFalse(unmodifiable.containsAll(Arrays.asList("A", "C")));

        Object[] array = unmodifiable.toArray();
        assertArrayEquals(new Object[]{"A", "B"}, array);

        String[] typedArray = unmodifiable.toArray(new String[2]);
        assertArrayEquals(new String[]{"A", "B"}, typedArray);
    }
}

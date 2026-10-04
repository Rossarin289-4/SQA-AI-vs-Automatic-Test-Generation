package org.apache.commons.collections4.collection;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.collections4.BoundedCollection;
import org.apache.commons.collections4.Unmodifiable;
import org.apache.commons.collections4.iterators.UnmodifiableIterator;

public class UnmodifiableBoundedCollectionTest {
    @Test
    public void testWrappingBoundedCollection() throws Exception {
        BoundedCollection<String> original = new ArrayBoundedCollection<String>(2);
        BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(original);
        assertEquals(2, wrapped.maxSize());
        assertSame(wrapped, UnmodifiableBoundedCollection.unmodifiableBoundedCollection(wrapped));
    }

    @Test
    public void testRejectsNullBoundedCollection() throws Exception {
        try {
            UnmodifiableBoundedCollection.unmodifiableBoundedCollection((BoundedCollection<String>) null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testIteratorReadsElements() throws Exception {
        BoundedCollection<String> original = new ArrayBoundedCollection<String>(2);
        original.add("a");
        BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(original);
        Iterator<String> iterator = wrapped.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorCannotRemove() throws Exception {
        BoundedCollection<String> original = new ArrayBoundedCollection<String>(2);
        original.add("a");
        Iterator<String> iterator =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(original).iterator();
        iterator.next();
        try {
            iterator.remove();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertEquals(1, original.size());
    }

    @Test
    public void testAddIsUnsupported() throws Exception {
        BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(
                        new ArrayBoundedCollection<String>(2));
        try {
            wrapped.add("a");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertEquals(0, wrapped.size());
    }

    @Test
    public void testAddAllIsUnsupported() throws Exception {
        BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(
                        new ArrayBoundedCollection<String>(2));
        Collection<String> values = new ArrayBoundedCollection<String>(2);
        values.add("a");
        try {
            wrapped.addAll(values);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertEquals(0, wrapped.size());
    }

    @Test
    public void testClearIsUnsupported() throws Exception {
        BoundedCollection<String> original = new ArrayBoundedCollection<String>(2);
        original.add("a");
        BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(original);
        try {
            wrapped.clear();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertEquals(1, original.size());
    }

    @Test
    public void testRemoveIsUnsupported() throws Exception {
        BoundedCollection<String> original = new ArrayBoundedCollection<String>(2);
        original.add("a");
        BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(original);
        try {
            wrapped.remove("a");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertEquals(1, original.size());
    }

    @Test
    public void testRemoveAllIsUnsupported() throws Exception {
        BoundedCollection<String> original = new ArrayBoundedCollection<String>(2);
        original.add("a");
        BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(original);
        try {
            wrapped.removeAll(original);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertEquals(1, original.size());
    }

    @Test
    public void testRetainAllIsUnsupported() throws Exception {
        BoundedCollection<String> original = new ArrayBoundedCollection<String>(2);
        original.add("a");
        BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(original);
        try {
            wrapped.retainAll(original);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertEquals(1, original.size());
    }

    @Test
    public void testIsFullWhenCapacityReached() throws Exception {
        BoundedCollection<String> original = new ArrayBoundedCollection<String>(1);
        original.add("a");
        BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(original);
        assertTrue(wrapped.isFull());
    }

    @Test
    public void testIsNotFullBelowCapacity() throws Exception {
        BoundedCollection<String> original = new ArrayBoundedCollection<String>(2);
        original.add("a");
        BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(original);
        assertFalse(wrapped.isFull());
    }

    @Test
    public void testMaxSizeAtZeroCapacity() throws Exception {
        BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(
                        new ArrayBoundedCollection<String>(0));
        assertEquals(0, wrapped.maxSize());
    }

    @Test
    public void testMaxSizeAtPositiveCapacity() throws Exception {
        BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(
                        new ArrayBoundedCollection<String>(3));
        assertEquals(3, wrapped.maxSize());
    }

    @Test
    public void testFactoryDrillsThroughSynchronizedCollection() throws Exception {
        BoundedCollection<String> original = new ArrayBoundedCollection<String>(2);
        original.add("a");
        Collection<String> synchronizedView = SynchronizedCollection.synchronizedCollection(original);
        BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(synchronizedView);
        assertEquals(1, wrapped.size());
        assertEquals(2, wrapped.maxSize());
    }

    @Test
    public void testFactoryAcceptsAlreadyBoundedCollection() throws Exception {
        BoundedCollection<String> original = new ArrayBoundedCollection<String>(1);
        original.add("a");
        BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection((Collection<String>) original);
        assertEquals(1, wrapped.size());
        assertEquals(1, wrapped.maxSize());
    }

    @Test
    public void testUnmodifiableMarkerIsImplemented() throws Exception {
        BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(
                        new ArrayBoundedCollection<String>(1));
        assertTrue(wrapped instanceof Unmodifiable);
    }

    private static final class ArrayBoundedCollection<E> implements BoundedCollection<E> {
        private final int limit;
        private final java.util.ArrayList<E> values = new java.util.ArrayList<E>();

        ArrayBoundedCollection(int limit) {
            this.limit = limit;
        }

        public boolean isFull() {
            return values.size() >= limit;
        }

        public int maxSize() {
            return limit;
        }

        public int size() {
            return values.size();
        }

        public boolean isEmpty() {
            return values.isEmpty();
        }

        public boolean contains(Object value) {
            return values.contains(value);
        }

        public Iterator<E> iterator() {
            return values.iterator();
        }

        public Object[] toArray() {
            return values.toArray();
        }

        public <T> T[] toArray(T[] array) {
            return values.toArray(array);
        }

        public boolean add(E value) {
            if (isFull()) {
                return false;
            }
            return values.add(value);
        }

        public boolean remove(Object value) {
            return values.remove(value);
        }

        public boolean containsAll(Collection<?> collection) {
            return values.containsAll(collection);
        }

        public boolean addAll(Collection<? extends E> collection) {
            boolean changed = false;
            for (E value : collection) {
                if (!add(value)) {
                    break;
                }
                changed = true;
            }
            return changed;
        }

        public boolean removeAll(Collection<?> collection) {
            return values.removeAll(collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return values.retainAll(collection);
        }

        public void clear() {
            values.clear();
        }
    }
}

```java
package org.apache.commons.collections4.collection;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import org.apache.commons.collections4.BoundedCollection;
import org.apache.commons.collections4.Unmodifiable;
import org.apache.commons.collections4.iterators.UnmodifiableIterator;

public class UnmodifiableBoundedCollectionTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testUnmodifiableBoundedCollectionFactoryWithNull() {
        try {
            UnmodifiableBoundedCollection.unmodifiableBoundedCollection((BoundedCollection<?>) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        try {
            UnmodifiableBoundedCollection.unmodifiableBoundedCollection((Collection<?>) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testUnmodifiableBoundedCollectionFactoryWithUnmodifiable() {
        BoundedCollection<String> mockBoundedCollection = new MockBoundedCollection<>();
        BoundedCollection<String> result = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBoundedCollection);
        assertSame(mockBoundedCollection, result);
    }

    @Test
    public void testUnmodifiableBoundedCollectionFactoryWithDecorator() {
        BoundedCollection<String> mockBoundedCollection = new MockBoundedCollection<>();
        AbstractCollectionDecorator<String> decorator = new AbstractCollectionDecorator<String>(mockBoundedCollection) {};
        BoundedCollection<String> result = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(decorator);
        assertNotSame(decorator, result);
        assertTrue(result instanceof UnmodifiableBoundedCollection);
    }
    
    @Test
    public void testUnmodifiableBoundedCollectionFactoryWithSynchronizedCollection() {
        BoundedCollection<String> mockBoundedCollection = new MockBoundedCollection<>();
        SynchronizedCollection<String> synchronizedCollection = SynchronizedCollection.synchronizedCollection(mockBoundedCollection);
        BoundedCollection<String> result = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(synchronizedCollection);
        assertNotSame(synchronizedCollection, result);
        assertTrue(result instanceof UnmodifiableBoundedCollection);
    }

    @Test
    public void testUnmodifiableBoundedCollectionFactoryWithNonBoundedCollection() {
        Collection<String> collection = new ArrayList<>();
        try {
            UnmodifiableBoundedCollection.unmodifiableBoundedCollection(collection);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    // The private constructor is not directly testable. We test its usage via the factory method.
    // However, to test the core functionality of the UnmodifiableBoundedCollection itself,
    // we'll create an instance using the public factory method.
    
    @Test
    public void testIterator() {
        BoundedCollection<String> mockBoundedCollection = new MockBoundedCollection<>();
        mockBoundedCollection.add("a");
        mockBoundedCollection.add("b");
        // Use the factory method to get an instance
        BoundedCollection<String> ubc = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBoundedCollection);
        Iterator<String> it = ubc.iterator();
        assertNotNull(it);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
        assertTrue(it instanceof UnmodifiableIterator);
    }

    @Test
    public void testAdd() {
        BoundedCollection<String> mockBoundedCollection = new MockBoundedCollection<>();
        // Use the factory method to get an instance
        BoundedCollection<String> ubc = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBoundedCollection);
        try {
            ubc.add("test");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testAddAll() {
        BoundedCollection<String> mockBoundedCollection = new MockBoundedCollection<>();
        // Use the factory method to get an instance
        BoundedCollection<String> ubc = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBoundedCollection);
        Collection<String> coll = new ArrayList<>();
        coll.add("test");
        try {
            ubc.addAll(coll);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testClear() {
        BoundedCollection<String> mockBoundedCollection = new MockBoundedCollection<>();
        mockBoundedCollection.add("a");
        // Use the factory method to get an instance
        BoundedCollection<String> ubc = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBoundedCollection);
        try {
            ubc.clear();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        // Ensure decorated collection is unchanged
        assertEquals(1, mockBoundedCollection.size());
    }

    @Test
    public void testRemove() {
        BoundedCollection<String> mockBoundedCollection = new MockBoundedCollection<>();
        mockBoundedCollection.add("a");
        // Use the factory method to get an instance
        BoundedCollection<String> ubc = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBoundedCollection);
        try {
            ubc.remove("a");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        // Ensure decorated collection is unchanged
        assertEquals(1, mockBoundedCollection.size());
    }

    @Test
    public void testRemoveAll() {
        BoundedCollection<String> mockBoundedCollection = new MockBoundedCollection<>();
        mockBoundedCollection.add("a");
        mockBoundedCollection.add("b");
        // Use the factory method to get an instance
        BoundedCollection<String> ubc = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBoundedCollection);
        Collection<String> coll = new ArrayList<>();
        coll.add("a");
        try {
            ubc.removeAll(coll);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        // Ensure decorated collection is unchanged
        assertEquals(2, mockBoundedCollection.size());
    }

    @Test
    public void testRetainAll() {
        BoundedCollection<String> mockBoundedCollection = new MockBoundedCollection<>();
        mockBoundedCollection.add("a");
        mockBoundedCollection.add("b");
        // Use the factory method to get an instance
        BoundedCollection<String> ubc = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBoundedCollection);
        Collection<String> coll = new ArrayList<>();
        coll.add("a");
        try {
            ubc.retainAll(coll);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        // Ensure decorated collection is unchanged
        assertEquals(2, mockBoundedCollection.size());
    }

    @Test
    public void testIsFull_WhenNotFull() {
        BoundedCollection<String> mockBoundedCollection = new MockBoundedCollection<>(5);
        mockBoundedCollection.add("a");
        // Use the factory method to get an instance
        BoundedCollection<String> ubc = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBoundedCollection);
        assertFalse(ubc.isFull());
    }

    @Test
    public void testIsFull_WhenFull() {
        BoundedCollection<String> mockBoundedCollection = new MockBoundedCollection<>(1);
        mockBoundedCollection.add("a");
        // Use the factory method to get an instance
        BoundedCollection<String> ubc = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBoundedCollection);
        assertTrue(ubc.isFull());
    }

    @Test
    public void testMaxSize() {
        BoundedCollection<String> mockBoundedCollection = new MockBoundedCollection<>(10);
        // Use the factory method to get an instance
        BoundedCollection<String> ubc = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBoundedCollection);
        assertEquals(10, ubc.maxSize());
    }
    
    @Test
    public void testMaxSize_Zero() {
        BoundedCollection<String> mockBoundedCollection = new MockBoundedCollection<>(0);
        // Use the factory method to get an instance
        BoundedCollection<String> ubc = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBoundedCollection);
        assertEquals(0, ubc.maxSize());
    }

    // Helper Mock implementation of BoundedCollection for testing
    // This mock must be static to be used within static methods if it were used there,
    // but since it's used within test methods, it can be non-static.
    // However, to avoid issues with nested static classes and compilation,
    // it's better to keep it static if it doesn't rely on outer class instance.
    private static class MockBoundedCollection<E> extends AbstractCollectionDecorator<E> implements BoundedCollection<E> {
        private final int maxSize;
        private final Collection<E> delegate;

        public MockBoundedCollection() {
            this(Integer.MAX_VALUE);
        }

        public MockBoundedCollection(int maxSize) {
            this.maxSize = maxSize;
            this.delegate = new ArrayList<>();
        }

        @Override
        protected Collection<E> decorated() {
            return delegate;
        }

        @Override
        public boolean add(E object) {
            if (size() >= maxSize) {
                return false;
            }
            return delegate.add(object);
        }

        @Override
        public boolean isFull() {
            return size() >= maxSize;
        }

        @Override
        public int maxSize() {
            return maxSize;
        }
    }
}
```
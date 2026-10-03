package org.apache.commons.collections4.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.BoundedCollection;
import org.apache.commons.collections4.queue.CircularFifoQueue;
import org.apache.commons.collections4.list.FixedSizeList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class UnmodifiableBoundedCollectionAI24Test {

    private interface Action {
        void run();
    }

    private BoundedCollection<String> newQueue(final String... values) {
        final CircularFifoQueue<String> queue = new CircularFifoQueue<String>(5);
        for (final String value : values) {
            queue.add(value);
        }
        return queue;
    }

    private void assertUnsupported(final Action action) {
        try {
            action.run();
            fail("Expected UnsupportedOperationException");
        } catch (final UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testDelegatesBoundedPropertiesAndReadOperations() {
        final List<String> list = new ArrayList<String>(Arrays.asList("one", "two", "three"));
        final BoundedCollection<String> fixed = FixedSizeList.fixedSizeList(list);
        final BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(fixed);

        assertTrue(wrapped.isFull());
        assertEquals(3, wrapped.maxSize());
        assertEquals(3, wrapped.size());
        assertTrue(wrapped.contains("two"));
        assertEquals(Arrays.asList("one", "two", "three"), new ArrayList<String>(wrapped));
    }

    @Test
    public void testWrapperReflectsChangesMadeToUnderlyingCollection() {
        final BoundedCollection<String> queue = newQueue("first");
        final BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(queue);

        ((CircularFifoQueue<String>) queue).add("second");

        assertEquals(2, wrapped.size());
        assertTrue(wrapped.contains("second"));
        assertEquals(Arrays.asList("first", "second"), new ArrayList<String>(wrapped));
    }

    @Test
    public void testAllCollectionMutatorsAreUnsupported() {
        final BoundedCollection<String> queue = newQueue("one", "two");
        final BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(queue);

        assertUnsupported(new Action() {
            public void run() {
                wrapped.add("three");
            }
        });
        assertUnsupported(new Action() {
            public void run() {
                wrapped.addAll(Arrays.asList("three", "four"));
            }
        });
        assertUnsupported(new Action() {
            public void run() {
                wrapped.remove("one");
            }
        });
        assertUnsupported(new Action() {
            public void run() {
                wrapped.removeAll(Arrays.asList("one", "other"));
            }
        });
        assertUnsupported(new Action() {
            public void run() {
                wrapped.retainAll(Arrays.asList("one"));
            }
        });
        assertUnsupported(new Action() {
            public void run() {
                wrapped.clear();
            }
        });

        assertEquals(Arrays.asList("one", "two"), new ArrayList<String>(queue));
    }

    @Test
    public void testIteratorProvidesElementsButCannotRemove() {
        final BoundedCollection<String> queue = newQueue("alpha", "beta");
        final BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(queue);

        final Iterator<String> iterator = wrapped.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("alpha", iterator.next());
        assertUnsupported(new Action() {
            public void run() {
                iterator.remove();
            }
        });
        assertTrue(iterator.hasNext());
        assertEquals("beta", iterator.next());
        assertFalse(iterator.hasNext());
        assertEquals(2, queue.size());
    }

    @Test
    public void testBoundedFactoryReturnsSameAlreadyUnmodifiableInstance() {
        final BoundedCollection<String> original =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(newQueue("value"));

        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(original);

        assertSame(original, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCollectionFactoryRejectsUnboundedCollection() {
        final Collection<String> ordinary = new ArrayList<String>(Arrays.asList("a", "b"));

        UnmodifiableBoundedCollection.unmodifiableBoundedCollection(ordinary);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCollectionFactoryRejectsNull() {
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection((Collection<String>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBoundedFactoryRejectsNull() {
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection((BoundedCollection<String>) null);
    }
}

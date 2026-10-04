package org.apache.commons.collections.buffer;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections.Buffer;
import org.apache.commons.collections.BufferUnderflowException;

public class UnboundedFifoBufferTest {
    @Test
    public void testNewBufferIsEmpty() throws Exception {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        assertEquals(0, buffer.size());
        assertTrue(buffer.isEmpty());
    }

    @Test
    public void testRejectsZeroInitialSize() throws Exception {
        try {
            new UnboundedFifoBuffer(0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testRejectsNegativeInitialSize() throws Exception {
        try {
            new UnboundedFifoBuffer(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testInitialSizeOneAndSingleAddition() throws Exception {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(1);
        assertTrue(buffer.add("x"));
        assertEquals(1, buffer.size());
        assertEquals("x", buffer.get());
    }

    @Test
    public void testAddRejectsNull() throws Exception {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        try {
            buffer.add(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
        assertEquals(0, buffer.size());
    }

    @Test
    public void testGetDoesNotRemoveElement() throws Exception {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(1);
        buffer.add("x");
        assertEquals("x", buffer.get());
        assertEquals(1, buffer.size());
        assertEquals("x", buffer.get());
    }

    @Test
    public void testGetOnEmptyBufferUnderflows() throws Exception {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        try {
            buffer.get();
            fail("expected BufferUnderflowException");
        } catch (BufferUnderflowException expected) {
        }
        assertEquals(0, buffer.size());
    }

    @Test
    public void testRemoveOnEmptyBufferUnderflows() throws Exception {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        try {
            buffer.remove();
            fail("expected BufferUnderflowException");
        } catch (BufferUnderflowException expected) {
        }
        assertTrue(buffer.isEmpty());
    }

    @Test
    public void testRemoveReturnsElementsInFifoOrder() throws Exception {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(2);
        assertTrue(buffer.add("a"));
        assertTrue(buffer.add("b"));
        assertEquals("a", buffer.remove());
        assertEquals("b", buffer.remove());
        assertEquals(0, buffer.size());
    }

    @Test
    public void testGrowthPreservesElementsInOrder() throws Exception {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(1);
        buffer.add("a");
        buffer.add("b");
        buffer.add("c");
        assertEquals(3, buffer.size());
        assertEquals("a", buffer.remove());
        assertEquals("b", buffer.remove());
        assertEquals("c", buffer.remove());
    }

    @Test
    public void testWraparoundPreservesFifoOrder() throws Exception {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(2);
        buffer.add("a");
        buffer.add("b");
        assertEquals("a", buffer.remove());
        buffer.add("c");
        assertEquals("b", buffer.remove());
        assertEquals("c", buffer.remove());
        assertTrue(buffer.isEmpty());
    }

    @Test
    public void testIteratorReturnsElementsInOrder() throws Exception {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(2);
        buffer.add("a");
        buffer.add("b");
        Iterator iterator = buffer.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorNextPastEndThrows() throws Exception {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        Iterator iterator = buffer.iterator();
        try {
            iterator.next();
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
        }
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorRemoveFirstElement() throws Exception {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(2);
        buffer.add("a");
        buffer.add("b");
        Iterator iterator = buffer.iterator();
        assertEquals("a", iterator.next());
        iterator.remove();
        assertEquals(1, buffer.size());
        assertEquals("b", buffer.get());
    }

    @Test
    public void testIteratorRemoveMiddleElement() throws Exception {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(3);
        buffer.add("a");
        buffer.add("b");
        buffer.add("c");
        Iterator iterator = buffer.iterator();
        assertEquals("a", iterator.next());
        assertEquals("b", iterator.next());
        iterator.remove();
        assertEquals(2, buffer.size());
        assertEquals("a", buffer.remove());
        assertEquals("c", buffer.remove());
    }

    @Test
    public void testIteratorRemoveAfterWraparound() throws Exception {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(3);
        buffer.add("a");
        buffer.add("b");
        buffer.add("c");
        assertEquals("a", buffer.remove());
        buffer.add("d");
        Iterator iterator = buffer.iterator();
        assertEquals("b", iterator.next());
        assertEquals("c", iterator.next());
        iterator.remove();
        assertEquals("d", iterator.next());
        assertFalse(iterator.hasNext());
        assertEquals(2, buffer.size());
        assertEquals("b", buffer.remove());
        assertEquals("d", buffer.remove());
    }

    @Test
    public void testIteratorRemoveBeforeNextThrows() throws Exception {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add("a");
        Iterator iterator = buffer.iterator();
        try {
            iterator.remove();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
        assertEquals(1, buffer.size());
    }

    @Test
    public void testIteratorCannotRemoveTwiceForOneNext() throws Exception {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add("a");
        Iterator iterator = buffer.iterator();
        assertEquals("a", iterator.next());
        iterator.remove();
        try {
            iterator.remove();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
        assertEquals(0, buffer.size());
    }
}

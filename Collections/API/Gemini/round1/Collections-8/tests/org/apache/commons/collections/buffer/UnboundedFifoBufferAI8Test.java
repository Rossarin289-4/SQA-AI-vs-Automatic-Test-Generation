package org.apache.commons.collections.buffer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.apache.commons.collections.BufferUnderflowException;
import org.junit.Assert;
import org.junit.Test;

public class UnboundedFifoBufferAI8Test {

    @Test
    public void testDefaultConstructor() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        Assert.assertTrue(buffer.isEmpty());
        Assert.assertEquals(0, buffer.size());
        // default capacity is 32, buffer array length is 33
        Assert.assertEquals(33, buffer.buffer.length);
    }

    @Test
    public void testCustomConstructor() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(5);
        Assert.assertTrue(buffer.isEmpty());
        Assert.assertEquals(0, buffer.size());
        Assert.assertEquals(6, buffer.buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorZeroSize() {
        new UnboundedFifoBuffer(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNegativeSize() {
        new UnboundedFifoBuffer(-1);
    }

    @Test(expected = NullPointerException.class)
    public void testAddNullThrowsException() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add(null);
    }

    @Test(expected = BufferUnderflowException.class)
    public void testGetOnEmptyBufferThrowsException() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.get();
    }

    @Test(expected = BufferUnderflowException.class)
    public void testRemoveOnEmptyBufferThrowsException() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.remove();
    }

    @Test
    public void testAddGetRemoveFifoOrder() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(2);
        buffer.add("A");
        buffer.add("B");

        Assert.assertFalse(buffer.isEmpty());
        Assert.assertEquals(2, buffer.size());
        Assert.assertEquals("A", buffer.get());

        Assert.assertEquals("A", buffer.remove());
        Assert.assertEquals(1, buffer.size());
        Assert.assertEquals("B", buffer.get());

        Assert.assertEquals("B", buffer.remove());
        Assert.assertTrue(buffer.isEmpty());
        Assert.assertEquals(0, buffer.size());
    }

    @Test
    public void testBufferExpansionAndWraparound() {
        // Initial buffer capacity = 2, internal array length = 3
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(2);
        buffer.add("A");
        buffer.add("B");

        // Remove one element to shift head: head=1, tail=2, size=1
        Assert.assertEquals("A", buffer.remove());
        // Add another element to cause wraparound: tail wraps to 0
        buffer.add("C");
        Assert.assertEquals(2, buffer.size());
        Assert.assertTrue(buffer.tail < buffer.head);

        // Adding a third element forces expansion when size() + 1 >= buffer.length
        buffer.add("D");
        // ((3 - 1) * 2) + 1 = 5
        Assert.assertEquals(5, buffer.buffer.length);
        Assert.assertEquals(3, buffer.size());

        // Elements should remain in FIFO order: B, C, D
        Assert.assertEquals("B", buffer.remove());
        Assert.assertEquals("C", buffer.remove());
        Assert.assertEquals("D", buffer.remove());
        Assert.assertTrue(buffer.isEmpty());
    }

    @Test
    public void testIteratorTraversalAndNoSuchElementException() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(4);
        buffer.add("1");
        buffer.add("2");
        buffer.add("3");

        Iterator it = buffer.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("1", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("2", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("3", it.next());
        Assert.assertFalse(it.hasNext());

        try {
            it.next();
            Assert.fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
        }
    }

    @Test
    public void testIteratorRemove() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(5);
        buffer.add("A");
        buffer.add("B");
        buffer.add("C");
        buffer.add("D");

        Iterator it = buffer.iterator();

        // IllegalStateException if remove called before next
        try {
            it.remove();
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }

        // Remove first element (lastReturnedIndex == head branch)
        Assert.assertEquals("A", it.next());
        it.remove();
        Assert.assertEquals(3, buffer.size());
        Assert.assertEquals("B", buffer.get());

        // Consecutive remove should fail
        try {
            it.remove();
            Assert.fail("Expected IllegalStateException on second remove");
        } catch (IllegalStateException e) {
            // expected
        }

        // Remove intermediate element (shifting subsequent elements)
        Assert.assertEquals("B", it.next());
        Assert.assertEquals("C", it.next());
        it.remove(); // removes "C"
        Assert.assertEquals(2, buffer.size());

        // Remaining elements should be "B" and "D"
        Assert.assertEquals("B", buffer.remove());
        Assert.assertEquals("D", buffer.remove());
        Assert.assertTrue(buffer.isEmpty());
    }

    @Test
    public void testSerialization() throws Exception {
        UnboundedFifoBuffer original = new UnboundedFifoBuffer(4);
        original.add("First");
        original.add("Second");
        original.add("Third");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        UnboundedFifoBuffer deserialized = (UnboundedFifoBuffer) ois.readObject();
        ois.close();

        Assert.assertEquals(original.size(), deserialized.size());
        Assert.assertEquals("First", deserialized.remove());
        Assert.assertEquals("Second", deserialized.remove());
        Assert.assertEquals("Third", deserialized.remove());
        Assert.assertTrue(deserialized.isEmpty());
    }
}

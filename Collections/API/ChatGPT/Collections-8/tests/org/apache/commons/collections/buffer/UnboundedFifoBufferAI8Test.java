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

    @Test(expected = IllegalArgumentException.class)
    public void constructorRejectsZeroInitialSize() {
        new UnboundedFifoBuffer(0);
    }

    @Test
    public void addGetAndRemoveFollowFifoOrder() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(2);

        Assert.assertTrue(buffer.isEmpty());
        Assert.assertTrue(buffer.add("first"));
        Assert.assertTrue(buffer.add("second"));
        Assert.assertEquals(2, buffer.size());
        Assert.assertEquals("first", buffer.get());

        Assert.assertEquals("first", buffer.remove());
        Assert.assertEquals(1, buffer.size());
        Assert.assertEquals("second", buffer.get());
        Assert.assertEquals("second", buffer.remove());
        Assert.assertTrue(buffer.isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void addRejectsNullElements() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add(null);
    }

    @Test(expected = BufferUnderflowException.class)
    public void getOnEmptyBufferThrowsUnderflow() {
        new UnboundedFifoBuffer().get();
    }

    @Test(expected = BufferUnderflowException.class)
    public void removeOnEmptyBufferThrowsUnderflow() {
        new UnboundedFifoBuffer().remove();
    }

    @Test
    public void wrapAroundAndGrowthPreserveAllElementsInOrder() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(3);

        buffer.add("one");
        buffer.add("two");
        buffer.add("three");
        Assert.assertEquals("one", buffer.remove());
        Assert.assertEquals("two", buffer.remove());

        buffer.add("four");
        buffer.add("five");
        buffer.add("six");

        Assert.assertEquals(4, buffer.size());
        Assert.assertEquals("three", buffer.remove());
        Assert.assertEquals("four", buffer.remove());
        Assert.assertEquals("five", buffer.remove());
        Assert.assertEquals("six", buffer.remove());
        Assert.assertTrue(buffer.isEmpty());
    }

    @Test
    public void iteratorTraversesFifoOrderAndThrowsAfterEnd() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add("a");
        buffer.add("b");
        buffer.add("c");

        Iterator iterator = buffer.iterator();
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("a", iterator.next());
        Assert.assertEquals("b", iterator.next());
        Assert.assertEquals("c", iterator.next());
        Assert.assertFalse(iterator.hasNext());

        try {
            iterator.next();
            Assert.fail("Expected NoSuchElementException after iterator end");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(3, buffer.size());
        }
    }

    @Test
    public void iteratorCanRemoveHeadAndContinuesWithFollowingElement() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add("first");
        buffer.add("second");
        buffer.add("third");

        Iterator iterator = buffer.iterator();
        Assert.assertEquals("first", iterator.next());
        iterator.remove();

        Assert.assertEquals(2, buffer.size());
        Assert.assertEquals("second", buffer.get());
        Assert.assertEquals("second", iterator.next());
        Assert.assertEquals("second", buffer.remove());
        Assert.assertEquals("third", buffer.remove());
        Assert.assertTrue(buffer.isEmpty());
    }

    @Test
    public void iteratorRemovingMiddleElementShiftsRemainingElementsCorrectly() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add("one");
        buffer.add("two");
        buffer.add("three");
        buffer.add("four");

        Iterator iterator = buffer.iterator();
        Assert.assertEquals("one", iterator.next());
        Assert.assertEquals("two", iterator.next());
        iterator.remove();

        Assert.assertEquals(3, buffer.size());
        Assert.assertEquals("three", iterator.next());
        Assert.assertEquals("four", iterator.next());

        Assert.assertEquals("one", buffer.remove());
        Assert.assertEquals("three", buffer.remove());
        Assert.assertEquals("four", buffer.remove());
        Assert.assertTrue(buffer.isEmpty());
    }

    @Test
    public void iteratorRemoveBeforeNextThrowsIllegalStateException() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add("item");

        try {
            buffer.iterator().remove();
            Assert.fail("Expected IllegalStateException before next()");
        } catch (IllegalStateException expected) {
            Assert.assertEquals(1, buffer.size());
            Assert.assertEquals("item", buffer.get());
        }
    }

    @Test
    public void serializationRestoresContentsAndFifoBehavior() throws Exception {
        UnboundedFifoBuffer original = new UnboundedFifoBuffer(2);
        original.add("red");
        original.add("green");
        original.add("blue");
        Assert.assertEquals("red", original.remove());
        original.add("yellow");

        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        ObjectOutputStream output = new ObjectOutputStream(bytes);
        output.writeObject(original);
        output.close();

        ObjectInputStream input = new ObjectInputStream(
                new ByteArrayInputStream(bytes.toByteArray()));
        UnboundedFifoBuffer restored = (UnboundedFifoBuffer) input.readObject();
        input.close();

        Assert.assertEquals(3, restored.size());
        Assert.assertEquals("green", restored.remove());
        Assert.assertEquals("blue", restored.remove());
        Assert.assertEquals("yellow", restored.remove());
        Assert.assertTrue(restored.isEmpty());
    }
}

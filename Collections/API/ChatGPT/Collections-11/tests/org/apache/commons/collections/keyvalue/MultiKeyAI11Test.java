package org.apache.commons.collections.keyvalue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.junit.Assert;
import org.junit.Test;

public class MultiKeyAI11Test {

    @Test
    public void twoKeyConstructorExposesKeysAndSize() {
        MultiKey key = new MultiKey("left", Integer.valueOf(12));

        Assert.assertEquals(2, key.size());
        Assert.assertEquals("left", key.getKey(0));
        Assert.assertEquals(Integer.valueOf(12), key.getKey(1));
    }

    @Test
    public void higherArityConstructorsPreserveAllKeys() {
        MultiKey three = new MultiKey("a", "b", "c");
        MultiKey four = new MultiKey("a", "b", "c", "d");
        MultiKey five = new MultiKey("a", "b", "c", "d", "e");

        Assert.assertEquals(3, three.size());
        Assert.assertEquals("c", three.getKey(2));
        Assert.assertEquals(4, four.size());
        Assert.assertEquals("d", four.getKey(3));
        Assert.assertEquals(5, five.size());
        Assert.assertEquals("e", five.getKey(4));
    }

    @Test
    public void arrayConstructorClonesProvidedArray() {
        Object[] source = new Object[] { "original", Integer.valueOf(3) };
        MultiKey key = new MultiKey(source);

        source[0] = "changed";
        source[1] = Integer.valueOf(9);

        Assert.assertEquals("original", key.getKey(0));
        Assert.assertEquals(Integer.valueOf(3), key.getKey(1));
        Assert.assertEquals("original".hashCode() ^ Integer.valueOf(3).hashCode(),
                key.hashCode());
    }

    @Test
    public void getKeysReturnsIndependentArray() {
        MultiKey key = new MultiKey("one", "two");
        Object[] returned = key.getKeys();

        returned[0] = "replacement";

        Assert.assertEquals("one", key.getKey(0));
        Assert.assertEquals("two", key.getKey(1));
        Assert.assertNotSame(returned, key.getKeys());
    }

    @Test
    public void nonCloningArrayConstructorCreatesEquivalentKey() {
        Object[] source = new Object[] { "north", "south", "east" };
        MultiKey key = new MultiKey(source, false);

        Assert.assertEquals(3, key.size());
        Assert.assertEquals("north", key.getKey(0));
        Assert.assertEquals(new MultiKey("north", "south", "east"), key);
    }

    @Test
    public void equalityRequiresSameOrderedKeysAndCompatibleType() {
        MultiKey first = new MultiKey("x", Integer.valueOf(4), null);
        MultiKey same = new MultiKey("x", Integer.valueOf(4), null);
        MultiKey reordered = new MultiKey(Integer.valueOf(4), "x", null);
        MultiKey shorter = new MultiKey("x", Integer.valueOf(4));

        Assert.assertTrue(first.equals(first));
        Assert.assertTrue(first.equals(same));
        Assert.assertEquals(first.hashCode(), same.hashCode());
        Assert.assertFalse(first.equals(reordered));
        Assert.assertFalse(first.equals(shorter));
        Assert.assertFalse(first.equals("x"));
    }

    @Test
    public void hashCodeXorsNonNullKeyHashes() {
        MultiKey key = new MultiKey("alpha", null, Integer.valueOf(7));

        int expected = "alpha".hashCode() ^ Integer.valueOf(7).hashCode();
        Assert.assertEquals(expected, key.hashCode());
    }

    @Test
    public void toStringIncludesKeysInOrder() {
        MultiKey key = new MultiKey("alpha", null, Integer.valueOf(7));

        Assert.assertEquals("MultiKey[alpha, null, 7]", key.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getKeyRejectsIndexPastEnd() {
        new MultiKey("only", "two").getKey(2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void arrayConstructorRejectsNullArray() {
        new MultiKey((Object[]) null);
    }

    @Test
    public void deserializationRecalculatesCachedHashCode() throws Exception {
        MutableHashKey component = new MutableHashKey(5);
        MultiKey original = new MultiKey(component, "stable");
        component.hash = 17;

        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        ObjectOutputStream output = new ObjectOutputStream(bytes);
        output.writeObject(original);
        output.close();

        ObjectInputStream input = new ObjectInputStream(
                new ByteArrayInputStream(bytes.toByteArray()));
        MultiKey restored = (MultiKey) input.readObject();
        input.close();

        Assert.assertEquals(17 ^ "stable".hashCode(), restored.hashCode());
        Assert.assertEquals(2, restored.size());
    }

    private static final class MutableHashKey implements Serializable {
        private static final long serialVersionUID = 1L;

        private int hash;

        private MutableHashKey(int hash) {
            this.hash = hash;
        }

        public int hashCode() {
            return hash;
        }
    }
}

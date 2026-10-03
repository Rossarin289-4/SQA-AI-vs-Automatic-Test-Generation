package org.apache.commons.collections4.keyvalue;

import org.junit.Assert;
import org.junit.Test;

public class MultiKeyAI26Test {

    @Test
    public void testTwoKeyConstructionAndAccess() {
        MultiKey<String> key = new MultiKey<String>("first", "second");

        Assert.assertEquals(2, key.size());
        Assert.assertEquals("first", key.getKey(0));
        Assert.assertEquals("second", key.getKey(1));
    }

    @Test
    public void testArrayConstructorClonesInputArray() {
        String[] source = new String[] { "one", "two" };
        MultiKey<String> key = new MultiKey<String>(source);

        source[0] = "changed";

        Assert.assertEquals("one", key.getKey(0));
        Assert.assertEquals(2, key.size());
    }

    @Test
    public void testNonCloningConstructorRetainsInputArray() {
        String[] source = new String[] { "one", "two" };
        MultiKey<String> key = new MultiKey<String>(source, false);

        source[1] = "changed";

        Assert.assertEquals("changed", key.getKey(1));
    }

    @Test
    public void testGetKeysReturnsIndependentArray() {
        MultiKey<String> key = new MultiKey<String>("left", "right");

        Object[] copy = key.getKeys();
        copy[0] = "modified";

        Assert.assertEquals("left", key.getKey(0));
        Assert.assertEquals("right", key.getKey(1));
    }

    @Test
    public void testEqualsAndHashCodeForEquivalentKeys() {
        MultiKey<String> first = new MultiKey<String>("a", "b", "c");
        MultiKey<String> second = new MultiKey<String>("a", "b", "c");
        MultiKey<String> differentOrder = new MultiKey<String>("b", "a", "c");

        Assert.assertTrue(first.equals(first));
        Assert.assertTrue(first.equals(second));
        Assert.assertEquals(first.hashCode(), second.hashCode());
        Assert.assertFalse(first.equals(differentOrder));
        Assert.assertFalse(first.equals("not a multikey"));
    }

    @Test
    public void testHashCodeIsExclusiveOrOfNonNullKeys() {
        MultiKey<Integer> key = new MultiKey<Integer>(Integer.valueOf(5), null,
                Integer.valueOf(12), Integer.valueOf(5));

        Assert.assertEquals(12, key.hashCode());
    }

    @Test
    public void testToStringIncludesKeysAndNulls() {
        MultiKey<String> key = new MultiKey<String>("alpha", null, "omega");

        Assert.assertEquals("MultiKey[alpha, null, omega]", key.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullArrayIsRejected() {
        new MultiKey<Object>((Object[]) null);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetKeyRejectsInvalidIndex() {
        MultiKey<String> key = new MultiKey<String>("only", "two");
        key.getKey(2);
    }

    @Test
    public void testReadResolveRecalculatesCachedHashCode() {
        Integer[] values = new Integer[] { Integer.valueOf(1), Integer.valueOf(2) };
        MultiKey<Integer> key = new MultiKey<Integer>(values, false);

        Assert.assertEquals(3, key.hashCode());
        values[0] = Integer.valueOf(7);

        Assert.assertEquals(3, key.hashCode());
        Object resolved = key.readResolve();

        Assert.assertSame(key, resolved);
        Assert.assertEquals(5, key.hashCode());
    }
}

package org.apache.commons.collections.keyvalue;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 * Unit tests for {@link MultiKey}.
 */
public class MultiKeyAI11Test {

    @Test
    public void testConstructorsWithTwoToFiveKeys() {
        MultiKey mk2 = new MultiKey("a", "b");
        Assert.assertEquals(2, mk2.size());
        Assert.assertEquals("a", mk2.getKey(0));
        Assert.assertEquals("b", mk2.getKey(1));

        MultiKey mk3 = new MultiKey("a", "b", "c");
        Assert.assertEquals(3, mk3.size());
        Assert.assertEquals("c", mk3.getKey(2));

        MultiKey mk4 = new MultiKey("a", "b", "c", "d");
        Assert.assertEquals(4, mk4.size());
        Assert.assertEquals("d", mk4.getKey(3));

        MultiKey mk5 = new MultiKey("a", "b", "c", "d", "e");
        Assert.assertEquals(5, mk5.size());
        Assert.assertEquals("e", mk5.getKey(4));
    }

    @Test
    public void testConstructorArrayCloningDefault() {
        Object[] original = new Object[]{"1", "2"};
        MultiKey mk = new MultiKey(original);

        original[0] = "mutated";
        Assert.assertEquals("1", mk.getKey(0));
    }

    @Test
    public void testConstructorArrayCloningExplicit() {
        Object[] originalCloned = new Object[]{"1", "2"};
        MultiKey mkCloned = new MultiKey(originalCloned, true);
        originalCloned[0] = "mutated";
        Assert.assertEquals("1", mkCloned.getKey(0));

        Object[] originalNotCloned = new Object[]{"1", "2"};
        MultiKey mkNotCloned = new MultiKey(originalNotCloned, false);
        originalNotCloned[0] = "mutated";
        Assert.assertEquals("mutated", mkNotCloned.getKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullArrayThrowsException() {
        new MultiKey((Object[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullArrayWithFlagThrowsException() {
        new MultiKey(null, true);
    }

    @Test
    public void testGetKeysReturnsClone() {
        MultiKey mk = new MultiKey("a", "b");
        Object[] keys = mk.getKeys();
        Assert.assertArrayEquals(new Object[]{"a", "b"}, keys);

        keys[0] = "c";
        Assert.assertEquals("a", mk.getKey(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKeyNegativeIndexThrowsException() {
        MultiKey mk = new MultiKey("a", "b");
        mk.getKey(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKeyOutOfBoundsIndexThrowsException() {
        MultiKey mk = new MultiKey("a", "b");
        mk.getKey(2);
    }

    @Test
    public void testEqualsAndHashCode() {
        MultiKey mk1 = new MultiKey("a", "b");
        MultiKey mk2 = new MultiKey("a", "b");
        MultiKey mk3 = new MultiKey("a", "c");
        MultiKey mk4 = new MultiKey("a", "b", "c");
        MultiKey mkNull1 = new MultiKey("a", null);
        MultiKey mkNull2 = new MultiKey("a", null);

        Assert.assertTrue(mk1.equals(mk1));
        Assert.assertTrue(mk1.equals(mk2));
        Assert.assertTrue(mk2.equals(mk1));
        Assert.assertEquals(mk1.hashCode(), mk2.hashCode());

        Assert.assertFalse(mk1.equals(mk3));
        Assert.assertFalse(mk1.equals(mk4));
        Assert.assertFalse(mk1.equals(null));
        Assert.assertFalse(mk1.equals("different type"));

        Assert.assertTrue(mkNull1.equals(mkNull2));
        Assert.assertEquals(mkNull1.hashCode(), mkNull2.hashCode());
        Assert.assertFalse(mkNull1.equals(mk1));
    }

    @Test
    public void testHashCodeCalculation() {
        String k1 = "alpha";
        String k2 = "beta";
        MultiKey mk = new MultiKey(k1, k2);
        int expectedHash = k1.hashCode() ^ k2.hashCode();
        Assert.assertEquals(expectedHash, mk.hashCode());

        MultiKey mkWithNull = new MultiKey(k1, null);
        Assert.assertEquals(k1.hashCode(), mkWithNull.hashCode());

        MultiKey mkAllNull = new MultiKey(null, null);
        Assert.assertEquals(0, mkAllNull.hashCode());
    }

    @Test
    public void testToString() {
        MultiKey mk = new MultiKey("a", "b");
        Assert.assertEquals("MultiKey[a, b]", mk.toString());

        MultiKey mkEmpty = new MultiKey(new Object[0]);
        Assert.assertEquals("MultiKey[]", mkEmpty.toString());
    }

    @Test
    public void testSerializationAndReadResolve() throws Exception {
        MultiKey original = new MultiKey("hello", "world");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        MultiKey deserialized = (MultiKey) ois.readObject();
        ois.close();

        Assert.assertEquals(original, deserialized);
        Assert.assertEquals(original.hashCode(), deserialized.hashCode());
        Assert.assertArrayEquals(original.getKeys(), deserialized.getKeys());
    }
}

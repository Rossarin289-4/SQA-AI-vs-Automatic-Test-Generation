package org.apache.commons.collections4.keyvalue;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class MultiKeyAI26Test {

    @Test
    public void testTwoKeyConstructor() {
        final MultiKey<String> mk = new MultiKey<String>("a", "b");
        Assert.assertEquals(2, mk.size());
        Assert.assertEquals("a", mk.getKey(0));
        Assert.assertEquals("b", mk.getKey(1));
    }

    @Test
    public void testThreeKeyConstructor() {
        final MultiKey<String> mk = new MultiKey<String>("a", "b", "c");
        Assert.assertEquals(3, mk.size());
        Assert.assertEquals("a", mk.getKey(0));
        Assert.assertEquals("b", mk.getKey(1));
        Assert.assertEquals("c", mk.getKey(2));
    }

    @Test
    public void testFourKeyConstructor() {
        final MultiKey<String> mk = new MultiKey<String>("a", "b", "c", "d");
        Assert.assertEquals(4, mk.size());
        Assert.assertEquals("a", mk.getKey(0));
        Assert.assertEquals("b", mk.getKey(1));
        Assert.assertEquals("c", mk.getKey(2));
        Assert.assertEquals("d", mk.getKey(3));
    }

    @Test
    public void testFiveKeyConstructor() {
        final MultiKey<String> mk = new MultiKey<String>("a", "b", "c", "d", "e");
        Assert.assertEquals(5, mk.size());
        Assert.assertEquals("a", mk.getKey(0));
        Assert.assertEquals("b", mk.getKey(1));
        Assert.assertEquals("c", mk.getKey(2));
        Assert.assertEquals("d", mk.getKey(3));
        Assert.assertEquals("e", mk.getKey(4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructorNullArray() {
        new MultiKey<String>((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructorNullArrayWithCloneFlag() {
        new MultiKey<String>((String[]) null, false);
    }

    @Test
    public void testArrayConstructorCloning() {
        final Integer[] source = new Integer[] {1, 2, 3};
        final MultiKey<Integer> mkCloned = new MultiKey<Integer>(source, true);
        source[0] = 99;
        Assert.assertEquals(Integer.valueOf(1), mkCloned.getKey(0));

        final Integer[] source2 = new Integer[] {1, 2, 3};
        final MultiKey<Integer> mkNotCloned = new MultiKey<Integer>(source2, false);
        source2[0] = 99;
        Assert.assertEquals(Integer.valueOf(99), mkNotCloned.getKey(0));
    }

    @Test
    public void testGetKeysReturnsClone() {
        final MultiKey<String> mk = new MultiKey<String>("one", "two");
        final String[] keys = mk.getKeys();
        Assert.assertEquals(2, keys.length);
        Assert.assertArrayEquals(new String[] {"one", "two"}, keys);

        // Modifying returned array should not affect MultiKey internal state
        keys[0] = "mutated";
        Assert.assertEquals("one", mk.getKey(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKeyOutOfBounds() {
        final MultiKey<String> mk = new MultiKey<String>("one", "two");
        mk.getKey(2);
    }

    @Test
    public void testEqualsAndHashCode() {
        final MultiKey<String> mk1 = new MultiKey<String>("k1", "k2");
        final MultiKey<String> mk2 = new MultiKey<String>("k1", "k2");
        final MultiKey<String> mk3 = new MultiKey<String>("k1", "k3");
        final MultiKey<String> mk4 = new MultiKey<String>("k1", "k2", "k3");

        // Reflexive
        Assert.assertTrue(mk1.equals(mk1));
        // Symmetric & Equal
        Assert.assertTrue(mk1.equals(mk2));
        Assert.assertTrue(mk2.equals(mk1));
        Assert.assertEquals(mk1.hashCode(), mk2.hashCode());
        // Hash code calculation check (k1.hashCode() ^ k2.hashCode())
        Assert.assertEquals("k1".hashCode() ^ "k2".hashCode(), mk1.hashCode());

        // Unequal keys
        Assert.assertFalse(mk1.equals(mk3));
        // Different length
        Assert.assertFalse(mk1.equals(mk4));
        // Not a MultiKey
        Assert.assertFalse(mk1.equals("Not a MultiKey"));
        Assert.assertFalse(mk1.equals(null));
    }

    @Test
    public void testNullKeysHashCodeAndEquals() {
        final MultiKey<String> mkWithNull = new MultiKey<String>(null, "b", null);
        Assert.assertEquals(3, mkWithNull.size());
        Assert.assertNull(mkWithNull.getKey(0));
        Assert.assertEquals("b", mkWithNull.getKey(1));
        Assert.assertNull(mkWithNull.getKey(2));

        // null keys do not contribute to XOR calculation
        Assert.assertEquals("b".hashCode(), mkWithNull.hashCode());

        final MultiKey<String> mkWithNullIdentical = new MultiKey<String>(null, "b", null);
        Assert.assertEquals(mkWithNull, mkWithNullIdentical);
        Assert.assertEquals(mkWithNull.hashCode(), mkWithNullIdentical.hashCode());

        final MultiKey<String> mkWithDifferentNull = new MultiKey<String>("a", "b", null);
        Assert.assertFalse(mkWithNull.equals(mkWithDifferentNull));
    }

    @Test
    public void testToString() {
        final MultiKey<String> mk = new MultiKey<String>("a", "b");
        Assert.assertEquals("MultiKey" + Arrays.toString(new String[] {"a", "b"}), mk.toString());
    }

    @Test
    public void testSerialization() throws Exception {
        final MultiKey<String> original = new MultiKey<String>("hello", "world");

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream ois = new ObjectInputStream(bais);
        @SuppressWarnings("unchecked")
        final MultiKey<String> deserialized = (MultiKey<String>) ois.readObject();
        ois.close();

        Assert.assertEquals(original, deserialized);
        Assert.assertEquals(original.hashCode(), deserialized.hashCode());
        Assert.assertEquals(2, deserialized.size());
        Assert.assertEquals("hello", deserialized.getKey(0));
        Assert.assertEquals("world", deserialized.getKey(1));
    }
}

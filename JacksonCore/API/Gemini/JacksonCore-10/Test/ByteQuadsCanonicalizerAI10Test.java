package com.fasterxml.jackson.core.sym;

import org.junit.Assert;
import org.junit.Test;

public class ByteQuadsCanonicalizerAI10Test {

    @Test
    public void testCreateRootAndBasicProperties() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot();
        Assert.assertNotNull(canonicalizer);
        Assert.assertEquals(0, canonicalizer.size());
    }

    @Test
    public void testCalcHashSingleInt() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot();
        int hash1 = canonicalizer.calcHash(123);
        int hash2 = canonicalizer.calcHash(123);
        int hash3 = canonicalizer.calcHash(456);

        Assert.assertEquals(hash1, hash2);
        Assert.assertNotEquals(hash1, hash3);
    }

    @Test
    public void testCalcHashTwoInts() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot();
        int hash1 = canonicalizer.calcHash(123, 456);
        int hash2 = canonicalizer.calcHash(123, 456);
        int hash3 = canonicalizer.calcHash(123, 789);

        Assert.assertEquals(hash1, hash2);
        Assert.assertNotEquals(hash1, hash3);
    }

    @Test
    public void testCalcHashThreeInts() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot();
        int hash1 = canonicalizer.calcHash(1, 2, 3);
        int hash2 = canonicalizer.calcHash(1, 2, 3);
        int hash3 = canonicalizer.calcHash(1, 2, 4);

        Assert.assertEquals(hash1, hash2);
        Assert.assertNotEquals(hash1, hash3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcHashArrayTooSmall() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot();
        int[] quads = new int[] { 1, 2, 3 };
        canonicalizer.calcHash(quads, 3);
    }

    @Test
    public void testCalcHashArrayValid() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot();
        int[] quads = new int[] { 1, 2, 3, 4 };
        int hash1 = canonicalizer.calcHash(quads, 4);
        int hash2 = canonicalizer.calcHash(quads, 4);
        Assert.assertEquals(hash1, hash2);

        int[] quadsLong = new int[] { 1, 2, 3, 4, 5 };
        int hashLong = canonicalizer.calcHash(quadsLong, 5);
        Assert.assertNotEquals(hash1, hashLong);
    }

    @Test
    public void testAddNameSingleQuad() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot();
        int[] q = new int[] { 42 };
        String name = canonicalizer.addName("testKey", q, 1);
        
        Assert.assertEquals("testKey", name);
        Assert.assertEquals(1, canonicalizer.size());
        
        Assert.assertEquals("testKey", canonicalizer.findName(42));
    }

    @Test
    public void testAddNameTwoQuads() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot();
        int[] q = new int[] { 10, 20 };
        String name = canonicalizer.addName("twoQuadKey", q, 2);
        
        Assert.assertEquals("twoQuadKey", name);
        Assert.assertEquals(1, canonicalizer.size());
        
        Assert.assertEquals("twoQuadKey", canonicalizer.findName(10, 20));
    }

    @Test
    public void testAddNameThreeQuads() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot();
        int[] q = new int[] { 1, 2, 3 };
        String name = canonicalizer.addName("threeQuadKey", q, 3);
        
        Assert.assertEquals("threeQuadKey", name);
        Assert.assertEquals(1, canonicalizer.size());
        
        Assert.assertEquals("threeQuadKey", canonicalizer.findName(1, 2, 3));
    }

    @Test
    public void testAddNameMultiQuads() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot();
        int[] q = new int[] { 1, 2, 3, 4, 5 };
        String name = canonicalizer.addName("multiQuadKey", q, 5);
        
        Assert.assertEquals("multiQuadKey", name);
        Assert.assertEquals(1, canonicalizer.size());
        
        Assert.assertEquals("multiQuadKey", canonicalizer.findName(q, 5));
    }

    @Test
    public void testMakeChild() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        int[] q = new int[] { 99 };
        root.addName("rootKey", q, 1);

        ByteQuadsCanonicalizer child = root.makeChild(true, true);
        Assert.assertNotNull(child);
        Assert.assertEquals(1, child.size());
        Assert.assertEquals("rootKey", child.findName(99));

        child.release();
    }
}

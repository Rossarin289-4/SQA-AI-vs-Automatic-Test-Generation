package com.fasterxml.jackson.core.sym;

import org.junit.Assert;
import org.junit.Test;

public class ByteQuadsCanonicalizerAI11Test {

    @Test
    public void testCreateRootAndBasicProperties() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot();
        Assert.assertNotNull(canonicalizer);
        Assert.assertFalse(canonicalizer.maybeDirty());
        Assert.assertEquals(0, canonicalizer.size());
    }

    @Test
    public void testCalcHashOneQuad() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot();
        int hash = canonicalizer.calcHash(12345);
        Assert.assertEquals(hash, canonicalizer.calcHash(12345));
    }

    @Test
    public void testCalcHashTwoQuads() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot();
        int hash = canonicalizer.calcHash(12345, 67890);
        Assert.assertEquals(hash, canonicalizer.calcHash(12345, 67890));
    }

    @Test
    public void testCalcHashThreeQuads() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot();
        int hash = canonicalizer.calcHash(111, 222, 333);
        Assert.assertEquals(hash, canonicalizer.calcHash(111, 222, 333));
    }

    @Test
    public void testCalcHashArrayValidLength() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot();
        int[] quads = new int[] { 1, 2, 3, 4 };
        int hash = canonicalizer.calcHash(quads, 4);
        Assert.assertEquals(hash, canonicalizer.calcHash(quads, 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcHashArrayInvalidLength() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot();
        int[] quads = new int[] { 1, 2, 3 };
        canonicalizer.calcHash(quads, 3);
    }

    @Test
    public void testMakeChild() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(true);
        Assert.assertNotNull(child);
        Assert.assertEquals(0, child.size());
    }

    @Test
    public void testCalcTertiaryShift() {
        Assert.assertEquals(4, ByteQuadsCanonicalizer._calcTertiaryShift(16));
        Assert.assertEquals(4, ByteQuadsCanonicalizer._calcTertiaryShift(64));
        Assert.assertEquals(5, ByteQuadsCanonicalizer._calcTertiaryShift(256));
        Assert.assertEquals(6, ByteQuadsCanonicalizer._calcTertiaryShift(1024));
        Assert.assertEquals(7, ByteQuadsCanonicalizer._calcTertiaryShift(4096));
    }

    @Test
    public void testReleaseChildToRoot() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(true);
        child.release();
    }
}

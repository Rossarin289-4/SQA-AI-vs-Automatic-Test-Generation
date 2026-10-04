package com.fasterxml.jackson.core.sym;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;

public class ByteQuadsCanonicalizerTest {
    @Test
    public void testRootStartsEmpty() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(0, root.size());
    }

    @Test
    public void testChildStartsEmpty() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        assertEquals(0, child.size());
    }

    @Test
    public void testChildAddAndFindSingleQuad() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        assertEquals("alpha", child.addName("alpha", 17));
        assertEquals("alpha", child.findName(17));
        assertEquals(1, child.size());
    }

    @Test
    public void testMissingSingleQuadReturnsNull() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        assertNull(child.findName(17));
    }

    @Test
    public void testSingleQuadLookupRejectsDifferentQuad() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        child.addName("alpha", 17);
        assertNull(child.findName(18));
    }

    @Test
    public void testAddTwoQuadNameAndFindUsingArray() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        int[] quads = { 41, 73 };
        assertEquals("beta", child.addName("beta", quads, 2));
        assertEquals("beta", child.findName(quads, 2));
        assertEquals(1, child.size());
    }

    @Test
    public void testAddThreeQuadNameAndFindUsingArray() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        int[] quads = { 11, 23, 37 };
        assertEquals("gamma", child.addName("gamma", quads, 3));
        assertEquals("gamma", child.findName(quads, 3));
    }

    @Test
    public void testAddFourQuadLongName() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        int[] quads = { 3, 5, 7, 9 };
        assertEquals("delta", child.addName("delta", quads, 4));
        assertEquals("delta", child.findName(quads, 4));
    }

    @Test
    public void testLongNameLookupVerifiesQuadContents() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        int[] stored = { 3, 5, 7, 9 };
        child.addName("delta", stored, 4);
        assertNull(child.findName(new int[] { 3, 5, 7, 10 }, 4));
    }

    @Test
    public void testLongNameLookupWithMoreThanEightQuads() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        int[] quads = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        child.addName("epsilon", quads, 9);
        assertEquals("epsilon", child.findName(quads, 9));
    }

    @Test
    public void testZeroSecondQuadArrayPath() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        int[] quads = { 31, 0 };
        child.addName("zeta", quads, 2);
        assertEquals("zeta", child.findName(quads, 2));
    }

    @Test
    public void testAddNameReturnsEqualInputWhenInterningDisabled() throws Exception {
        int flags = JsonFactory.Feature.INTERN_FIELD_NAMES.getMask();
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(flags);
        String name = new String("unique-name");
        assertEquals(name, child.addName(name, 51));
    }

    @Test
    public void testInterningFeatureReturnsEqualName() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        String name = new String("intern-test");
        assertEquals(name, child.addName(name, 52));
    }

    @Test
    public void testChildReleaseMakesSymbolAvailableFromRoot() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("shared", 61);
        child.release();
        ByteQuadsCanonicalizer laterChild = root.makeChild(0);
        assertEquals("shared", laterChild.findName(61));
        assertEquals(1, root.size());
    }

    @Test
    public void testChildDirtyStateChangesAfterAdd() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        assertFalse(child.maybeDirty());
        child.addName("changed", 62);
        assertTrue(child.maybeDirty());
    }

    @Test
    public void testRootBucketCountIsZeroBeforeChildCreated() throws Exception {
        assertEquals(0, ByteQuadsCanonicalizer.createRoot().bucketCount());
    }

    @Test
    public void testHashSeedIsOdd() throws Exception {
        assertEquals(1, ByteQuadsCanonicalizer.createRoot().hashSeed() & 1);
    }

    @Test
    public void testCalcHashIsStableForSameInput() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        assertEquals(child.calcHash(123), child.calcHash(123));
    }

    @Test
    public void testEmptyCountsAndToString() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        assertEquals(0, child.primaryCount());
        assertEquals(0, child.secondaryCount());
        assertEquals(0, child.tertiaryCount());
        assertEquals(0, child.spilloverCount());
        assertEquals(0, child.totalCount());
        assertTrue(child.toString().contains("total:0"));
    }

    @Test
    public void testConfiguredPrimaryCountAndTotalCount() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        child.addName("one", 101);
        assertEquals(1, child.primaryCount());
        assertEquals(1, child.totalCount());
    }

    @Test
    public void testTwoNamesIncreaseSizeAndTotal() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        child.addName("one", 101);
        child.addName("two", 202);
        assertEquals(2, child.size());
        assertEquals(2, child.totalCount());
    }

    @Test
    public void testLongNameAndShortNameBothCount() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        child.addName("short", 303);
        child.addName("long", new int[] { 1, 2, 3, 4 }, 4);
        assertEquals(2, child.size());
        assertEquals(2, child.totalCount());
    }
}

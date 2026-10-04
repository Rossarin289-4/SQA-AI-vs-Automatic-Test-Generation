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
        assertEquals(0, root.bucketCount());
    }

    @Test
    public void testRootInitiallyNotDirty() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertTrue(root.maybeDirty());
    }

    @Test
    public void testChildStartsEmptyAndClean() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot()
                .makeChild(0);
        assertEquals(0, child.size());
        assertFalse(child.maybeDirty());
    }

    @Test
    public void testChildAddsAndLooksUpSingleQuad() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot()
                .makeChild(0);
        String result = child.addName(new String("alpha"), 12345);
        assertEquals("alpha", result);
        assertEquals("alpha", child.findName(12345));
        assertEquals(1, child.size());
    }

    @Test
    public void testSingleQuadAbsentLookupIsNull() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot()
                .makeChild(0);
        assertNull(child.findName(12345));
    }

    @Test
    public void testDuplicateSingleQuadDoesNotReplaceExistingEntry() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot()
                .makeChild(0);
        child.addName("first", 17);
        child.addName("second", 17);
        assertEquals("first", child.findName(17));
        assertEquals(2, child.size());
    }

    @Test
    public void testOneEntryHasOnePrimarySlot() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot()
                .makeChild(0);
        child.addName("one", 17);
        assertEquals(1, child.primaryCount());
        assertEquals(1, child.totalCount());
    }

    @Test
    public void testDifferentSingleQuadsCanBeRetrieved() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot()
                .makeChild(0);
        child.addName("first", 17);
        child.addName("second", 29);
        assertEquals("first", child.findName(17));
        assertEquals("second", child.findName(29));
        assertEquals(2, child.size());
    }

    @Test
    public void testMultiQuadNameViaArrayCanBeRetrieved() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot()
                .makeChild(0);
        int[] quads = {11, 22, 33, 44};
        child.addName("long", quads, 4);
        assertEquals("long", child.findName(quads, 4));
        assertEquals(1, child.totalCount());
    }

    @Test
    public void testOneElementArrayUsesSingleQuadLookup() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot()
                .makeChild(0);
        int[] quads = {71};
        child.addName("single", quads, 1);
        assertEquals("single", child.findName(quads, 1));
    }

    @Test
    public void testTwoElementArrayUsesTwoQuadLookup() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot()
                .makeChild(0);
        int[] quads = {71, 72};
        child.addName("pair", quads, 2);
        assertEquals("pair", child.findName(quads, 2));
    }

    @Test
    public void testThreeElementArrayUsesThreeQuadLookup() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot()
                .makeChild(0);
        int[] quads = {71, 72, 73};
        child.addName("triple", quads, 3);
        assertEquals("triple", child.findName(quads, 3));
    }

    @Test
    public void testArrayLookupWithDifferentQuadDoesNotMatch() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot()
                .makeChild(0);
        int[] quads = {11, 22, 33, 44};
        child.addName("long", quads, 4);
        assertNull(child.findName(new int[] {11, 22, 33, 45}, 4));
    }

    @Test
    public void testHashSeedIsStableWithinRootAndChild() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(root.hashSeed(), root.makeChild(0).hashSeed());
    }

    @Test
    public void testSingleQuadHashIsRepeatable() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot()
                .makeChild(0);
        assertEquals(child.calcHash(0), child.calcHash(0));
        assertEquals(child.calcHash(Integer.MAX_VALUE),
                child.calcHash(Integer.MAX_VALUE));
    }

    @Test
    public void testZeroSecondQuadHashIsRepeatable() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot()
                .makeChild(0);
        assertEquals(child.calcHash(123, 0), child.calcHash(123, 0));
    }

    @Test
    public void testHashAcceptsIntegerMinimumAndMaximum() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot()
                .makeChild(0);
        int minimumHash = child.calcHash(Integer.MIN_VALUE);
        int maximumHash = child.calcHash(Integer.MAX_VALUE);
        assertEquals(minimumHash, child.calcHash(Integer.MIN_VALUE));
        assertEquals(maximumHash, child.calcHash(Integer.MAX_VALUE));
    }

    @Test
    public void testAddChangesDirtyStateAndReleaseMergesIntoRoot() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("merged", 909);
        assertTrue(child.maybeDirty());
        child.release();
        assertEquals(1, root.size());
        assertEquals(1, child.size());
    }

    @Test
    public void testReleaseWithoutChangesLeavesRootEmpty() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        root.makeChild(0).release();
        assertEquals(0, root.size());
    }

    @Test
    public void testInterningFeatureReturnsInternedName() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot()
                .makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());
        String name = new String("interned");
        String result = child.addName(name, 707);
        assertSame(name.intern(), result);
        assertSame(result, child.findName(707));
    }

    @Test
    public void testToStringReportsConfiguredCounts() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot()
                .makeChild(0);
        child.addName("one", 17);
        String description = child.toString();
        assertTrue(description.contains("size=1"));
        assertTrue(description.contains("total:1"));
    }

    @Test
    public void testSecondaryCountAfterPrimaryCollision() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        int first = 1;
        int second = first + 64;
        while ((child.calcHash(first) & 63) != (child.calcHash(second) & 63)) {
            second += 64;
        }
        child.addName("first", first);
        child.addName("second", second);
        assertEquals(1, child.primaryCount());
        assertEquals(1, child.secondaryCount());
        assertEquals(0, child.tertiaryCount());
        assertEquals(2, child.totalCount());
    }

    @Test
    public void testTertiaryCountAfterSecondaryCollision() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        int first = 2;
        int second = first + 64;
        int third = second + 64;
        while ((child.calcHash(first) & 63) != (child.calcHash(second) & 63)
                || (child.calcHash(first) & 63) != (child.calcHash(third) & 63)) {
            second += 64;
            third += 64;
        }
        child.addName("first", first);
        child.addName("second", second);
        child.addName("third", third);
        assertEquals(1, child.primaryCount());
        assertEquals(1, child.secondaryCount());
        assertEquals(1, child.tertiaryCount());
        assertEquals(3, child.totalCount());
    }

    @Test
    public void testSpilloverCountAfterTertiaryBucketFills() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        int[] values = new int[7];
        int found = 0;
        for (int candidate = 0; found < values.length; candidate++) {
            if ((child.calcHash(candidate) & 63) == 0) {
                values[found++] = candidate;
            }
        }
        for (int i = 0; i < values.length; i++) {
            child.addName("name" + i, values[i]);
        }
        assertEquals(4, child.primaryCount());
        assertEquals(1, child.secondaryCount());
        assertEquals(1, child.tertiaryCount());
        assertEquals(1, child.spilloverCount());
        assertEquals(7, child.totalCount());
    }

    @Test
    public void testNoSpilloverInitially() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        assertEquals(0, child.spilloverCount());
    }

    @Test
    public void testTertiaryCountsInitiallyZero() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        assertEquals(0, child.tertiaryCount());
        assertEquals(0, child.secondaryCount());
    }

    @Test
    public void testLongNameAndSingleQuadUseDistinctCounts() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        child.addName("short", 1);
        int[] quads = {3, 5, 7, 9};
        child.addName("long", quads, quads.length);
        assertEquals(2, child.totalCount());
        assertEquals(2, child.size());
        assertEquals(2, child.primaryCount());
    }

    @Test
    public void testMoreLongNameQuadsThanInlineCasesCanBeFound() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        int[] quads = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        child.addName("longer", quads, quads.length);
        assertEquals("longer", child.findName(quads, quads.length));
        assertEquals(1, child.totalCount());
    }

    @Test
    public void testSpilloverLookupFindsLastInsertedCollision() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        int[] values = new int[7];
        int found = 0;
        for (int candidate = 0; found < values.length; candidate++) {
            if ((child.calcHash(candidate) & 63) == 1) {
                values[found++] = candidate;
            }
        }
        for (int i = 0; i < values.length; i++) {
            child.addName("item" + i, values[i]);
        }
        assertEquals("item6", child.findName(values[6]));
        assertEquals(1, child.spilloverCount());
    }

    @Test
    public void testPrimaryAndSecondaryTogetherEqualTotal() throws Exception {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        child.addName("left", 100);
        child.addName("right", 101);
        assertEquals(child.primaryCount() + child.secondaryCount()
                + child.tertiaryCount() + child.spilloverCount(), child.totalCount());
    }
}

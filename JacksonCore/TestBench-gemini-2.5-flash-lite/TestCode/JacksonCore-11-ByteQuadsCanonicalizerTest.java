package com.fasterxml.jackson.core.sym;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;

public class ByteQuadsCanonicalizerTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testCreateRoot() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot();
        assertNotNull(canonicalizer);
        // The root table is initialized with default size, not necessarily 0 count
        assertEquals(0, canonicalizer.size());
        assertTrue(canonicalizer.bucketCount() > 0);
        assertTrue(canonicalizer.hashSeed() != 0);
        assertFalse(canonicalizer.maybeDirty()); // Root table is not dirty initially
    }

    @Test
    public void testCreateRootWithSpecificSeed() {
        int seed = 12345;
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot(seed);
        assertNotNull(canonicalizer);
        assertEquals(seed, canonicalizer.hashSeed());
    }

    @Test
    public void testMakeChild() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        int flags = JsonFactory.Feature.INTERN_FIELD_NAMES.getMask() | JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.getMask();
        ByteQuadsCanonicalizer child = root.makeChild(flags);
        assertNotNull(child);
        assertNotSame(root, child);
        assertEquals(root.hashSeed(), child.hashSeed());
        assertTrue(child.maybeDirty()); // Child tables are dirty by default
        // Child's size is derived from parent's TableInfo, which is initial state.
        assertEquals(0, child.size());
    }

    @Test
    public void testMakeChildNoIntern() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        int flags = 0; // No features enabled
        ByteQuadsCanonicalizer child = root.makeChild(flags);
        assertNotNull(child);
        assertNotSame(root, child);
        assertEquals(0, child.size());
    }

    @Test
    public void testReleaseDoesNothingIfNoParent() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        root.release(); // Should not throw, and state should not change.
        assertEquals(0, root.size());
        assertFalse(root.maybeDirty());
    }

    @Test
    public void testReleaseMergesChildState() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        String name1 = child.addName("test1", 123);
        child.release(); // Should merge "test1" into root.

        assertEquals(1, root.size());
        assertEquals(1, root.totalCount());
        assertEquals(name1, root.findName(123));
        // After release, the child's _hashShared is set to true, so maybeDirty should be false.
        assertFalse(child.maybeDirty());
    }
    
    @Test
    public void testSizeReturnsCorrectCountForRoot() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(0, root.size());
        root.addName("a", 1);
        assertEquals(1, root.size());
    }

    @Test
    public void testSizeReturnsCorrectCountForChild() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertEquals(0, child.size());
        child.addName("a", 1);
        assertEquals(1, child.size());
    }

    @Test
    public void testBucketCount() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        // Default size is 64
        assertEquals(64, root.bucketCount());
    }

    @Test
    public void testMaybeDirtyForRoot() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertFalse(root.maybeDirty()); // Root is initially not dirty
    }

    @Test
    public void testMaybeDirtyForChild() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertTrue(child.maybeDirty()); // Child is dirty
        child.release();
        assertFalse(child.maybeDirty()); // After release, it's merged, so not dirty
    }

    @Test
    public void testHashSeed() {
        int seed = 98765;
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(seed);
        assertEquals(seed, root.hashSeed());
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertEquals(seed, child.hashSeed());
    }

    @Test
    public void testPrimaryCount() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(0, root.primaryCount());
        root.addName("a", 1);
        // After adding one element, it's likely in a primary slot.
        assertEquals(1, root.primaryCount());
    }

    @Test
    public void testSecondaryCount() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(0, root.secondaryCount());
        // Adding more elements might lead to secondary entries if collisions occur.
        // For simple case, still 0.
    }

    @Test
    public void testTertiaryCount() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(0, root.tertiaryCount());
        // Tertiary count is 0 initially.
    }

    @Test
    public void testSpilloverCount() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(0, root.spilloverCount());
        // Spillover count is 0 initially.
    }
    
    @Test
    public void testTotalCount() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(0, root.totalCount());
        root.addName("a", 1);
        root.addName("b", 2);
        assertEquals(2, root.totalCount());
    }

    @Test
    public void testToString() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        String toStringResult = root.toString();
        assertNotNull(toStringResult);
        assertTrue(toStringResult.contains("size=0"));
        assertTrue(toStringResult.contains("hashSize=" + root.bucketCount()));
        // Default should be 0/0/0/0 until elements are added
        assertTrue(toStringResult.contains("0/0/0/0 pri/sec/ter/spill"));
    }

    @Test
    public void testFindNameNotFound() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertNull(root.findName(123));
        assertNull(root.findName(123, 456));
        assertNull(root.findName(123, 456, 789));
        assertNull(root.findName(new int[]{1, 2, 3, 4}, 4));
    }

    @Test
    public void testAddNameAndFindName1Quad() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        String name = "testName1";
        int q1 = 12345;
        String addedName = root.addName(name, q1);
        assertEquals(name, addedName);
        assertEquals(1, root.size());
        assertEquals(1, root.totalCount());

        String foundName = root.findName(q1);
        assertNotNull(foundName);
        assertEquals(name, foundName);
    }

    @Test
    public void testAddNameAndFindName2Quads() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        String name = "testName2";
        int q1 = 12345;
        int q2 = 67890;
        String addedName = root.addName(name, q1, q2);
        assertEquals(name, addedName);
        assertEquals(1, root.size());
        assertEquals(1, root.totalCount());

        String foundName = root.findName(q1, q2);
        assertNotNull(foundName);
        assertEquals(name, foundName);
    }

    @Test
    public void testAddNameAndFindName3Quads() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        String name = "testName3";
        int q1 = 12345;
        int q2 = 67890;
        int q3 = 11223;
        String addedName = root.addName(name, q1, q2, q3);
        assertEquals(name, addedName);
        assertEquals(1, root.size());
        assertEquals(1, root.totalCount());

        String foundName = root.findName(q1, q2, q3);
        assertNotNull(foundName);
        assertEquals(name, foundName);
    }

    @Test
    public void testAddNameAndFindNameNQuads() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        String name = "testName4";
        int[] q = {1, 2, 3, 4}; // Using exactly 4 quads for this test
        int qlen = q.length;
        String addedName = root.addName(name, q, qlen);
        assertEquals(name, addedName);
        assertEquals(1, root.size());
        assertEquals(1, root.totalCount());

        String foundName = root.findName(q, qlen);
        assertNotNull(foundName);
        assertEquals(name, foundName);
    }

    @Test
    public void testAddNameNQuadsWithDifferentLength() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        String name1 = "name1";
        int[] q1 = {1, 2, 3, 4};
        root.addName(name1, q1, q1.length);

        String name2 = "name2";
        int[] q2 = {5, 6, 7, 8, 9};
        root.addName(name2, q2, q2.length);

        assertEquals(2, root.size());
        assertEquals(name1, root.findName(q1, q1.length));
        assertEquals(name2, root.findName(q2, q2.length));
    }

    @Test
    public void testAddNameWithDifferentQuadsLengths() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        String name1 = "single";
        int q1 = 1;
        root.addName(name1, q1);

        String name2 = "double";
        int q1_2 = 2, q2_2 = 3;
        root.addName(name2, q1_2, q2_2);

        String name3 = "triple";
        int q1_3 = 4, q2_3 = 5, q3_3 = 6;
        root.addName(name3, q1_3, q2_3, q3_3);

        String name4 = "quad";
        int[] q4 = {7, 8, 9, 10};
        root.addName(name4, q4, q4.length);

        assertEquals(4, root.size());
        assertEquals(name1, root.findName(q1));
        assertEquals(name2, root.findName(q1_2, q2_2));
        assertEquals(name3, root.findName(q1_3, q2_3, q3_3));
        assertEquals(name4, root.findName(q4, q4.length));
    }

    @Test
    public void testInterning() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        int flags = JsonFactory.Feature.INTERN_FIELD_NAMES.getMask();
        ByteQuadsCanonicalizer child = root.makeChild(flags);

        String name1 = "to_be_interned";
        String addedName1 = child.addName(name1, 1);
        // Check if the returned name is an interned string. It should be the same instance as the interned input.
        assertTrue(addedName1 == InternCache.instance.intern(name1)); 
    }

    @Test
    public void testNoInterningWhenDisabled() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        // No INTERN_FIELD_NAMES feature enabled
        ByteQuadsCanonicalizer child = root.makeChild(0);

        String name1 = "not_to_be_interned";
        // Create a distinct string instance that is NOT interned.
        String nonInternedName1 = new String(name1); 
        String addedName1 = child.addName(nonInternedName1, 1);
        
        // If interning is disabled, the original instance should be returned.
        // The input `nonInternedName1` is a new String object, not from InternCache.
        // If _intern is false, addName returns the input reference.
        assertSame(nonInternedName1, addedName1);
    }

    @Test
    public void testHashCalculationConsistency() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(123); // Fixed seed

        // Test calcHash(int q1)
        int hash1_1 = root.calcHash(1);
        int hash1_2 = root.calcHash(1);
        assertEquals(hash1_1, hash1_2);

        // Test calcHash(int q1, int q2)
        int hash2_1 = root.calcHash(1, 2);
        int hash2_2 = root.calcHash(1, 2);
        assertEquals(hash2_1, hash2_2);

        // Test calcHash(int q1, int q2, int q3)
        int hash3_1 = root.calcHash(1, 2, 3);
        int hash3_2 = root.calcHash(1, 2, 3);
        assertEquals(hash3_1, hash3_2);

        // Test calcHash(int[] q, int qlen)
        int[] q = {1, 2, 3, 4};
        int hash4_1 = root.calcHash(q, q.length);
        int hash4_2 = root.calcHash(q, q.length);
        assertEquals(hash4_1, hash4_2);
    }
    
    @Test
    public void testHashCalculationDiffersForDifferentInputs() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(123); // Fixed seed

        assertNotEquals(root.calcHash(1), root.calcHash(2));
        assertNotEquals(root.calcHash(1, 2), root.calcHash(1, 3));
        assertNotEquals(root.calcHash(1, 2, 3), root.calcHash(1, 2, 4));
        assertNotEquals(root.calcHash(new int[]{1,2,3,4}, 4), root.calcHash(new int[]{1,2,3,5}, 4));
    }
    
    @Test
    public void testAddNameWithInternedString() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        int flags = JsonFactory.Feature.INTERN_FIELD_NAMES.getMask();
        ByteQuadsCanonicalizer child = root.makeChild(flags);

        String internedName = InternCache.instance.intern("interned_string");
        String addedName = child.addName(internedName, 1);
        
        assertEquals("interned_string", addedName);
        // Check that the returned string is the same instance as the interned input
        assertSame(internedName, addedName);
    }

    @Test
    public void testToStringWithEntries() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        root.addName("a", 1);
        root.addName("b", 2, 3);
        root.addName("c", 4, 5, 6);
        int[] q = {7, 8, 9, 10};
        root.addName("d", q, q.length);

        String toStringResult = root.toString();
        assertNotNull(toStringResult);
        assertTrue(toStringResult.contains("size=4"));
        assertTrue(toStringResult.contains("total:4"));
        // The exact counts for pri/sec/ter/spill depend on hash implementation,
        // but they should be non-negative.
        assertTrue(toStringResult.matches(".* \\d+/\\d+/\\d+/\\d+ pri/sec/ter/spill .*"));
    }

    @Test
    public void testFindNameWithCollisions() {
        // This test aims to ensure that `findName` works correctly even after some entries are added.
        // It doesn't explicitly force collisions but checks basic find functionality after state change.
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(13); // Using a fixed seed

        String name1 = "key1";
        int q1_1 = 1;
        root.addName(name1, q1_1);

        String name2 = "key2";
        int q1_2 = 2;
        root.addName(name2, q1_2);

        assertEquals(name1, root.findName(q1_1));
        assertEquals(name2, root.findName(q1_2));
    }
    
    @Test
    public void testRehashWhenFull() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(42);
        int initialSize = root.bucketCount(); // e.g., 64
        
        // Add enough elements to trigger rehashing.
        // The condition for rehash is `_count > (_hashSize >> 1)` (over 50%)
        int entriesToAdd = (initialSize / 2) + 10; // e.g., 32 + 10 = 42 for size 64.

        for (int i = 0; i < entriesToAdd; i++) {
            String name = "name_" + i;
            int q1 = i * 10 + 1;
            root.addName(name, q1);
        }
        
        int sizeAfterAdd = root.bucketCount();
        // Expect the size to have doubled or increased due to rehashing
        assertTrue(sizeAfterAdd > initialSize);
        assertEquals(entriesToAdd, root.totalCount());
        
        // Verify that previously added elements can still be found
        for (int i = 0; i < entriesToAdd; i++) {
            String name = "name_" + i;
            int q1 = i * 10 + 1;
            assertEquals(name, root.findName(q1));
        }
    }

    @Test
    public void testAddNameWithZeroQuads() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        String name = "zero_quads";
        int q1 = 0;
        String addedName = root.addName(name, q1);
        assertEquals(name, addedName);
        assertEquals(1, root.size());
        assertEquals(name, root.findName(q1));
    }

    @Test
    public void testAddNameWithZeroQuadsAndMultiple() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        String name = "zero_quads_multi";
        int q1 = 0, q2 = 0, q3 = 0;
        root.addName(name, q1, q2, q3);
        assertEquals(1, root.size());
        assertEquals(name, root.findName(q1, q2, q3));
    }

    @Test
    public void testAddNameWithNegativeQuads() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        String name = "negative_quads";
        int q1 = -123;
        String addedName = root.addName(name, q1);
        assertEquals(name, addedName);
        assertEquals(1, root.size());
        assertEquals(name, root.findName(q1));
    }
    
    @Test
    public void testAddNameWithMaxIntQuads() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        String name = "max_int_quads";
        int q1 = Integer.MAX_VALUE;
        String addedName = root.addName(name, q1);
        assertEquals(name, addedName);
        assertEquals(1, root.size());
        assertEquals(name, root.findName(q1));
    }

    @Test
    public void testAddNameWithMinIntQuads() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        String name = "min_int_quads";
        int q1 = Integer.MIN_VALUE;
        String addedName = root.addName(name, q1);
        assertEquals(name, addedName);
        assertEquals(1, root.size());
        assertEquals(name, root.findName(q1));
    }

    @Test
    public void testLongNameOffsetCorrectlySetAndUsed() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(123);
        
        // Add a name that is long enough to require the long name area (>= 4 quads).
        String name = "very_long_name_indeed_that_needs_more_than_3_quads";
        int[] q = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int qlen = q.length;

        root.addName(name, q, qlen);
        assertEquals(1, root.size());

        // Check if the long name was found.
        String foundName = root.findName(q, qlen);
        assertNotNull(foundName);
        assertEquals(name, foundName);
    }
}

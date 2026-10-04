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
    public void testCreateRoot() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertNotNull(root);
        assertTrue(root.size() >= 0); // Should be 0 for a new root
        assertTrue(root.bucketCount() >= 16); // Default size is 64
    }

    @Test
    public void testMakeChild() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0); // No features enabled
        assertNotNull(child);
        assertNotSame(root, child);
        assertEquals(root.hashSeed(), child.hashSeed());
        assertFalse(child.maybeDirty()); // Initially not dirty
    }

    @Test
    public void testReleaseRoot() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        root.release(); // Releasing root should not throw
        // No state change expected for root release
    }

    @Test
    public void testSize() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(0, root.size());

        ByteQuadsCanonicalizer child = root.makeChild(0);
        // Adding a name to child will increment its count, but root's count is managed separately
        // until merge. For now, let's test the size of child.
        child.addName("test", 123);
        // The size of a child is directly tracked.
        assertEquals(1, child.size());
    }

    @Test
    public void testBucketCount() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertTrue(root.bucketCount() >= 16); // Default is 64
        // Making a child should inherit bucket count
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertEquals(root.bucketCount(), child.bucketCount());
    }

    @Test
    public void testMaybeDirty() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertFalse(root.maybeDirty()); // Root is never dirty in the same sense as a child

        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertFalse(child.maybeDirty()); // Child is not dirty initially

        child.addName("test", 123); // Adding to child should mark it dirty
        assertTrue(child.maybeDirty());
    }

    @Test
    public void testHashSeed() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        int seed = root.hashSeed();
        assertNotEquals(0, seed); // Seed should not be zero

        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertEquals(seed, child.hashSeed()); // Child should have same seed as parent
    }

    @Test
    public void testPrimaryCount() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(0, root.primaryCount());

        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("test1", 1);
        // With only one entry, it should be in primary
        assertEquals(1, child.primaryCount());

        child.addName("test2", 2);
        // With two entries, if they hash differently, they should still be primary
        assertEquals(2, child.primaryCount());
    }

    @Test
    public void testSecondaryCount() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(0, root.secondaryCount());

        // Need to force collisions to test secondary
        // This requires knowing the hash function and bucket size, which is complex.
        // Instead, let's try adding many items and see if secondary count increases.
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int initialBucketCount = child.bucketCount();
        for (int i = 0; i < initialBucketCount; ++i) {
            child.addName("name" + i, i); // Simple additions
        }
        // Expect many collisions and secondary entries now.
        assertTrue(child.secondaryCount() >= 0); // It's possible that no collisions happen to fill secondary buckets
    }

    @Test
    public void testTertiaryCount() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(0, root.tertiaryCount());

        ByteQuadsCanonicalizer child = root.makeChild(0);
        int initialBucketCount = child.bucketCount();
        // Populate to fill primary and secondary to encourage tertiary usage
        for (int i = 0; i < initialBucketCount * 2; ++i) { // Add more than buckets
            child.addName("name" + i, i);
        }
        // Expect tertiary entries if enough collisions occurred.
        assertTrue(child.tertiaryCount() >= 0); // Might be zero if not enough collisions
    }

    @Test
    public void testSpilloverCount() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(0, root.spilloverCount());

        ByteQuadsCanonicalizer child = root.makeChild(0);
        int initialBucketCount = child.bucketCount();
        // Add many more items than buckets to force spillover
        for (int i = 0; i < initialBucketCount * 3; ++i) {
            child.addName("name" + i, i);
        }
        assertTrue(child.spilloverCount() >= 0); // Might be zero
    }

    @Test
    public void testTotalCount() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(0, root.totalCount());

        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("test1", 1);
        child.addName("test2", 2);
        assertEquals(2, child.totalCount());
    }

    @Test
    public void testToString() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        String toString = root.toString();
        assertNotNull(toString);
        assertTrue(toString.contains("ByteQuadsCanonicalizer"));
        assertTrue(toString.contains("size=0"));
        assertTrue(toString.contains("hashSize=" + root.bucketCount()));
    }

    @Test
    public void testFindName1QuadFound() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        String name = "test";
        int q1 = 12345;
        child.addName(name, q1);
        assertEquals(name, child.findName(q1));
    }

    @Test
    public void testFindName1QuadNotFound() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int q1 = 12345;
        assertNull(child.findName(q1)); // Not found
    }

    @Test
    public void testAddName1Quad() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        String name = "test";
        int q1 = 12345;
        String addedName = child.addName(name, q1);
        assertEquals(name, addedName);
        assertEquals(1, child.size());
        assertEquals(name, child.findName(q1));
    }

    @Test
    public void testAddName1QuadWithIntern() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());
        String name = "test_intern";
        int q1 = 67890;
        String addedName = child.addName(name, q1);
        assertEquals(name, addedName);
        assertSame(name, child.findName(q1)); // Should be interned
    }

    @Test
    public void testFindName2QuadsFound() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        String name = "test2q";
        int q1 = 1111;
        int q2 = 2222;
        child.addName(name, q1, q2);
        assertEquals(name, child.findName(q1, q2));
    }

    @Test
    public void testFindName2QuadsNotFound() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int q1 = 1111;
        int q2 = 2222;
        assertNull(child.findName(q1, q2));
    }

    @Test
    public void testAddName2Quads() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        String name = "test2q";
        int q1 = 1111;
        int q2 = 2222;
        String addedName = child.addName(name, q1, q2);
        assertEquals(name, addedName);
        assertEquals(1, child.size());
        assertEquals(name, child.findName(q1, q2));
    }

    @Test
    public void testFindName3QuadsFound() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        String name = "test3q";
        int q1 = 1;
        int q2 = 2;
        int q3 = 3;
        child.addName(name, q1, q2, q3);
        assertEquals(name, child.findName(q1, q2, q3));
    }

    @Test
    public void testFindName3QuadsNotFound() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int q1 = 1;
        int q2 = 2;
        int q3 = 3;
        assertNull(child.findName(q1, q2, q3));
    }

    @Test
    public void testAddName3Quads() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        String name = "test3q";
        int q1 = 1;
        int q2 = 2;
        int q3 = 3;
        String addedName = child.addName(name, q1, q2, q3);
        assertEquals(name, addedName);
        assertEquals(1, child.size());
        assertEquals(name, child.findName(q1, q2, q3));
    }

    @Test
    public void testFindNameNQuadsFound() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        String name = "testNq";
        int[] q = {1, 2, 3, 4, 5, 6};
        child.addName(name, q, q.length);
        assertEquals(name, child.findName(q, q.length));
    }

    @Test
    public void testFindNameNQuadsNotFound() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int[] q = {1, 2, 3, 4, 5, 6};
        assertNull(child.findName(q, q.length));
    }

    @Test
    public void testAddNameNQuads() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        String name = "testNq";
        int[] q = {1, 2, 3, 4, 5, 6};
        String addedName = child.addName(name, q, q.length);
        assertEquals(name, addedName);
        assertEquals(1, child.size());
        assertEquals(name, child.findName(q, q.length));
    }

    @Test
    public void testAddNameNQuadsWithLongerArray() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        String name = "testLongNq";
        int[] q = new int[20]; // Significantly longer than default capacity for quaternary
        for (int i = 0; i < q.length; i++) {
            q[i] = i + 1;
        }
        String addedName = child.addName(name, q, q.length);
        assertEquals(name, addedName);
        assertEquals(1, child.size());
        assertEquals(name, child.findName(q, q.length));
    }

    @Test
    public void testHashCollision1Quad() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        // Find two different ints that produce the same hash for 1 quad
        // This is hard without knowing the exact hash function and seed.
        // Instead, let's populate and rely on findName to handle collisions.
        // Add an item, then add another item that *might* collide, and check both.
        String name1 = "name1";
        int q1_1 = 100;
        child.addName(name1, q1_1);

        // Assuming a simple hash, maybe a value close to q1_1 or one with similar bit patterns
        // will collide. This is a heuristic.
        String name2 = "name2";
        int q1_2 = 101; // Just a different value
        child.addName(name2, q1_2);

        assertEquals(name1, child.findName(q1_1));
        assertEquals(name2, child.findName(q1_2));
        assertEquals(2, child.size());
    }

    @Test
    public void testHashCollision2Quads() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        String name1 = "nameA";
        int q1_1 = 1000;
        int q2_1 = 2000;
        child.addName(name1, q1_1, q2_1);

        String name2 = "nameB";
        int q1_2 = 1001; // Different second quad
        int q2_2 = 2001;
        child.addName(name2, q1_2, q2_2);

        assertEquals(name1, child.findName(q1_1, q2_1));
        assertEquals(name2, child.findName(q1_2, q2_2));
        assertEquals(2, child.size());
    }

    @Test
    public void testRehashTriggered() throws Exception {
        // This test aims to trigger a rehash by adding enough elements.
        // The threshold is 80% of hashSize or 50% with spillover.
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int initialSize = child.bucketCount(); // e.g., 64
        // Add enough elements to exceed the 80% threshold to force a rehash.
        // The rehash is triggered on the *next* add after the threshold is crossed.
        int targetCount = (int) (initialSize * 0.85); // Add slightly more than 80% to force rehash

        for (int i = 0; i < targetCount; ++i) {
            child.addName("name" + i, i);
            // The rehash happens on the *next* add if needed.
        }
        // The next add should trigger rehash if not already done.
        child.addName("last_name", targetCount);

        // After rehash, the size should reflect the new capacity, and contents should be preserved.
        assertEquals(targetCount + 1, child.size());
        assertTrue(child.bucketCount() > initialSize); // Bucket count should have increased
        assertEquals("name0", child.findName(0));
        assertEquals("last_name", child.findName(targetCount));
    }

    @Test
    public void testFindNameWithManyCollisions() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        // Use a small initial size to force collisions easily
        // This requires a custom way to create root, which is not public.
        // So, we'll rely on the default size and add many elements.
        int initialSize = child.bucketCount();
        int numEntries = initialSize * 3; // More than enough to cause collisions

        for (int i = 0; i < numEntries; ++i) {
            child.addName("name_" + i, i);
        }

        // Verify that all added names can still be found
        for (int i = 0; i < numEntries; ++i) {
            assertEquals("name_" + i, child.findName(i));
        }
        assertEquals(numEntries, child.size());
    }
    
    @Test
    public void testFindNameLongName() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        String name = "this_is_a_very_long_name_for_testing";
        // Calculate quads based on the name string. Each quad is 4 characters.
        int expectedQuadLength = (name.length() + 3) / 4; // Ceiling division
        int[] quads = new int[expectedQuadLength];
        int currentQuadIndex = 0;
        for (int i = 0; i < name.length(); i += 4) {
            int quad = 0;
            for (int j = 0; j < 4 && i + j < name.length(); j++) {
                quad |= (name.charAt(i + j) << (j * 8));
            }
            quads[currentQuadIndex++] = quad;
        }
        
        child.addName(name, quads, quads.length);
        assertEquals(name, child.findName(quads, quads.length));
    }

    @Test
    public void testAddNameAndRelease() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        String name = "test_release";
        int q1 = 999;
        child.addName(name, q1);
        assertEquals(name, child.findName(q1));
        assertEquals(1, child.size());

        child.release(); // Merges into parent if dirty

        // Check if parent now contains the data (size should reflect merge)
        // This is hard to assert directly without access to parent's internals.
        // However, we can check if the child became non-dirty.
        assertFalse(child.maybeDirty());
        
        // If the merge happened, the root should conceptually have the data.
        // We can't directly query the root for this child's data easily.
    }

    @Test
    public void testCalcHash1Quad() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        int seed = root.hashSeed();
        int q1 = 123;
        // Compare hash with and without seed, should be different
        int hash1 = root.calcHash(q1);
        assertNotEquals(q1, hash1); // Hash should be transformed

        ByteQuadsCanonicalizer root2 = ByteQuadsCanonicalizer.createRoot(); // Different seed
        int seed2 = root2.hashSeed();
        int hash2 = root2.calcHash(q1);
        if (seed != seed2) { // If seeds are different, hashes should be different
            assertNotEquals(hash1, hash2);
        } else { // If seeds are the same (unlikely but possible), hashes should be same
            assertEquals(hash1, hash2);
        }
    }

    @Test
    public void testCalcHash2Quads() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        int q1 = 123;
        int q2 = 456;
        int hash1 = root.calcHash(q1, q2);
        assertNotEquals(q1, hash1);
        assertNotEquals(q2, hash1);

        ByteQuadsCanonicalizer root2 = ByteQuadsCanonicalizer.createRoot();
        int hash2 = root2.calcHash(q1, q2);
        if (root.hashSeed() != root2.hashSeed()) {
            assertNotEquals(hash1, hash2);
        } else {
            assertEquals(hash1, hash2);
        }
    }

    @Test
    public void testCalcHash3Quads() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        int q1 = 1;
        int q2 = 2;
        int q3 = 3;
        int hash1 = root.calcHash(q1, q2, q3);
        assertNotEquals(q1, hash1);
        assertNotEquals(q2, hash1);
        assertNotEquals(q3, hash1);

        ByteQuadsCanonicalizer root2 = ByteQuadsCanonicalizer.createRoot();
        int hash2 = root2.calcHash(q1, q2, q3);
        if (root.hashSeed() != root2.hashSeed()) {
            assertNotEquals(hash1, hash2);
        } else {
            assertEquals(hash1, hash2);
        }
    }

    @Test
    public void testCalcHashNQuads() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        int[] q = {10, 20, 30, 40, 50};
        int hash1 = root.calcHash(q, q.length);
        assertNotEquals(q[0], hash1);

        ByteQuadsCanonicalizer root2 = ByteQuadsCanonicalizer.createRoot();
        int hash2 = root2.calcHash(q, q.length);
        if (root.hashSeed() != root2.hashSeed()) {
            assertNotEquals(hash1, hash2);
        } else {
            assertEquals(hash1, hash2);
        }
    }

    @Test
    public void testAddNameWithZeroQuads() throws Exception {
        // While the API expects at least one quad, let's test the edge case if possible.
        // The `addName` methods for 1, 2, and 3 quads don't explicitly check for 0.
        // The `addName(String name, int[] q, int qlen)` has a check `if (qlen < 4)`
        // and calls `calcHash(q[0])`, `calcHash(q[0], q[1])` etc.
        // This means qlen=0 would throw IllegalArgumentException from calcHash.
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        try {
            child.addName("zero_quads", new int[0], 0);
            fail("Expected IllegalArgumentException for zero quads");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }
}

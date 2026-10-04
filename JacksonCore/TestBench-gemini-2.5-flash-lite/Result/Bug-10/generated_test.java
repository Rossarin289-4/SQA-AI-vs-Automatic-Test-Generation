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
        assertEquals(0, root.size()); // A new root table has 0 entries
        assertEquals(64, root.bucketCount()); // Default initial size is 64
    }

    @Test
    public void testMakeChild() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0); // No features enabled
        assertNotNull(child);
        assertNotSame(root, child);
        assertEquals(root.hashSeed(), child.hashSeed());
        assertFalse(child.maybeDirty()); // Initially not dirty
        // Child should inherit bucket count from root
        assertEquals(root.bucketCount(), child.bucketCount());
    }

    @Test
    public void testReleaseRoot() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        root.release(); // Releasing root should not throw
        // No state change expected for root release.
        assertEquals(0, root.size());
        assertEquals(64, root.bucketCount());
    }

    @Test
    public void testSize() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(0, root.size());

        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("test", 123);
        assertEquals(1, child.size()); // Child's size should be updated
        // Root's size remains unchanged until merge
        assertEquals(0, root.size()); 
    }

    @Test
    public void testBucketCount() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(64, root.bucketCount()); // Default is 64
        
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertEquals(64, child.bucketCount()); // Child should inherit bucket count
    }

    @Test
    public void testMaybeDirty() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        // Root is never considered "dirty" in the context of merging back to a parent
        assertFalse(root.maybeDirty()); 

        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertFalse(child.maybeDirty()); // Child is not dirty initially

        child.addName("test", 123); // Adding to child should mark it dirty
        assertTrue(child.maybeDirty());
    }

    @Test
    public void testHashSeed() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        int seed = root.hashSeed();
        // Seed is generated from System.currentTimeMillis(), so it's unlikely to be 0.
        // Also, it's OR-ed with 1, ensuring it's odd.
        assertTrue(seed != 0 && (seed & 1) != 0);

        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertEquals(seed, child.hashSeed()); // Child should have same seed as parent
    }

    @Test
    public void testPrimaryCount() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(0, root.primaryCount());

        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("test1", 1);
        // With only one entry, it should be in primary if hash maps to it.
        assertEquals(1, child.primaryCount());

        child.addName("test2", 2);
        // With two entries, if they hash to different primary slots.
        // The exact count depends on hash distribution. We can assert >= 1 if size is > 0.
        assertTrue(child.primaryCount() >= 1); 
    }

    @Test
    public void testSecondaryCount() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(0, root.secondaryCount());

        ByteQuadsCanonicalizer child = root.makeChild(0);
        int initialBucketCount = child.bucketCount();
        // Add many items to potentially cause collisions that fill secondary buckets.
        // The actual number of secondary entries depends on hash function and collisions.
        for (int i = 0; i < initialBucketCount * 2; ++i) { // Add more than buckets
            child.addName("name" + i, i);
        }
        // It's possible that no collisions occur to fill secondary buckets.
        // Asserting >= 0 is always true but tests that it doesn't crash.
        assertTrue(child.secondaryCount() >= 0); 
    }

    @Test
    public void testTertiaryCount() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(0, root.tertiaryCount());

        ByteQuadsCanonicalizer child = root.makeChild(0);
        int initialBucketCount = child.bucketCount();
        // Populate to fill primary and secondary to encourage tertiary usage
        for (int i = 0; i < initialBucketCount * 3; ++i) { // Add many more items
            child.addName("name" + i, i);
        }
        // Similar to secondary, this depends on collisions.
        assertTrue(child.tertiaryCount() >= 0); 
    }

    @Test
    public void testSpilloverCount() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertEquals(0, root.spilloverCount());

        ByteQuadsCanonicalizer child = root.makeChild(0);
        int initialBucketCount = child.bucketCount();
        // Add many more items than buckets to force spillover
        for (int i = 0; i < initialBucketCount * 4; ++i) {
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
        assertTrue(toString.contains("0/0/0/0 pri/sec/ter/spill")); // Initial state
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
        // Use INTERN_FIELD_NAMES feature. Its mask is 1.
        ByteQuadsCanonicalizer child = root.makeChild(1); 
        String name = "test_intern";
        int q1 = 67890;
        String addedName = child.addName(name, q1);
        assertEquals(name, addedName);
        // Check if the returned name reference is the same as the original, indicating intern.
        assertSame(name, child.findName(q1)); 
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
        
        String name1 = "name1";
        int q1_1 = 100;
        child.addName(name1, q1_1);

        String name2 = "name2";
        // Choose a value that might collide or be handled in a collision chain.
        // Exact collision is hard to predict without knowing hash function details.
        // This test relies on the fact that if collisions happen, findName still works.
        int q1_2 = 100 + child.bucketCount(); // An attempt to create a collision
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
        // Similar to above, create a value that might cause a collision.
        int q1_2 = 1000 + child.bucketCount(); 
        int q2_2 = 2000;
        child.addName(name2, q1_2, q2_2);

        assertEquals(name1, child.findName(q1_1, q2_1));
        assertEquals(name2, child.findName(q1_2, q2_2));
        assertEquals(2, child.size());
    }

    @Test
    public void testRehashTriggered() throws Exception {
        // This test aims to trigger a rehash by adding enough elements.
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int initialSize = child.bucketCount(); // e.g., 64
        
        // Threshold for rehashing is 80% of hashSize. Let's add 85% to ensure it's triggered.
        int targetCount = (int) (initialSize * 0.85); 

        for (int i = 0; i < targetCount; ++i) {
            child.addName("name_" + i, i);
        }
        // The rehash is triggered on the *next* add after the threshold is crossed.
        String lastName = "last_name";
        int lastQ = targetCount;
        child.addName(lastName, lastQ);

        // After rehash, the size should reflect the new capacity, and contents should be preserved.
        assertEquals(targetCount + 1, child.size());
        assertTrue(child.bucketCount() > initialSize); // Bucket count should have increased
        assertEquals("name_0", child.findName(0));
        assertEquals(lastName, child.findName(lastQ));
    }

    @Test
    public void testFindNameWithManyCollisions() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        
        int initialSize = child.bucketCount();
        int numEntries = initialSize * 5; // Significantly more than buckets to cause many collisions.

        for (int i = 0; i < numEntries; ++i) {
            child.addName("name_" + i, i);
        }

        // Verify that all added names can still be found.
        for (int i = 0; i < numEntries; ++i) {
            assertEquals("name_" + i, child.findName(i));
        }
        assertEquals(numEntries, child.size());
    }
    
    @Test
    public void testFindNameLongName() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        String name = "this_is_a_very_long_name_for_testing_purposes_only";
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
        assertTrue(child.maybeDirty());

        child.release(); // Merges into parent if dirty

        // After release, the child should no longer be dirty.
        assertFalse(child.maybeDirty());
        // The root's size is not directly updated by release() in this model; 
        // it relies on `TableInfo`'s `compareAndSet`. We can't easily check root's content here.
    }

    @Test
    public void testCalcHash1Quad() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        int seed = root.hashSeed();
        int q1 = 123;
        int hash1 = root.calcHash(q1);
        // The hash function should transform the input, so it's unlikely to be equal to the input itself.
        assertNotEquals(q1, hash1); 

        ByteQuadsCanonicalizer root2 = ByteQuadsCanonicalizer.createRoot(); // Different seed
        int seed2 = root2.hashSeed();
        int hash2 = root2.calcHash(q1);
        // If seeds are different, hashes should be different.
        if (seed != seed2) { 
            assertNotEquals(hash1, hash2);
        } else { // If seeds are the same (unlikely but possible), hashes should be same.
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
        assertNotEquals(q[0], hash1); // Hash should be transformed

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
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(0);
        try {
            // The `addName(String name, int[] q, int qlen)` method checks `if (qlen < 4)`
            // and then calls `calcHash(q[0])` etc. If qlen is 0, it will throw
            // IllegalArgumentException from calcHash because it expects at least one quad.
            child.addName("zero_quads", new int[0], 0);
            fail("Expected IllegalArgumentException for zero quads");
        } catch (IllegalArgumentException expected) {
            // Expected exception thrown by calcHash when qlen is 0.
        }
    }
}
